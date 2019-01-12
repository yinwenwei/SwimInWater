package com.yyl.scenicarea.service.scenicspot;
import com.yyl.entity.Scenicspot;
import java.util.List;
import java.util.Map;
import com.yyl.entity.PageBean;
/**
* 业务接口
*/
public interface ScenicspotQueryService {

    public Scenicspot getScenicspotById(Integer id);

    public List<Scenicspot> getScenicspotListByMap(Map<String,Object> param);

    public Integer getScenicspotCountByMap(Map<String,Object> param);

    public PageBean<Scenicspot> queryScenicspotPageByMap(Map<String,Object> param,Integer size,Integer cur);
}
