package com.yyl.scenicarea.service.sceninfo;

import com.yyl.entity.ScenResult;
public interface ScenInfoService {
	/**
	 * 查询solr索引库数据
	 * @Title: searScenInfo
	 * @param @return    设定文件
	 * @return ScenResult    返回类型
	 * @throws
	 */
	ScenResult searScenInfo(String queryString,int page,int rows) throws Exception;
}
