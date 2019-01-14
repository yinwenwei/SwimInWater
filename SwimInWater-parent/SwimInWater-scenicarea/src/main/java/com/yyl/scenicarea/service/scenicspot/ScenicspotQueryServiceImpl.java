package com.yyl.scenicarea.service.scenicspot;
import com.yyl.entity.Picture;
import com.yyl.entity.Scenicspot;
import com.yyl.entity.PageBean;
import com.yyl.scenicarea.repository.scenicspot.ScenicspotQueryMapper;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.util.List;
import java.util.Map;
/**
业务接口实现
*/
@Service
public class ScenicspotQueryServiceImpl implements ScenicspotQueryService {

    @Resource
    private ScenicspotQueryMapper scenicspotQueryMapper;

    public Scenicspot getScenicspotById(Integer id){
        try {
			 return scenicspotQueryMapper.getScenicspotById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
    }

    public List<Scenicspot> getScenicspotListByMap(Map<String,Object> param){
        try {
			return scenicspotQueryMapper.getScenicspotListByMap(param);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
    }

    public Integer getScenicspotCountByMap(Map<String,Object> param){
        try {
			return scenicspotQueryMapper.getScenicspotCountByMap(param);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
    }

    public PageBean<Scenicspot> queryScenicspotPageByMap(Map<String,Object> param,Integer size,Integer cur){
        try {
			Integer total = scenicspotQueryMapper.getScenicspotCountByMap(param);
            PageBean<Scenicspot> pageBean = new PageBean<Scenicspot>(total,size,cur);
            param.put("start", (pageBean.getCurrentPage()-1)*size);
            param.put("size", size);
            List<Scenicspot> scenicspotList = scenicspotQueryMapper.getScenicspotListByMap(param);
            pageBean.setList(scenicspotList);
            return pageBean;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
    }
    
    /**
     * 根据景点id查询景点图片
     */
	@Override
	public List<Picture> findScenicspotPictureByPTypeId(Integer pTypeId) {
		// TODO Auto-generated method stub
		try {
			return scenicspotQueryMapper.findScenicspotPictureByPTypeId(pTypeId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<String> findAllCity() {
		return scenicspotQueryMapper.findAllCity();
	}
}
