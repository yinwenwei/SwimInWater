package com.yyl.web.frontend;

import java.util.List;
import java.util.Map;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yyl.api.ModelApi;
import com.yyl.entity.Hotel;
import com.yyl.entity.Line;
import com.yyl.entity.Picture;
import com.yyl.entity.Scenicspot;
import com.yyl.util.Constants;
import com.yyl.util.EncodingTool;

@Api(value="景点访问控制器", tags={"景点相关"})
@Controller
@RequestMapping("/scenicarea")
public class ScenicareaController {
	private Logger logger = LoggerFactory.getLogger(ScenicareaController.class);
	@Resource
	private ModelApi modelApi;
	
	@ApiOperation(value="请求景点详情页面", notes="根据景点id查询景点详情")
	@ApiImplicitParam(name = "id", value = "景点编号", required = true, paramType = "query")
	@RequestMapping(value = "/scenicareaInfo", method = RequestMethod.GET)
	public String queryScenicareaInfoById(Model model, Integer id,String contentName){
		logger.info("接收请求,参数:{}", id);
		// 查询景点详细信息
		System.out.println("进入");
		Map<String, Object> map = modelApi.getScenicareaApi().getScenicspotById(id);
		//景点详情
		Scenicspot scenicspot= (Scenicspot) map.get(Constants.MAP_SCEN);
		//路线详情
		List<Line> lineList = (List<Line>) map.get(Constants.MAP_LINE);
		//酒店详情
		List<Hotel> hotelList = (List<Hotel>) map.get(Constants.MAP_HOTEL);
		//景点图片
		List<Picture> scenPicList = (List<Picture>) map.get(Constants.PIC_SCEN);
		//酒店图片
		List<Picture> hotelPicList = (List<Picture>) map.get(Constants.PIC_HOTEL);
		
		//根据景点id查询景点信息
		System.out.println("景点名称:"+scenicspot.getsName()+"景点内容:"+scenicspot.getsContent()+"景点价格:"+scenicspot.getsPrice());
		//路线
		for (Line line : lineList) {
			System.out.println("路线名称:"+line.getLName()+"路线内容:"+line.getLContent());
		}
		//酒店
		for (Hotel hotel : hotelList) {
			System.out.println("酒店名称:"+hotel.gethName()+"酒店价格:"+hotel.gethPrice());
		}
		for (Picture picture : scenPicList) {
			System.out.println("景点id:"+picture.getPTypeId()+"景点图片:"+picture.getPRelativePath());
		}
		for (Picture picture : hotelPicList) {
			System.out.println("酒店id:"+picture.getPTypeId()+"酒店图片:"+picture.getPRelativePath());
		}
	
		model.addAttribute("contentName", EncodingTool.encodeStr(contentName));//所在区域
		model.addAttribute("scenicspot", scenicspot);//景点详情
		model.addAttribute("lineList", lineList);//路线详情
		model.addAttribute("hotelList", hotelList);//酒店详情
		model.addAttribute("scenPicList", scenPicList);//景点图片
		model.addAttribute("hotelPicList", hotelPicList);//酒店图片
		logger.info("处理请求,结果:{}", "");
		return "frontend/route_detail";
	}
	
	
}
