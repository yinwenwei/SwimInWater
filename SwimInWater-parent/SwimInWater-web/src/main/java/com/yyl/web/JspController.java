package com.yyl.web;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
* @ClassName: JspController
* @Description: 跳转jsp
* @author lkw
* @date 2019年1月11日 上午8:38:33
*
 */
@Api(value="页面控制器", tags={"页面跳转请求"})
@Controller
public class JspController {
	
	private Logger logger = LoggerFactory.getLogger(JspController.class);
	
	@ApiOperation(value="请求国内游页面",notes="查询所有国内游的景点,分页显示")
	@RequestMapping(value = "/Domestic_tourism", method=RequestMethod.GET)
	public String domesticTourism(){
		logger.info("接收到请求,参数:{}", "");
		// TODO domesticTourism():获取需要数据,返回相应页面
		logger.info("处理请求,结果:{}", "hehe");
		return "frontend/Domestic_tourism";	
	}
	
	@ApiOperation(value="请求酒店页面", notes="查询全部酒店,分页显示")
	@RequestMapping(value = "/Hotel", method=RequestMethod.GET)
	public String hotel(){
		logger.info("接收到请求,参数:{}", "");
		// TODO hotel():获取需要数据,返回相应页面
		logger.info("处理请求,结果:{}", "");
		return "/frontend/Hotel";	
	}
	
	@ApiOperation(value="请求香港车票页面", notes="查询全部香港车票")
	@RequestMapping(value = "/Hongkong_ticket", method=RequestMethod.GET)
	public String hongkongTicket(){
		logger.info("接收到请求,参数:{}", "");
		// TODO hongkongTicket():获取需要数据,返回相应页面
		logger.info("处理请求,结果:{}", "");
		return "/frontend/Hongkong_ticket";	
	}
	
	@ApiOperation(value="请求出境游页面", notes="查询全部出境游景点")
	@RequestMapping(value = "/Outbound_travel", method=RequestMethod.GET)
	public String outboundTravel(){
		logger.info("接收到请求,参数:{}", "");
		// TODO outboundTravel():获取需要数据,返回相应页面
		logger.info("处理请求,结果:{}", "");
		return "/frontend/Outbound_travel";	
	}
	
	@ApiOperation(value="请求出境游页面", notes="查询全部港澳游景点")
	@RequestMapping(value = "/Hong_Kong_and_Macao_travel", method=RequestMethod.GET)
	public String hongKongAndMacaoTravel(){
		logger.info("接收到请求,参数:{}", "");
		// TODO hongKongAndMacaoTravel():获取需要数据,返回相应页面
		logger.info("处理请求,结果:{}", "");
		return "/frontend/Hong_Kong_and_Macao_travel";	
	}
	
	@ApiOperation(value="请求抱团定制页面", notes="显示抱团定制页面")
	@RequestMapping(value = "/Mass_customization", method=RequestMethod.GET)
	public String massCustomization(){
		logger.info("接收到请求,参数:{}", "");
		// TODO massCustomization():获取需要数据,返回相应页面
		logger.info("处理请求,结果:{}", "");
		return "/frontend/Mass_customization";	
	}
	
	@ApiOperation(value="请求全球自由行页面", notes="查询全球自由行景点")
	@RequestMapping(value = "/Global_Free_Travel", method=RequestMethod.GET)
	public String globalFreeTravel(){
		logger.info("接收到请求,参数:{}", "");
		// TODO globalFreeTravel():获取需要数据,返回相应页面
		logger.info("处理请求,结果:{}", "");
		return "/frontend/Global_Free_Travel";	
	}
	
	@ApiOperation(value="请求收藏排行榜页面", notes="查询收藏排行榜")
	@RequestMapping(value = "/favoriterank", method=RequestMethod.GET)
	public String favoriterank(){
		logger.info("接收到请求,参数:{}", "");
		// TODO favoriterank():获取需要数据,返回相应页面
		logger.info("处理请求,结果:{}", "");
		return "/frontend/favoriterank";	
	}
	
}
