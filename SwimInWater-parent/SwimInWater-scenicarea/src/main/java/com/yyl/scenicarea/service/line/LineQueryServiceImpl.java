package com.yyl.scenicarea.service.line;
import com.yyl.entity.Line;
import com.yyl.entity.PageBean;
import com.yyl.scenicarea.repository.line.LineQueryMapper;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.util.List;
import java.util.Map;
/**
业务接口实现
*/
@Service
public class LineQueryServiceImpl implements LineQueryService {

    @Resource
    private LineQueryMapper lineQueryMapper;

    public Line getLineById(Integer id){
        try {
			 return lineQueryMapper.getLineById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
    }

    public List<Line> getLineListByMap(Map<String,Object> param){
        try {
			return lineQueryMapper.getLineListByMap(param);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
    }

    public Integer getLineCountByMap(Map<String,Object> param){
        try {
			return lineQueryMapper.getLineCountByMap(param);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
    }

    public PageBean<Line> queryLinePageByMap(Map<String,Object> param,Integer size,Integer cur){
        try {
			Integer total = lineQueryMapper.getLineCountByMap(param);
            PageBean<Line> pageBean = new PageBean<Line>(total,size,cur);
            param.put("start", (pageBean.getCurrentPage()-1)*size);
            param.put("size", size);
            List<Line> lineList = lineQueryMapper.getLineListByMap(param);
            pageBean.setList(lineList);
            return pageBean;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
    }
}
