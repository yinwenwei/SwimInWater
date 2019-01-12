package com.yyl.scenicarea.repository.line;
import org.apache.ibatis.annotations.Param;

import com.yyl.entity.Line;

import java.util.List;
import java.util.Map;
/**
mapper接口
*/
public interface LineQueryMapper {

	public Line getLineById(@Param(value = "id") Integer id) throws Exception;

	public List<Line> getLineListByMap(Map<String,Object> param) throws Exception;

	public Integer getLineCountByMap(Map<String,Object> param) throws Exception;
}
