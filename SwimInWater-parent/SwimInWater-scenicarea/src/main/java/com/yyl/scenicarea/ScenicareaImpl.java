package com.yyl.scenicarea;

import com.alibaba.fastjson.JSON;
import com.yyl.api.scenicarea.ScenicareaApi;
import com.yyl.entity.*;
import com.yyl.entity.Dictionary;
import com.yyl.entity.Hotel;
import com.yyl.entity.Line;
import com.yyl.entity.PageBean;
import com.yyl.entity.Picture;
import com.yyl.entity.ScenResult;
import com.yyl.entity.Scenicspot;
import com.yyl.scenicarea.service.dictionary.DictionaryQueryService;
import com.yyl.scenicarea.service.hotel.HotelQueryService;
import com.yyl.scenicarea.service.line.LineQueryService;
import com.yyl.scenicarea.service.picture.PictureQueryService;
import com.yyl.scenicarea.service.scenicspot.ScenicspotQueryService;
import com.yyl.scenicarea.service.sceninfo.ScenInfoService;
import com.yyl.util.Constants;
import com.yyl.util.JedisClientSingle;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Component("scenicareaApi")
public class ScenicareaImpl implements ScenicareaApi {
	//景点业务接口
	@Resource
	private ScenicspotQueryService scenicspotQueryService;
	//数据字典业务接口
	@Resource
	private DictionaryQueryService dictionaryQueryService;
	//酒店业务接口
	@Resource
	private HotelQueryService hotelQueryService;
	//路线业务接口
	@Resource
	private LineQueryService lineQueryService;
	//图片业务接口
	@Resource
	private PictureQueryService pictureQueryService;
	//solr索引接口
	@Resource
	private ScenInfoService scenInfoService;


	//jedis工具类
	@Resource
	JedisClientSingle jedisClientSingle;
	
	/**
	 * 查询所用景点信息
	 */
	@Override
	public List<Scenicspot> findScenicspotAll() {
		return scenicspotQueryService.getScenicspotListByMap(new HashMap<String,Object>());
	}
	
	/**
	 * 查询景点分区
	 */
	@Override
	public List<Dictionary> findScenicRegion() {
		return dictionaryQueryService.getDictionaryListByMap(new HashMap<String,Object>());
	}
	
	/**
	 * 查询所有酒店信息
	 */
	@Override
	public List<Hotel> findHotelAll() {
		return hotelQueryService.getHotelListByMap(new HashMap<String,Object>());
	}
	
	/**
	 * 根据景点名称或景点城市查询
	 */
	@Override
	public List<Scenicspot> findScenicspotBySNameOrSCity(String sName,String sCity) {
		Map<String, Object> map=new HashMap<String,Object>();
		map.put("sName", sName);
		map.put("sCity", sCity);
		return scenicspotQueryService.getScenicspotListByMap(map);
	}
	
	/**
	 * 根据路线名称查询路线信息
	 */
	@Override
	public List<Line> findLine(String lName) {
		Map<String, Object> map=new HashMap<String,Object>();
		map.put("lName", lName);
		return lineQueryService.getLineListByMap(map);
	}
	
	/**
	 * 根据路线名称或价格查询路线信息
	 */
	@Override
	public List<Line> findLineLikeLNameOrSPrice(String lName, Integer sPrice) {
		Map<String, Object> map=new HashMap<String,Object>();
		map.put("lName", lName);
		map.put("sPrice", sPrice);
		return lineQueryService.getLineListByMap(map);
	}
	
	/**
	 * 根据id查询景点详情
	 * 查询酒店图片(SELECT p.id FROM picture p,hotel h WHERE p.pTypeId=h.id AND p.pType=3 AND p.pTypeId=1)
	 */
	@Override
	public Map<String, Object> getScenicspotById(Integer id) {
		//景点集合
		Map<String, Object> scenmap=new HashMap<String, Object>();
		//酒店集合
		Map<String, Object> hotelmap=new HashMap<String, Object>();
		//路线集合
		Map<String, Object> linemap=new HashMap<String, Object>();
		
		//查询景点详情
		Scenicspot scen = scenicspotQueryService.getScenicspotById(id);
		//根据景点id查询景点图片
		List<Picture> scenicPictrue = scenicspotQueryService.findScenicspotPictureByPTypeId(scen.getId());
		/*for (Picture picture : scenicPictrue) {
			System.out.println("业务层----------景点图片信息："+picture.getPTypeId()+"景点图片信息:"+picture.getPRelativePath());
		}*/
		
		//根据景点id查询酒店详情
		hotelmap.put("sId", scen.getId());
		List<Hotel> hotel = hotelQueryService.getHotelListByMap(hotelmap);
		Integer hotelId = null;
		List<Picture> hotelPictrue=null;
		List<Integer> hotelIdList=new ArrayList<Integer>();
		for(int i=0;i<hotel.size();i++){
			hotelId=hotel.get(i).getId();
			hotelIdList.add(hotelId);
		}
		//根据酒店id查询酒店图片
		hotelPictrue = hotelQueryService.findHotelPictureByPTypeId(hotelIdList);
		for (Picture picture : hotelPictrue) {
			System.out.println("业务层-------酒店id:"+picture.getPTypeId()+"酒店图片:"+picture.getPRelativePath());
		}
		
		//根据景点id查询路线详情
		linemap.put("sId", scen.getId());
		List<Line> line = lineQueryService.getLineListByMap(linemap);
		
		scenmap.put(Constants.MAP_SCEN, scen);//景点详情
		scenmap.put(Constants.MAP_HOTEL, hotel);//酒店详情
		scenmap.put(Constants.MAP_LINE, line);//路线详情
		scenmap.put(Constants.PIC_SCEN, scenicPictrue);//景点图片
		scenmap.put(Constants.PIC_HOTEL, hotelPictrue);//酒店图片
		return scenmap;
	}
	
