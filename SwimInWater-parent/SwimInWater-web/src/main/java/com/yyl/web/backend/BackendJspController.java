package com.yyl.web.backend;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import java.io.File;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import com.yyl.api.ModelApi;
import com.yyl.entity.Dictionary;
import com.yyl.entity.Hotel;
import com.yyl.entity.Line;
import com.yyl.entity.Picture;
import com.yyl.entity.Scenicspot;
import com.yyl.util.Constants;


@Api(value="后台管理控制器", tags={"后台管理相关"})
@Controller
@RequestMapping(value="/dev/flatform/user")
public class BackendJspController {
	@Resource
	private ModelApi modelApi;
	
	private Logger logger = LoggerFactory.getLogger(BackendJspController.class);
	
	@ApiOperation(value="请求景点管理页面",notes="景点管理信息")
	@RequestMapping(value="/scenicspotlist",method=RequestMethod.GET)
	public String scenicspotlist(Model model){
		logger.info("接收到请求");
		List<Scenicspot> findScenicspotAll = modelApi.getScenicareaApi().findScenicspotAll();
		
		model.addAttribute("scenicspotList", findScenicspotAll);
		// TODO domesticTourism():获取需要数据,返回相应页面
		logger.info("处理请求,结果:{}",findScenicspotAll);
		return "/backend/scenicspotlist";
	}
	
	@ApiOperation(value="请求添加景点页面",notes="添加景点信息")
	@RequestMapping(value="/addScenicspotlist",method=RequestMethod.GET)
	public String addScenicspotlist(Model model){
		logger.info("接收到请求");
		//查询状态
		List<Dictionary> findDictionary = modelApi.getScenicareaApi().findDictionary(Constants.SYS_RELEASE_STARUS);
		model.addAttribute("findDictionary", findDictionary);
		//查询酒店等级
		List<Dictionary> findDictionary2 = modelApi.getScenicareaApi().findDictionary(Constants.SYS_HOTEL_RATING);
		model.addAttribute("findDictionary2", findDictionary2);
		//查询所属地区
		List<Dictionary> findDictionary3 = modelApi.getScenicareaApi().findDictionary(Constants.SYS_SCENIS_REGION);
		model.addAttribute("findDictionary3", findDictionary3);
		
		logger.info("处理请求");
		return "/backend/addScenicspotlist";
	}
	
	@ApiImplicitParams({
		@ApiImplicitParam(name = "scenicspot", value = "景点对象", paramType = "query"),
		@ApiImplicitParam(name = "hotel", value = "酒店对象", paramType = "query"),
		@ApiImplicitParam(name = "line", value = "线路对象", paramType = "query"),
		@ApiImplicitParam(name = "sPics", value = "景点图片数组对象", paramType = "query"),
		@ApiImplicitParam(name = "hPics", value = "酒店图片数组对象", paramType = "query")
		})
	@ApiOperation(value="请求添加成功页面",notes="添加成功信息")
	@RequestMapping(value="/doAdd",method=RequestMethod.POST)
	public String doAdd(Scenicspot scenicspot, Hotel hotel, Line line,
			@RequestParam("spic") MultipartFile[] sPics, @RequestParam("hpic") MultipartFile[] hPics, 
			Model model, HttpServletRequest request){
		logger.info("接收到请求,参数,景点:{}, \n酒店:{}, \n线路:{}, \n景点图片:{},\n酒店图片:{}",
				scenicspot, hotel, line, sPics, hPics);
		// 优化参数 :封装景点/酒店/线路 	上传多个图片集合:景点图片/酒店图片
		// 数据校验
		checkParams(scenicspot, hotel, line);
		// 设置默认值:发布时间
		setDefault(scenicspot);
		
		// 文件上传 
		// TODO 1.文件重名	2.图片类型从数据字典查询
		String rootPath = request.getServletContext().getRealPath("/");
		List<Picture> sPicList = new ArrayList<>();
		List<Picture> hPicList = new ArrayList<>();
		String relativePath = "\\statics\\uploadfiles\\";
		 String fullPath = rootPath + relativePath;
		if(sPics!=null&&sPics.length>0){  
            for(int i = 0;i<sPics.length;i++){  
            	if(sPics[i].getOriginalFilename() != null && !sPics[i].getOriginalFilename().equals("")){
	                MultipartFile file = sPics[i];  
	                Picture pic = new Picture("2", relativePath, fullPath);
	                System.out.println(fullPath);
	                sPicList.add(pic);
	                saveFile(file, fullPath);  
            	}
            }  
        }
		if(hPics!=null&&hPics.length>0){  
            for(int i = 0;i<hPics.length;i++){  
            	if(hPics[i].getOriginalFilename() != null && !hPics[i].getOriginalFilename().equals("")){
	                MultipartFile file = hPics[i];  
	                Picture pic = new Picture("3", relativePath, fullPath);
	                hPicList.add(pic);
	                saveFile(file, fullPath);  
                }
            }  
        }

		// 业务实现:实现添加景点获取景点id,添加酒店和线路,添加图片
		Integer result = modelApi.getManagerApi().addScenicspot(scenicspot , hotel, line, sPicList, hPicList);
		
		logger.info("处理请求,结果:{}",result > 0 ? "添加成功" : "添加失败");
		return "redirect:/dev/flatform/user/scenicspotlist.action";
	}
	
	
	/**
	 * 保存文件
	 * @Title: saveFile
	 * @param @param file
	 * @param @param path
	 * @return boolean    返回类型
	 * @throws
	 */
    private boolean saveFile(MultipartFile file, String path) {  
        // 判断文件是否为空  
        if (!file.isEmpty()) {  
            try {  
                File filepath = new File(path);
                if (!filepath.exists()) 
                    filepath.mkdirs();
                // 文件保存路径  
                String savePath = path + file.getOriginalFilename();  
                // 转存文件  
                file.transferTo(new File(savePath));  
                return true;  
            } catch (Exception e) {  
                e.printStackTrace();  
            }  
        }  
        return false;  
    }  


	private void setDefault(Scenicspot scenicspot) {
		if(scenicspot.getSPubTime() == null){
			scenicspot.setSPubTime(new Timestamp(System.currentTimeMillis()));
		}
	}

	private void checkParams(Scenicspot scenicspot, Hotel hotel, Line line) {
		Assert.notNull(scenicspot.getSName(), "景点标题不能为空");
		Assert.notNull(scenicspot.getSCity(), "景点所属城市不能为空");
		Assert.notNull(scenicspot.getSPrice(), "景点价格不能为空");
		
		Assert.notNull(hotel.gethName(), "酒店名称不能为空");
		Assert.notNull(hotel.gethPrice(), "酒店价格不能为空");
		
		Assert.notNull(line.getLName(), "线路名称不能为空");
	}

	@ApiOperation(value="请求用户信息页面",notes="管理用户信息")
	@RequestMapping(value="/applist",method=RequestMethod.GET)
	public String applist(){
		logger.info("接收到请求");
		// TODO domesticTourism():获取需要数据,返回相应页面
		logger.info("处理请求");
		return "/backend/applist";
	}
	
	@ApiOperation(value="请求添加用户页面",notes="对用户进行添加")
	@RequestMapping(value="/appcheck",method=RequestMethod.GET)
	public String appcheck(){
		logger.info("接收到请求");
		// TODO domesticTourism():获取需要数据,返回相应页面
		logger.info("处理请求");
		return "/backend/appcheck";
	}
	
	
	
	
	

}
