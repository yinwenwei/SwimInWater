package com.yyl.scenicarea.service.dictionary;
import com.yyl.scenicarea.repository.dictionary.DictionaryQueryMapper;
import com.yyl.entity.Dictionary;
import com.yyl.entity.PageBean;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.util.List;
import java.util.Map;
/**
业务接口实现
*/
@Service
public class DictionaryQueryServiceImpl implements DictionaryQueryService {

    @Resource
    private DictionaryQueryMapper dictionaryQueryMapper;

    public Dictionary getDictionaryById(Integer id){
        try {
			 return dictionaryQueryMapper.getDictionaryById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
    }

    public List<Dictionary> getDictionaryListByMap(Map<String,Object> param){
        try {
			return dictionaryQueryMapper.getDictionaryListByMap(param);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
    }

    public Integer getDictionaryCountByMap(Map<String,Object> param){
        try {
			return dictionaryQueryMapper.getDictionaryCountByMap(param);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
    }

    public PageBean<Dictionary> queryDictionaryPageByMap(Map<String,Object> param,Integer size,Integer cur){
        try {
			Integer total = dictionaryQueryMapper.getDictionaryCountByMap(param);
            PageBean<Dictionary> pageBean = new PageBean<Dictionary>(total,size,cur);
            param.put("start", (pageBean.getCurrentPage()-1)*size);
            param.put("size", size);
            List<Dictionary> dictionaryList = dictionaryQueryMapper.getDictionaryListByMap(param);
            pageBean.setList(dictionaryList);
            return pageBean;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
    }
}
