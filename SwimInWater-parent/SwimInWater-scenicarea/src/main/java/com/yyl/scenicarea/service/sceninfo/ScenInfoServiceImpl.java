package com.yyl.scenicarea.service.sceninfo;

import javax.annotation.Resource;

import org.apache.solr.client.solrj.SolrQuery;
import org.springframework.stereotype.Service;

import com.yyl.entity.ScenResult;
import com.yyl.scenicarea.dao.ScenInfoDao;
@Service
public class ScenInfoServiceImpl implements ScenInfoService {
	@Resource
	private ScenInfoDao scenInfoDao;

	@Override
	public ScenResult searScenInfo(String queryString, int page, int rows)
			throws Exception {
		//创建查询对象
		SolrQuery query=new SolrQuery();
		//设置查询条件
		query.setQuery(queryString);
		//设置分页
		query.setStart((page-1)*rows);
		query.setRows(rows);
		//设置默认搜索域
		query.set("df", "scen_keywords");
		//设置高亮显示
		query.setHighlight(true);
		query.addHighlightField("scen_sname");
		query.setHighlightSimplePre("<em style=\"color:red\">");
		query.setHighlightSimplePost("</em>");
		//执行查询
		ScenResult scenResult = scenInfoDao.searScenInfo(query);
		//计算查询结果总数页
		long pageSize = scenResult.getPageSize();
		long pageCount=pageSize/rows;
		if(pageSize % rows > 0){
			pageCount++;
		}
		
		
		//总页数
		scenResult.setPageCount(pageCount);
		//当前页
		scenResult.setPageNo(page);
		return scenResult;
	}

}
