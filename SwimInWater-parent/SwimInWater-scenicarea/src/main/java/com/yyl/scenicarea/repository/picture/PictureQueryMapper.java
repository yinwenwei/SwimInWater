package com.yyl.scenicarea.repository.picture;
import com.yyl.entity.Picture;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;
/**
mapper接口
*/
public interface PictureQueryMapper {

	public Picture getPictureById(@Param(value = "id") Integer id) throws Exception;

	public List<Picture> getPictureListByMap(Map<String,Object> param) throws Exception;

	public Integer getPictureCountByMap(Map<String,Object> param) throws Exception;
	//根据用户id查询用户头像
	Picture findUserPicByPTypeId(Integer pTypeId)throws Exception;

}
