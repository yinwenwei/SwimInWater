package com.yyl.scenicarea.dao;

import org.apache.solr.client.solrj.SolrQuery;

import com.yyl.entity.ScenResult;

public interface ScenInfoDao {
	/**
	 * 查询solr索引库数据
	 * @Title: searScenInfo
	 * @param @return    设定文件
	 * @return ScenResult    返回类型
	 * @throws
	 */
	ScenResult searScenInfo(SolrQuery query) throws Exception;
}
