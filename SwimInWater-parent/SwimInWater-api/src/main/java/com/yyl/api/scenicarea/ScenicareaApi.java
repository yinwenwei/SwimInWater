package com.yyl.api.scenicarea;

import java.util.List;
import java.util.Map;

import com.yyl.entity.Dictionary;
import com.yyl.entity.Hotel;
import com.yyl.entity.Line;
import com.yyl.entity.PageBean;
import com.yyl.entity.Picture;
import com.yyl.entity.Scenicspot;


/**
 * 景点模块相关
* @ClassName: Scenicarea
* @author yww
* @date 2019年1月9日 下午12:16:42
*
 */
public interface ScenicareaApi {
	/**
	 * 查询景点信息
	 * @Title: findScenicspotAll
	 * @return List<Scenicspot>    返回类型
	 * @throws
	 */
	List<Scenicspot> findScenicspotAll();
	/**
	 * 查询景点分区(dTypeClassification='scenic_Region')
	 * @Title: findScenicRegion
	 * @return List<Dictionary>    返回类型
	 * @throws
	 */
	List<Dictionary> findScenicRegion();
	/**
	 * 根据景点名称或景点城市查询
	 * @Title: findScenicspotBySNameOrSCity
	 * @param @param sName
	 * @param @param sCity
	 * @return List<Scenicspot>    返回类型
	 * @throws
	 */
	List<Scenicspot> findScenicspotBySNameOrSCity(String sName,String sCity);
	/**
	 * 根据路线名称查询路线信息
	 * @Title: findLine
	 * @param @param lName
	 * @return List<Line>    返回类型
	 * @throws
	 */
	List<Line> findLine(String lName);
	/**
	 * 查询酒店信息
	 * @Title: findHotelAll
	 * @return List<Hotel>    返回类型
	 * @throws
	 */
	List<Hotel> findHotelAll(); 
	/**
	 * 多条件搜索(根据线路名称,景点价格)
	 * @Title: findLineLikeLNameOrSPrice
	 * @param @param lName
	 * @param @param sPrice
	 * @return List<Line>    返回类型
	 * @throws
	 */
	List<Line> findLineLikeLNameOrSPrice(String lName,Integer sPrice);
	
	/**
	 * 
	 * @Title: getScenicspotById
	 * @Description: 根据景点id查询景点详细信息
	 * @param @param id
	 * @return Map<String,Object>    返回类型
	 * @throws
	 */
	Map<String, Object> getScenicspotById(Integer id);
	
	/**
	 * 
	 * @Title: findUserPicByPTypeId
	 * @Description: 根据用户id查询用户头像(SELECT p.id,u.uName FROM picture p,`user` u WHERE p.pTypeId=u.id AND p.pType=1 AND p.pTypeId=2)
	 * @param @return    设定文件
	 * @return Picture    返回类型
	 * @throws
	 */
	Picture findUserPicByPTypeId(Integer pTypeId);
	
	/**
	 * 条件查询数据字典信息
	 * @Title: findDictionary
	 * @param @param map
	 * @return List<Dictionary>    返回类型
	 * @throws
	 */
	List<Dictionary> findDictionary(String dTypeClassification);
	
	/**
	 * 多条件查询景点信息(yhh查询)
	 * @Title: queryScenicspotPageByMap
	 * @param @param sName
	 * @param @param sCity
	 * @param @param sStauts
	 * @param @return    设定文件
	 * @return PageBean<Scenicspot>    返回类型
	 * @throws
	 */
	PageBean<Scenicspot> queryScenicspotPageByMap(String sName,String sCity,Integer sStauts,Integer size,Integer cur);
	
	/**
	 * 多条件查询景点信息(yww查询)
	 * @Title: queryScenicspotPageByMap
	 * @param @param sName
	 * @param @param sCity
	 * @param @return    设定文件
	 * @return PageBean<Scenicspot>    返回类型
	 * @throws
	 */
	PageBean<Scenicspot> queryScenicspotPageByMap(String sName,String sCity,Integer size,Integer cur);
	
	/**
	 * 查询所有城市
	 * @Title: findAllCity
	 * @return List<String>    返回类型
	 * @throws
	 */
	List<String> findAllCity();
	
	
	/**
	 * 根据分区查询首页所有景点信息And图片
	 * @Title: findScenPicAll
	 * @return List<Scenicspot>    返回类型
	 * @throws
	 */
	List<Scenicspot> findScenPicAll();
	/**
	 * 酒店分页
	 * @Title: queryHotelPageByMap
	 * @param @param size
	 * @param @param cur
	 * @return PageBean<Hotel>    返回类型
	 * @throws
	 */
	PageBean<Hotel> queryHotelPageByMap(Integer size,Integer cur);
	
	/**
	 * 根据分区查询景点信息
	 * @Title: findScenicspotBySRegion
	 * @param @param sRegion
	 * @return List<Scenicspot>    返回类型
	 * @throws
	 */
	PageBean<Scenicspot> findScenicspotBySRegion(Integer sRegion,Integer size, Integer cur);
}
