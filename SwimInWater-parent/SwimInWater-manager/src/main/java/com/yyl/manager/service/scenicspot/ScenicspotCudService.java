package com.yyl.manager.service.scenicspot;
import com.yyl.entity.Scenicspot;
/**
* 业务接口
*/
public interface ScenicspotCudService {

    public Integer addScenicspot(Scenicspot scenicspot);

    public Integer modifyScenicspot(Scenicspot scenicspot);

    public Integer deleteScenicspotById(Integer id);

}
