package com.yyl.scenicarea.service.scenicspot;
import com.yyl.entity.Picture;
import com.yyl.entity.Scenicspot;

import java.util.List;
import java.util.Map;

import com.yyl.entity.PageBean;
/**
* 业务接口
*/
public interface ScenicspotQueryService {

    public Scenicspot getScenicspotById(Integer id);

    public List<Scenicspot> getScenicspotListByMap(Map<String,Object> param);

    public Integer getScenicspotCountByMap(Map<String,Object> param);

    public PageBean<Scenicspot> queryScenicspotPageByMap(Map<String,Object> param,Integer size,Integer cur);
    
    /**
	 * 
	 * @Title: findScenicspotPictureByPTypeId
	 * @Description: 查询景点图片(SELECT p.id FROM picture p,scenicspot s WHERE p.pTypeId=s.id AND p.pType=2 AND p.pTypeId=? )
	 * @param @param pTypeId
	 * @return List<Picture>    返回类型
	 * @throws
	 */
	List<Picture> findScenicspotPictureByPTypeId(Integer pTypeId);
}
