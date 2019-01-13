package com.yyl.web.backend;

import javax.annotation.Resource;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yyl.api.ModelApi;


@Api(value="页面控制器", tags={"页面跳转请求"})
@Controller
@RequestMapping(value="/dev/flatform/user")
public class BackendJspController {
	@Resource
	private ModelApi modelApi;
	
	private Logger logger = LoggerFactory.getLogger(BackendJspController.class);
	
	
	
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
