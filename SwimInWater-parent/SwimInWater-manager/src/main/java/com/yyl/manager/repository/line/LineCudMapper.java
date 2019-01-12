package com.yyl.manager.repository.line;
import org.apache.ibatis.annotations.Param;

import com.yyl.entity.Line;

/**
mapper接口
*/
public interface LineCudMapper {

	public Integer insertLine(Line line) throws Exception;

	public Integer updateLine(Line line) throws Exception;

	public Integer deleteLineById(@Param(value = "id") Integer id) throws Exception;

}
