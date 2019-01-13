package com.yyl.web;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import com.yyl.api.ModelApiImpl;
import com.yyl.api.comment.CommentApi;
import com.yyl.entity.Comment;
import com.yyl.entity.Hotel;
import com.yyl.entity.Line;
import com.yyl.entity.Picture;
import com.yyl.entity.Scenicspot;
import com.yyl.util.Constants;

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
	//获取redis实例
	@Resource
	private JedisPool jedisPool;
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
	public String index(Model model){
		logger.info("接收到请求,参数param1:{},param2:{},param3:{},param4:{}");
		
		//根据景点id查询景点详情
		Map<String, Object> scenMap = modelApi.getScenicareaApi().getScenicspotById(1);
		//景点信息
		Scenicspot scenicspot = (Scenicspot) scenMap.get(Constants.MAP_SCEN);
		//酒店信息
		List<Hotel> hotelList = (List<Hotel>)scenMap.get(Constants.MAP_HOTEL);
		//路线信息
		List<Line> lineList = (List<Line>) scenMap.get(Constants.MAP_LINE);
		//景点图片
		List<Picture> ScenPicList = (List<Picture>) scenMap.get(Constants.PIC_SCEN);
		//酒店图片
		List<Picture> HotelPicList = (List<Picture>) scenMap.get(Constants.PIC_HOTEL);
		
		System.out.println("景点名称:"+scenicspot.getSName());
		List<Line> findLine = modelApi.getScenicareaApi().findLine("昆明->大理->玉龙雪山");
		for (Line line : findLine) {
			System.out.println("路线名称:"+line.getLName());
		}
		for (Picture picture : HotelPicList) {
			System.out.println("酒店图片:"+picture.getId());
		}
		
		
		List<Comment> queryComment = modelApi.getCommentApi().queryComment("");
		logger.info("处理请求,结果:{}",queryComment.toString());
		return "frontend/index";	
	}

	
	
}
