package com.yyl.web;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

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
	
	@ApiOperation(value="请求首页", notes="根据业务获取数据")
	@RequestMapping(value = "/index", method=RequestMethod.GET)
	public String index(@ApiParam(value="用户编号", required=false) String id){
		/*Comment commentById = commentApi.getCommentById(1);
		System.out.println(commentById.toString());*/
		return "frontend/index";	
	}
	
}
