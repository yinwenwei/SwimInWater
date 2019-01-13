package com.yyl.scenicarea.repository.scenicspot;
import org.apache.ibatis.annotations.Param;

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
	
}
