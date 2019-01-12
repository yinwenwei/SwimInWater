package com.yyl.scenicarea.service.picture;
import com.yyl.entity.Picture;
import java.util.List;
import java.util.Map;
import com.yyl.entity.PageBean;
/**
* 业务接口
*/
public interface PictureQueryService {

    public Picture getPictureById(Integer id);

    public List<Picture> getPictureListByMap(Map<String,Object> param);

    public Integer getPictureCountByMap(Map<String,Object> param);

    public PageBean<Picture> queryPicturePageByMap(Map<String,Object> param,Integer size,Integer cur);
}
