package com.yyl.web.frontend;

import com.yyl.api.ModelApi;
import com.yyl.entity.*;
import com.yyl.util.Constants;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Api(value="景点访问控制器", tags={"景点相关"})
@Controller
@RequestMapping("/scenicarea")
public class ScenicareaController {
	private Logger logger = LoggerFactory.getLogger(ScenicareaController.class);
	@Resource
	private ModelApi modelApi;
	
	@SuppressWarnings("unchecked")
	@ApiOperation(value="请求景点详情页面", notes="根据景点id查询景点详情")
	@ApiImplicitParam(name = "id", value = "景点编号", required = true, paramType = "query")
	@RequestMapping(value = "/scenicareaInfo", method = RequestMethod.GET)
	public String queryScenicareaInfoById(Model model, Integer id){
		logger.info("接收请求,查询景点详情,参数,id:{}", id);


		// 查询景点详细信息
		Map<String, Object> map = modelApi.getScenicareaApi().getScenicspotById(id);
		// 景点详情,路线详情,酒店详情,景点图片,酒店图片
		Scenicspot scenicspot= (Scenicspot) map.get(Constants.MAP_SCEN);
		List<Line> lineList = (List<Line>) map.get(Constants.MAP_LINE);
		List<Hotel> hotelList = (List<Hotel>) map.get(Constants.MAP_HOTEL);
		List<Picture> scenPicList = (List<Picture>) map.get(Constants.PIC_SCEN);
		List<Picture> hotelPicList = (List<Picture>) map.get(Constants.PIC_HOTEL);

		for (Hotel hotel : hotelList) {
			if(hotel.getpRelativePath() == null){
				for (Picture picture : hotelPicList) {
					if(hotel.getId().equals(picture.getPTypeId())){
						hotel.setpRelativePath(picture.getPRelativePath());
					}
				}
			}
		}
		// 根据景点id获取范围:>国内游,境外游,港澳游
		Integer regionId = scenicspot.getsRegion();
		String scenicspotRegoin = modelApi.getEnumsApi().getScenicspotRegoin(regionId);

		// 景点详情,路线详情,酒店详情,景点图片 TODO 页面线路待完善
		model.addAttribute("contentName", scenicspotRegoin);
		model.addAttribute("scenicspot", scenicspot);
		model.addAttribute("lineList", lineList);
		model.addAttribute("hotelList", hotelList);
		model.addAttribute("scenPicList", scenPicList);
		logger.info("处理请求,查询景点详情,结果,\n范围:{},\n景点信息:{},\n线路信息:{},\n酒店信息:{},\n景点图片:{}",
				scenicspotRegoin, scenicspot, lineList, hotelList, scenPicList);
		return "frontend/route_detail";
	}
	/*
		详情页面
		0.1 进入详情页面,根据订单查询酒店

		1.确认是否登录
		2.没有登录提示登录
		3.登录成功返回前往订单页面
	 */



}
