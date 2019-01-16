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
import com.yyl.entity.Dictionary;
import com.yyl.entity.Scenicspot;
import com.yyl.web.quartz.GetThemCity;
/**
 *
* @ClassName: IndexController
* @Description: 首页相关
* @author lkw
* @date 2019年1月10日 上午10:33:41
* org.apache.tomcat.maven:tomcat7-maven-plugin:2.2:run
* 注解
* https://blog.csdn.net/java_yes/article/details/79183804
* http://localhost:8080/SwimInWater-web/swagger-ui.html
 */
@Api(value="显示控制器", tags={"首页相关"})
@Controller
public class IndexController {
	private Logger logger = LoggerFactory.getLogger(IndexController.class);
	@Resource
	private ModelApiImpl modelApi;
	
	@ApiOperation(value="请求首页", notes="根据业务获取数据")
	@RequestMapping(value = "/index", method=RequestMethod.GET)
	public String index(Model model){		
		// TODO景点添加显示图片字段
		logger.info("接收到请求,主题城市:{}", GetThemCity.themeCity);
	
		//-------------------------------------------yww-------------------------------------------------
		List<Dictionary> dictionary_list = modelApi.getScenicareaApi().findDictionary("scenic_Region");
		//根据分区查询景点信息
		List<Scenicspot> findScenPicAll = modelApi.getScenicareaApi().findScenPicAll();
		
		
		model.addAttribute("findScenPicAll", findScenPicAll);//分区后景点信息
		model.addAttribute("dictionary_list", dictionary_list);//分区信息
		
		
		logger.info("处理请求,结果:{}", findScenPicAll);
		return "frontend/index";	
	}
}


