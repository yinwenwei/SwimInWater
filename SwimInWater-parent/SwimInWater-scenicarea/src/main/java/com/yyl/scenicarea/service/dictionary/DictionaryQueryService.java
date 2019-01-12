package com.yyl.scenicarea.service.dictionary;
import com.yyl.entity.Dictionary;
import java.util.List;
import java.util.Map;
import com.yyl.entity.PageBean;
/**
* 业务接口
*/
public interface DictionaryQueryService {

    public Dictionary getDictionaryById(Integer id);

    public List<Dictionary> getDictionaryListByMap(Map<String,Object> param);

    public Integer getDictionaryCountByMap(Map<String,Object> param);

    public PageBean<Dictionary> queryDictionaryPageByMap(Map<String,Object> param,Integer size,Integer cur);
}
