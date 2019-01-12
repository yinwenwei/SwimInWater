package com.yyl.manager.service.scenicspot;
import com.yyl.manager.repository.scenicspot.ScenicspotCudMapper;
import com.yyl.entity.Scenicspot;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;

/**
业务接口实现
*/
@Service
public class ScenicspotCudServiceImpl implements ScenicspotCudService {

    @Resource
    private ScenicspotCudMapper scenicspotCudMapper;


    public Integer addScenicspot(Scenicspot scenicspot){
        try {
			return scenicspotCudMapper.insertScenicspot(scenicspot);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
    }

    public Integer modifyScenicspot(Scenicspot scenicspot){
        try {
			return scenicspotCudMapper.updateScenicspot(scenicspot);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
    }

    public Integer deleteScenicspotById(Integer id){
        try {
			return scenicspotCudMapper.deleteScenicspotById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
    }

}
