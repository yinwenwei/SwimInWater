package com.yyl.web.backend;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yyl.api.ModelApi;
import com.yyl.entity.Dictionary;
import com.yyl.entity.Scenicspot;
import com.yyl.util.Constants;


@Api(value="页面控制器", tags={"页面跳转请求"})
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
		
		// TODO domesticTourism():获取需要数据,返回相应页面
		logger.info("处理请求");
		return "/backend/addScenicspotlist";
	}
	@ApiOperation(value="请求添加成功页面",notes="添加成功信息")
	@RequestMapping(value="/doAdd",method=RequestMethod.POST)
	public String doAdd(String sName,String sCity,String sRegion,String sContent,Double sPrice,Integer sStatus,
						String hName,String hGrage,Double hPrice,String hContent,String lName,String lContent){
		logger.info("接收到请求");
		System.out.println("------------------"+sName+sCity+sRegion+sContent+sPrice+sStatus+hName+hGrage);
		Scenicspot scenicspot=new Scenicspot();
		scenicspot.setSName(sName);
		scenicspot.setSCity(sCity);
		scenicspot.setSRegion(sRegion);
		scenicspot.setSContent(sContent);
		scenicspot.setSPrice(sPrice);
		scenicspot.setSStatus(sStatus);
		scenicspot.setSCollectionNum(0);
		Date date=new Date();
		Timestamp ts = new Timestamp(date.getTime());
		System.out.println("========================="+ts);
		scenicspot.setSPubTime(ts);
		Integer addScenicspot = modelApi.getManagerApi().addScenicspot(scenicspot);
		
		logger.info("处理请求,结果:{}",scenicspot);
		return null;
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
