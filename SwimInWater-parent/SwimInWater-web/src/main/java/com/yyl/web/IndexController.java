package com.yyl.web;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yyl.api.ModelApiImpl;
import com.yyl.entity.Scenicspot;

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
	/** 热门游 */
	private static final String HOT_SCENICAREA = "hotScenicarea";
	/** 最新游 */
	private static final String NEW_SCENICAREA = "newScenicarea";
	/** 主题游 */
	private static final String THEME_SCENICAREA = "themeScenicarea";
	/** 国内游 */
	private static final String DOMESTIC_SCENICAREA = "domesticScenicarea";
	/** 境外游 */
	private static final String FOREIGN_SCENICAREA = "foreignScenicarea";
	@Resource
	private ModelApiImpl modelApi;
	
	@ApiOperation(value="请求首页", notes="根据业务获取数据")
	@RequestMapping(value = "/index", method=RequestMethod.GET)
	public String index(Model model){
		logger.info("接收请求");
		// 查询所以景点:人气游就是热门, 最新游按时间排序,主题游%$^#@^%
		
		// 国内游:sRegion:1,2
		// 境外游:sRegion:3	
		List<Scenicspot> hotScenicarea = null;
		List<Scenicspot> newScenicarea = null;
		List<Scenicspot> themeScenicarea = null;
		List<Scenicspot> domesticScenicarea = null;
		List<Scenicspot> foreignScenicarea = null;
		
		model.addAttribute(HOT_SCENICAREA, hotScenicarea);
		model.addAttribute(NEW_SCENICAREA, newScenicarea);
		model.addAttribute(THEME_SCENICAREA, themeScenicarea);
		model.addAttribute(DOMESTIC_SCENICAREA, domesticScenicarea);
		model.addAttribute(FOREIGN_SCENICAREA, foreignScenicarea);
		logger.info("处理请求,结果:{}", "");
		return "frontend/index";	
	}
	
	
	
}
