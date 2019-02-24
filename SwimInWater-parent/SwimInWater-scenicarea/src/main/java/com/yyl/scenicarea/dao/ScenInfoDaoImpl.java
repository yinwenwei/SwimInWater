package com.yyl.scenicarea.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yyl.entity.ScenInfo;
import com.yyl.entity.ScenResult;
@Repository("scenInfoDao")
public class ScenInfoDaoImpl implements ScenInfoDao{
	@Autowired
	private SolrServer solrServer;
	
	/**
	 * 查询solr索引库信息
	 * @throws SolrServerException 
	 * @throws Exception 
	 */
	@Override
	public ScenResult searScenInfo(SolrQuery query) throws Exception{
		System.out.println("查询条件:"+query);
		//返回对象值
		ScenResult result=new ScenResult();
		//根据查询条件查询索引库
		QueryResponse queryResponse = solrServer.query(query);
		//取查询结果
		SolrDocumentList solrDocumentList = queryResponse.getResults();
		//去查询结果总数量
		result.setPageSize(solrDocumentList.getNumFound());
		System.out.println("----总数量----:"+solrDocumentList.getNumFound());
		
		//景点列表
		List<ScenInfo> scenList= new ArrayList<>();
		
		//取高亮信息
		Map<String, Map<String, List<String>>> highlighting = queryResponse.getHighlighting();
		//取景点列表
		for (SolrDocument solrDocument : solrDocumentList) {
			System.out.println("-----");
			ScenInfo scenInfo=new ScenInfo();
			scenInfo.setId((Integer)solrDocument.get("scen_id"));
			//按景点名称查询,取高亮的结果
			List<String> list = highlighting.get(solrDocument.get("id")).get("scen_sname");
			String sname="";
			if(list!=null && list.size()>0){
				sname=list.get(0);
			}else{
				sname=(String) solrDocument.get("scen_sname");
			}
			scenInfo.setsName(sname);
			System.out.println("城市+++++++++++++++++"+solrDocument.get("scen_scity"));
			scenInfo.setsCity((String)solrDocument.get("scen_scity"));
			scenInfo.setsPrice((Double)solrDocument.get("scen_sprice"));
			scenInfo.setPid((Integer)solrDocument.get("pic_pid"));
			scenInfo.setpRelativePath((String)solrDocument.get("pic_prelativepath"));
			//景点列表的添加
			scenList.add(scenInfo);
		}
		result.setScenList(scenList);
		return result;
	}
}
