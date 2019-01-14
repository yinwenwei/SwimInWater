package com.yyl.web;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.ArrayList;
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
import com.yyl.util.Constants;
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
import com.yyl.util.JedisClientSingle;
@Api(value="显示控制器", tags={"首页相关"})
@Controller
public class IndexController {
	private Logger logger = LoggerFactory.getLogger(IndexController.class);
	@Resource
	private JedisClientSingle jedisClientSingle;//注入jedis工具类
	
	/** 热门游 */
	private final String HOT_SCENICAREA = "hotScenicarea";
	/** 最新游 */
	private final String NEW_SCENICAREA = "newScenicarea";
	/** 主题游 */
	private final String THEME_SCENICAREA = "themeScenicarea";
	/** 国内游 */
	private final String DOMESTIC_SCENICAREA = "domesticScenicarea";
	/** 港澳 */
	private final String HKANDMACAO_SCENICAREA = "hkAndMacaoScenicarea";
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
		
		/*//查询所有酒店信息
		List<Hotel> findHotelAll = modelApi.getScenicareaApi().findHotelAll();
		for (Hotel hotel : findHotelAll) {
			System.out.println("酒店名称:"+hotel.gethName());
		}
		
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
		System.out.println(jedisClientSingle.keys("*"));*/
		
		// TODO景点添加显示图片字段
		logger.info("接收到请求,主题城市:{}", GetThemCity.themeCity);
	
		List<Scenicspot> hotScenicarea = new ArrayList<>();
		List<Scenicspot> newScenicarea = new ArrayList<>();
		List<Scenicspot> themeScenicarea = new ArrayList<>();
		List<Scenicspot> domesticScenicarea = new ArrayList<>();
		List<Scenicspot> hkAndMacaoScenicarea = new ArrayList<>();
		List<Scenicspot> foreignScenicarea = new ArrayList<>();
		
		List<Scenicspot> findScenicspotAll = modelApi.getScenicareaApi().findScenicspotAll();
		// TODO 读取城市状态和景点区域
		int i = 0;
		for (Scenicspot scenicspot : findScenicspotAll) {
			// 热门游/最新游/主题游 各4个
			if(scenicspot.getSStatus() == Constants.SCENICAREA_STATU_HOT && hotScenicarea.size() < SHOW_COUNT_FOUR){
				hotScenicarea.add(scenicspot);
			}
			if(newScenicarea.size() < SHOW_COUNT_FOUR){
				newScenicarea.add(scenicspot);
			}
			// 主题游 获取相应城市
			if(scenicspot.getSCity().equals(GetThemCity.themeCity) && themeScenicarea.size() < SHOW_COUNT_FOUR){
				themeScenicarea.add(scenicspot);
			}
			// 国内游/港澳游/境外游 各6个
			if(scenicspot.getSRegion().equals(Constants.SCENICAREA_REGOIN_DOMESTIC) && domesticScenicarea.size() < SHOW_COUNT_SIX){
				domesticScenicarea.add(scenicspot);
			}
			if(scenicspot.getSRegion().equals(Constants.SCENICAREA_REGOIN_HKANDMACAO) && hkAndMacaoScenicarea.size() < SHOW_COUNT_SIX){
				hkAndMacaoScenicarea.add(scenicspot);
			}
			if(scenicspot.getSRegion().equals(Constants.SCENICAREA_REGOIN_FOREIGN) && foreignScenicarea.size() < SHOW_COUNT_SIX){
				foreignScenicarea.add(scenicspot);
			}
			if(hotScenicarea.size() == SHOW_COUNT_FOUR && newScenicarea.size() == SHOW_COUNT_FOUR && 
				themeScenicarea.size() == SHOW_COUNT_FOUR && domesticScenicarea.size() == SHOW_COUNT_SIX && 
				hkAndMacaoScenicarea.size() == SHOW_COUNT_SIX && foreignScenicarea.size() == SHOW_COUNT_SIX){
				break;
			}
			i = i + 1;
			logger.info("循环次数:{},热门游:{},最新游:{},主题游:{},国内游:{},港澳游:{},境外游:{}", i,hotScenicarea.size(),
					newScenicarea.size(),themeScenicarea.size(),domesticScenicarea.size(),hkAndMacaoScenicarea.size(),foreignScenicarea.size());
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
	//----------------------------LKW结束------------------------------------------
}


/*//根据景点id查询景点详情
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
}*/

