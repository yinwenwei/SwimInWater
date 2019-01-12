package com.yyl.manager.repository.picture;
import org.apache.ibatis.annotations.Param;

import com.yyl.entity.Picture;

/**
mapper接口
*/
public interface PictureCudMapper {

	public Integer insertPicture(Picture picture) throws Exception;

	public Integer updatePicture(Picture picture) throws Exception;

	public Integer deletePictureById(@Param(value = "id") Integer id) throws Exception;

}