	/**
	 * 根据用户id查询用户头像
	 */
	public Picture findUserPicByPTypeId(Integer pTypeId) {
		return pictureQueryService.findUserPicByPTypeId(pTypeId);
	}

	@Override
	public List<String> findAllCity() {
		return scenicspotQueryService.findAllCity();
	}
	
	/**
	 * 条件查询数据字典
	 */
	@Override
	public List<Dictionary> findDictionary(String dTypeClassification) {
		// TODO Auto-generated method stub
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("dTypeClassification", dTypeClassification);
		return dictionaryQueryService.getDictionaryListByMap(map);
	}
	
	/**
	 * yhh多条件景点查询
	 */
	@Override
	public PageBean<Scenicspot> queryScenicspotPageByMap(String sName,
			String sCity, Integer sStauts, Integer size, Integer cur) {
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("sName", sName);
		map.put("sCity", sCity);
		map.put("sStauts", sStauts);
		// TODO Auto-generated method stub
		PageBean<Scenicspot> queryMap = scenicspotQueryService.queryScenicspotPageByMap(map, size, cur);
		return queryMap;
	}
	
	/**
	 * yww多条件查询景点信息
	 */
	@Override
	public PageBean<Scenicspot> queryScenicspotPageByMap(String sName,
			String sCity, Integer size, Integer cur) {
		// TODO Auto-generated method stub
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("sName", sName);
		map.put("sCity", sCity);
		PageBean<Scenicspot> queryMap = scenicspotQueryService.queryScenicspotPageByMap(map, size, cur);
		return queryMap;
	}
	
	/**
	 * 根据分区查询首页所有景点信息And图片(redis---------)
	 */
	@Override
	public List<Scenicspot> findScenPicAll() {
		String pichget = jedisClientSingle.hget("Redis_ScenPicAll", "scenPicList");
		if(!StringUtils.isBlank(pichget)){
			System.out.println("进入reids查询数据------------->");
			List<Scenicspot> scenicspotList = JSON.parseArray(pichget, Scenicspot.class);
			return scenicspotList;
		}
		System.out.println("进入数据库查询信息--------------->");
		List<Scenicspot> findScenPicAll = scenicspotQueryService.findScenPicAll();
		//将景点详情信息转成JSON格式存储到redis
		jedisClientSingle.hset("Redis_ScenPicAll", "scenPicList", JSON.toJSON(findScenPicAll).toString());
		return findScenPicAll;
	}
	/**
	 * 查询所有信息,分页
	 */
	@Override
	public PageBean<Hotel> queryHotelPageByMap(Integer size, Integer cur) {
		// TODO Auto-generated method stub
		
		return hotelQueryService.queryHotelPageByMap(new HashMap<String,Object>(), size, cur);
	}
	/**
	 * 根据分区查询景点信息
	 */
	@Override
	public PageBean<Scenicspot> findScenicspotBySRegion(Integer sRegion,Integer size, Integer cur) {
		// TODO Auto-generated method stub
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("sRegion", sRegion);
		PageBean<Scenicspot> queryMap = scenicspotQueryService.findScenicspotBySRegion(map, size, cur);
		return queryMap;
	}
	
	/**
	 * 查询景点收藏排行榜(降序排列)
	 */
	@Override
	public List<Scenicspot> findScenCollectionOrderByDesc() {
		// TODO Auto-generated method stub
		
		return scenicspotQueryService.findScenCollectionOrderByDesc();
	}
	
	/**
	 * 人气旅游
	 */
	@Override
	public List<Scenicspot> findPopularTourism() {
		return scenicspotQueryService.findPopularTourism();
	}
	
	/**
	 * 最新旅游(redis)
	 */
	@Override
	public List<Scenicspot> findNewestTourism() {
		//从redis中查询最新旅游信息
		String hget = jedisClientSingle.hget("Redis_newstList", "newestList");
		if(!StringUtils.isBlank(hget)){
			List<Scenicspot> newTourismList = JSON.parseArray(hget, Scenicspot.class);
			return newTourismList;
		}
		//查询最新旅游信息
		List<Scenicspot> newestList = scenicspotQueryService.findNewestTourism();
		jedisClientSingle.hset("Redis_newstList", "newestList", JSON.toJSON(newestList).toString());
		return newestList;
	}
	
	/**
	 * 主题旅游(redis)
	 */
	@Override
	public List<Scenicspot> findThemeTourism(String sCity) {
		//查询redis中是否存在主题旅游信息
		String hget = jedisClientSingle.hget("Redis_themeList", "themeList");
		if(!StringUtils.isBlank(hget)){
			List<Scenicspot> themeTourismList = JSON.parseArray(hget, Scenicspot.class);
			return themeTourismList;
		}
		//查询主题旅游信息(数据库)
		List<Scenicspot> themeList = scenicspotQueryService.findThemeTourism(sCity);
		jedisClientSingle.hset("Redis_themeList", "themeList", JSON.toJSON(themeList).toString());
		return themeList;
	}

	/**
	 * 将景点信息存入solr索引库
	 */
	@Override
	public void importAllScenInfo() {
		scenicspotQueryService.importAllScenInfo();
	}

	/**
	 * 查询solr索引库
	 */
	@Override
	public ScenResult searScenInfo(String queryString, int page, int rows)
			throws Exception {

		return scenInfoService.searScenInfo(queryString, page, rows);
	}

}
