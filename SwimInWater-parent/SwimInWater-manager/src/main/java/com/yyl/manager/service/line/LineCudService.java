package com.yyl.manager.service.line;
import com.yyl.entity.Line;
/**
* 业务接口
*/
public interface LineCudService {

    public Integer addLine(Line line);

    public Integer modifyLine(Line line);

    public Integer deleteLineById(Integer id);
}
