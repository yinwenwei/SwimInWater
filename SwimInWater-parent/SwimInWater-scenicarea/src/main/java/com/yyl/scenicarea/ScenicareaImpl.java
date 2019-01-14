package com.yyl.scenicarea;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.yyl.api.scenicarea.ScenicareaApi;
import com.yyl.entity.Dictionary;
import com.yyl.entity.Hotel;
import com.yyl.entity.Line;
import com.yyl.entity.Picture;
import com.yyl.entity.Scenicspot;
import com.yyl.scenicarea.service.dictionary.DictionaryQueryService;
import com.yyl.scenicarea.service.hotel.HotelQueryService;
import com.yyl.scenicarea.service.line.LineQueryService;
import com.yyl.scenicarea.service.picture.PictureQueryService;
import com.yyl.scenicarea.service.scenicspot.ScenicspotQueryService;
import com.yyl.util.Constants;
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
		Map<String, Object> scenmap=new HashMap<String, Object>();
		Map<String, Object> hotelmap=new HashMap<String, Object>();
		Map<String, Object> linemap=new HashMap<String, Object>();
		//查询景点详情
		Scenicspot scen = scenicspotQueryService.getScenicspotById(id);
		System.out.println("景点id------------:"+scen.getId());
		//根据景点id查询景点图片
		List<Picture> scenicPictrue = scenicspotQueryService.findScenicspotPictureByPTypeId(scen.getId());
		for (Picture picture : scenicPictrue) {
			System.out.println("业务层----------景点图片信息："+picture.getId());
		}
		
		//根据景点id查询酒店详情
		hotelmap.put("sId", scen.getId());
		List<Hotel> hotel = hotelQueryService.getHotelListByMap(hotelmap);
		Integer hotelId = null;
		for(int i=0;i<hotel.size();i++){
			hotelId=hotel.get(i).getId();
			System.out.println("酒店id:"+hotelId);
		}
		//根据酒店id查询酒店图片
		List<Picture> hotelPictrue = scenicspotQueryService.findScenicspotPictureByPTypeId(hotelId);
		
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
	
	

	
}
