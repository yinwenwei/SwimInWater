package com.yyl.scenicarea.service.line;
import com.yyl.entity.Line;
import java.util.List;
import java.util.Map;
import com.yyl.entity.PageBean;
/**
* 业务接口
*/
public interface LineQueryService {

    public Line getLineById(Integer id);

    public List<Line> getLineListByMap(Map<String,Object> param);

    public Integer getLineCountByMap(Map<String,Object> param);

    public PageBean<Line> queryLinePageByMap(Map<String,Object> param,Integer size,Integer cur);
}
