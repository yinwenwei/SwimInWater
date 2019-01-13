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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yyl.api.ModelApiImpl;
import com.yyl.api.comment.CommentApi;
import com.yyl.entity.Comment;

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
	@ApiImplicitParams({
		@ApiImplicitParam(name="param1",value="参数1",required=false, paramType="query"),
		@ApiImplicitParam(name="param2",value="参数2",required=false, paramType="query"),
		@ApiImplicitParam(name="param3",value="参数3",required=false, paramType="query"),
		@ApiImplicitParam(name="param4",value="参数4",required=false, paramType="query")
	})
	@RequestMapping(value = "/index", method=RequestMethod.GET)
	public String index(Integer param1,Integer param2,
						Integer param3,Integer param4){
		logger.info("接收到请求,参数param1:{},param2:{},param3:{},param4:{}", param1,param2,param3,param4);

		return "frontend/index";	
	}
	
	
	
}
