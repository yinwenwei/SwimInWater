package com.yyl.scenicarea;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.junit.Test;

public class SolrTest {
	@Test
	public void queryDocument() throws Exception{
		SolrServer solrServer=new HttpSolrServer("http://192.168.138.132:8080/solr");
		SolrQuery query=new SolrQuery();
		
		//设置查询条件
		query.setQuery("scen_sname:澳门");
		
		QueryResponse response= solrServer.query(query);
		//取查询结果
		SolrDocumentList solrDocumentList = response.getResults();
		for (SolrDocument solrDocument : solrDocumentList) {
			System.out.println(solrDocument.get("id"));
			System.out.println(solrDocument.get("scen_sname"));
		}
	}
}
