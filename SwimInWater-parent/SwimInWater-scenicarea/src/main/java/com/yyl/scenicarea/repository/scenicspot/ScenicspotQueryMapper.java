package com.yyl.scenicarea.repository.scenicspot;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.yyl.entity.Picture;
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
	 * 多条件查询景点收藏排行榜(降序排列)
	 * @Title: findScenCollectionOrderByDesc
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param @param map
	 * @param @return
	 * @param @throws Exception    设定文件
	 * @return List<Scenicspot>    返回类型
	 * @throws
	 */
	List<Scenicspot> findScenCollectionOrderByDesc(Map<String,Object> map) throws Exception;
	
	
	
}
