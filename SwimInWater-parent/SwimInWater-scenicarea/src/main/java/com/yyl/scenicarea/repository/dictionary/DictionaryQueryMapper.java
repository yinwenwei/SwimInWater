package com.yyl.scenicarea.repository.dictionary;
import com.yyl.entity.Dictionary;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
/**
mapper接口
*/
public interface DictionaryQueryMapper {

	public Dictionary getDictionaryById(@Param(value = "id") Integer id) throws Exception;

	public List<Dictionary> getDictionaryListByMap(Map<String,Object> param) throws Exception;

	public Integer getDictionaryCountByMap(Map<String,Object> param) throws Exception;

}
