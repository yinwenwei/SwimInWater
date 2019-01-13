package com.yyl.web;


import java.util.List;

import javax.annotation.Resource;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yyl.api.ModelApiImpl;
import com.yyl.entity.Scenicspot;
import com.yyl.entity.User;

/**
 * 
* @ClassName: IndexController
* @Description: 首页相关
* @author lkw
* @date 2019年1月10日 上午10:33:41
* org.apache.tomcat.maven:tomcat7-maven-plugin:2.2:run
* 注解
* https://blog.csdn.net/java_yes/article/details/79183804
 */
@Api(value="显示控制器", tags={"首页相关"})
@Controller
public class IndexController {
	private Logger logger = LoggerFactory.getLogger(IndexController.class);
	@Resource
	private ModelApiImpl modelApi;
	
	@ApiOperation(value="请求首页", notes="根据业务获取数据")
	@RequestMapping(value = "/index", method=RequestMethod.GET)
	public String index(Model model,String id){
		
		logger.info("接收请求,参数:{}", id);
		
		List<Scenicspot> scenicspotAll = modelApi.getScenicareaApi().findScenicspotAll();
	
		logger.info("处理请求,结果:{}", "");
		
		model.addAttribute("scenicspotAll", scenicspotAll);
		return "frontend/index";	
	}
	
	
	
}
