package com.yyl.scenicarea.repository.scenicspot;
import org.apache.ibatis.annotations.Param;

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

}
