package com.yyl.web;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;



import org.apache.commons.lang.StringUtils;
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

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
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
import com.yyl.util.JedisClientSingle;
@Api(value="显示控制器", tags={"首页相关"})
@Controller
public class IndexController {
	private Logger logger = LoggerFactory.getLogger(IndexController.class);
	@Resource
	private JedisClientSingle jedisClientSingle;//注入jedis工具类
	
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
	/** 显示个数4个*/
	private final Integer SHOW_COUNT_FOUR = 4;
	/** 显示个数6个*/
	private final Integer SHOW_COUNT_SIX = 6;
	
	@Resource
	private ModelApiImpl modelApi;
	
	@ApiOperation(value="请求首页", notes="根据业务获取数据")
	@RequestMapping(value = "/index", method=RequestMethod.GET)
	public String index(Model model){
		logger.info("接收到请求,参数param1:{},param2:{},param3:{},param4:{}");
		
		//根据景点id查询景点详情
		Map<String, Object> scenMap = modelApi.getScenicareaApi().getScenicspotById(1);
		//景点信息
		Scenicspot scenicspot1 = (Scenicspot) scenMap.get(Constants.MAP_SCEN);
		//酒店信息
		List<Hotel> hotelList = (List<Hotel>)scenMap.get(Constants.MAP_HOTEL);
		//路线信息
		List<Line> lineList = (List<Line>) scenMap.get(Constants.MAP_LINE);
		//景点图片
		List<Picture> ScenPicList = (List<Picture>) scenMap.get(Constants.PIC_SCEN);
		//酒店图片
		List<Picture> HotelPicList = (List<Picture>) scenMap.get(Constants.PIC_HOTEL);
	
		
		//查询所有酒店信息
		List<Hotel> findHotelAll = modelApi.getScenicareaApi().findHotelAll();
		for (Hotel hotel : findHotelAll) {
			System.out.println("酒店名称:"+hotel.gethName());
		}
		
		
//		Jedis jedis = jedisPool.getResource();
//		
//		String json=JSONObject.toJSONString(findHotelAll);
//		System.out.println("json格式:/n"+json);
//		jedis.rpush("findHotelAll", json.toString());
//		System.out.println("取出jedis所有数据:"+jedis.keys("*"));
//		
//		List<String> str = jedis.lrange("findHotelAll", 0, -1);
		
		//将酒店集合存入hash
		jedisClientSingle.hset("HotelList", "findHotelAll", JSON.toJSON(findHotelAll).toString());
		
		String str= jedisClientSingle.hget("HotelList", "findHotelAll");
		//!判断取出来的数据是否为0或为null
		if(!StringUtils.isBlank(str)){
			List<Hotel> redis_HotelList = JSON.parseArray(str, Hotel.class);
			for (Hotel hotel : redis_HotelList) {
				System.out.println("redis取出的数据:"+hotel.gethName());
			}
		}
		
		System.out.println(jedisClientSingle.keys("*"));
		
		System.out.println("景点名称:"+scenicspot1.getSName());
		List<Line> findLine = modelApi.getScenicareaApi().findLine("昆明->大理->玉龙雪山");
		for (Line line : findLine) {
			System.out.println("路线名称:"+line.getLName());
		}
		for (Picture picture : HotelPicList) {
			System.out.println("酒店图片:"+picture.getId());
		}
		
		
		// 查询所以景点:人气游就是热门, 最新游按时间排序,主题游%$^#@^%
		
		model.addAttribute(HOT_SCENICAREA, hotScenicarea);
		model.addAttribute(NEW_SCENICAREA, newScenicarea);
		model.addAttribute(THEME_SCENICAREA, themeScenicarea);
		model.addAttribute(DOMESTIC_SCENICAREA, domesticScenicarea);
		model.addAttribute(HKANDMACAO_SCENICAREA, hkAndMacaoScenicarea);
		model.addAttribute(FOREIGN_SCENICAREA, foreignScenicarea);
		logger.info("处理请求,结果:{}", findScenicspotAll);
		return "frontend/index";	
	}

	
	
}
