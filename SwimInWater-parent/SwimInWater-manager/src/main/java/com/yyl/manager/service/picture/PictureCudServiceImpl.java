package com.yyl.manager.service.picture;
import com.yyl.entity.Picture;
import com.yyl.manager.repository.picture.PictureCudMapper;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
业务接口实现
*/
@Service
public class PictureCudServiceImpl implements PictureCudService {

    @Resource
    private PictureCudMapper pictureCudMapper;

    public Integer addPicture(Picture picture){
        try {
			return pictureCudMapper.insertPicture(picture);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
    }

    public Integer modifyPicture(Picture picture){
        try {
			return pictureCudMapper.updatePicture(picture);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
    }

    public Integer deletePictureById(Integer id){
        try {
			return pictureCudMapper.deletePictureById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
    }
}
