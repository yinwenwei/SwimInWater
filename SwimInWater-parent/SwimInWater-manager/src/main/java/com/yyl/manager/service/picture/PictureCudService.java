package com.yyl.manager.service.picture;
import com.yyl.entity.Picture;
/**
* 业务接口
*/
public interface PictureCudService {

    public Integer addPicture(Picture picture);

    public Integer modifyPicture(Picture picture);

    public Integer deletePictureById(Integer id);
}
