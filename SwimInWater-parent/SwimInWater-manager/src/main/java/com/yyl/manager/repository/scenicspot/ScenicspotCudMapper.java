package com.yyl.manager.repository.scenicspot;
import org.apache.ibatis.annotations.Param;

import com.yyl.entity.Scenicspot;

/**
mapper接口
*/
public interface ScenicspotCudMapper {

	public Integer insertScenicspot(Scenicspot scenicspot) throws Exception;

	public Integer updateScenicspot(Scenicspot scenicspot) throws Exception;

	public Integer deleteScenicspotById(@Param(value = "id") Integer id) throws Exception;

}
