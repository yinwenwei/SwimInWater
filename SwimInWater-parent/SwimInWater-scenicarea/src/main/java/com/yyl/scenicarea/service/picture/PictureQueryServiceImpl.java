package com.yyl.scenicarea.service.picture;
import com.yyl.entity.Picture;
import com.yyl.entity.PageBean;
import com.yyl.scenicarea.repository.picture.PictureQueryMapper;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.util.List;
import java.util.Map;
/**
业务接口实现
*/
@Service
public class PictureQueryServiceImpl implements PictureQueryService {

    @Resource
    private PictureQueryMapper pictureQueryMapper;

    public Picture getPictureById(Integer id){
        try {
			 return pictureQueryMapper.getPictureById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
    }

    public List<Picture> getPictureListByMap(Map<String,Object> param){
        try {
			return pictureQueryMapper.getPictureListByMap(param);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
    }

    public Integer getPictureCountByMap(Map<String,Object> param){
        try {
			return pictureQueryMapper.getPictureCountByMap(param);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
    }

    public PageBean<Picture> queryPicturePageByMap(Map<String,Object> param,Integer size,Integer cur){
        try {
			Integer total = pictureQueryMapper.getPictureCountByMap(param);
            PageBean<Picture> pageBean = new PageBean<Picture>(total,size,cur);
            param.put("start", (pageBean.getCurrentPage()-1)*size);
            param.put("size", size);
            List<Picture> pictureList = pictureQueryMapper.getPictureListByMap(param);
            pageBean.setList(pictureList);
            return pageBean;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
    }
}
