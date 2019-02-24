package com.yyl.scenicarea.repository.scenicspot;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.solr.client.solrj.SolrQuery;

import com.yyl.entity.Picture;
import com.yyl.entity.ScenInfo;
import com.yyl.entity.ScenResult;
import com.yyl.entity.Scenicspot;

import java.util.List;
import java.util.Map;
/**
mapper接口
*/
public interface ScenicspotQueryMapper {

	public Scenicspot getScenicspotById(@Param(value = "id") Integer id) throws Exception;

	public List<Scenicspot> getScenicspotListByMap(Map<String,Object> param) throws Exception;

	public Integer getScenicspotCountByMap(Map<String,Object> param) throws Exception;
	/**
	 * 
	 * @Title: findScenicspotPictureByPTypeId
	 * @Description: 查询景点图片(SELECT p.id FROM picture p,scenicspot s WHERE p.pTypeId=s.id AND p.pType=2 AND p.pTypeId=? )
	 * @param @param pTypeId
	 * @return List<Picture>    返回类型
	 * @throws
	 */
	List<Picture> findScenicspotPictureByPTypeId(Integer pTypeId) throws Exception;
	/**
	 * 查询所有城市
	 * @Title: findAllCity
	 * @return List<String>    返回类型
	 * @throws
	 */
	@Select("SELECT sCity FROM scenicspot GROUP BY sCity")
	public List<String> findAllCity();
	
	/**
	 * 根据分区查询首页所有景点信息And图片
	 * @Title: findScenPicAll
	 * @return List<Scenicspot>    返回类型
	 * @throws
	 */
	List<Scenicspot> findScenPicAll();
	/**
	 * 根据分区查询景点信息
	 * @Title: findScenicspotBySRegion
	 * @param @param sRegion
	 * @return List<Scenicspot>    返回类型
	 * @throws
	 */
	List<Scenicspot> findScenicspotBySRegion(Map<String,Object> param) throws Exception;
	/**
	 * 根据分区查询总记录数
	 * @Title: getScenicspotCountBySRegion
	 * @param @param param
	 * @return Integer    返回类型
	 * @throws
	 */
	Integer getScenicspotCountBySRegion(Map<String,Object> param) throws Exception;
	
	/**
	 * 查询景点收藏排行榜(降序排列)
	 * @Title: findScenCollectionOrderByDesc
	 * @param @param map
	 * @param @return
	 * @param @throws Exception    设定文件
	 * @return List<Scenicspot>    返回类型
	 * @throws
	 */
	List<Scenicspot> findScenCollectionOrderByDesc() throws Exception;
	/**
	 * 人气旅游
	 * @Title: findPopularTourism
	 * @return List<Scenicspot>    返回类型
	 * @throws
	 */
	List<Scenicspot> findPopularTourism();
	
	/**
	 * 最新旅游
	 * @Title: findNewestTourism
	 * @return List<Scenicspot>    返回类型
	 * @throws
	 */
	List<Scenicspot> findNewestTourism();
	
	/**
	 * 主题旅游
	 * @Title: findThemeTourism
	 * @param @param sCity
	 * @param @return    设定文件
	 * @return List<Scenicspot>    返回类型
	 * @throws
	 */
	List<Scenicspot> findThemeTourism(String sCity); 
	/**
	 * 查询景点信息导入solr索引库
	 * @Title: findScenInfo
	 * @param @return    设定文件
	 * @return List<ScenInfo>    返回类型
	 * @throws
	 */
	List<ScenInfo> findScenInfo();
	/**
	 * 查询solr索引库数据
	 * @Title: searScenInfo
	 * @param @return    设定文件
	 * @return ScenResult    返回类型
	 * @throws
	 */
	ScenResult searScenInfo(SolrQuery query) throws Exception;
}
