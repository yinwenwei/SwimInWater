package com.yyl.manager.service.line;
import com.yyl.entity.Line;
import com.yyl.manager.repository.line.LineCudMapper;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
/**
业务接口实现
*/
@Service
public class LineCudServiceImpl implements LineCudService {

    @Resource
    private LineCudMapper lineCudMapper;


    public Integer addLine(Line line){
        try {
			return lineCudMapper.insertLine(line);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
    }

    public Integer modifyLine(Line line){
        try {
			return lineCudMapper.updateLine(line);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
    }

    public Integer deleteLineById(Integer id){
        try {
			return lineCudMapper.deleteLineById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
    }

}
