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
* @ClassName: IndexController
* @Description: 首页相关
* @author lkw
* @date 2019年1月10日 上午10:33:41
* org.apache.tomcat.maven:tomcat7-maven-plugin:2.2:run
 */
@Api(value="显示控制器", tags={"首页相关"})
@Controller
public class IndexController {
	private Logger logger = LoggerFactory.getLogger(IndexController.class);
	
	@ApiOperation(value="请求首页", notes="根据业务获取数据")
	@RequestMapping(value = "/index", method=RequestMethod.GET)
	public String index(Integer param){
		logger.info("接收到请求,参数:{}", param);
		Integer result = param * 2 / 3 + 7;
		logger.info("处理请求,结果:{}", result);
		return "frontend/index";	
	}
}
