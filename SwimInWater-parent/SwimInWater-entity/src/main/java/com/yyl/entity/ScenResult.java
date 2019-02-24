package com.yyl.entity;

import java.util.List;

public class ScenResult {
	//景点列表
	private List<ScenInfo> scenList;
	//总记录数
	private long pageSize;
	//总页数页
	private long pageCount;
	//当前页
	private long pageNo;
	//上一页
	private long prev;
	//下一页
	private long next;
	public ScenResult() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ScenResult(List<ScenInfo> scenList, long pageSize, long pageCount,
			long pageNo, long prev, long next) {
		super();
		this.scenList = scenList;
		this.pageSize = pageSize;
		this.pageCount = pageCount;
		setPageNo(pageNo);
		getPrev();
		getNext();
	}
	public List<ScenInfo> getScenList() {
		return scenList;
	}
	public void setScenList(List<ScenInfo> scenList) {
		this.scenList = scenList;
	}
	public long getPageSize() {
		return pageSize;
	}
	public void setPageSize(long pageSize) {
		this.pageSize = pageSize;
	}
	public long getPageCount() {
		return pageCount;
	}
	public void setPageCount(long pageCount) {
		this.pageCount = pageCount;
	}
	public long getPageNo() {
		return pageNo;
	}
	public void setPageNo(long pageNo) {
		if((0 == pageNo) || (pageNo<1 || pageNo>this.pageCount)){
			pageNo=1;
		}
		this.pageNo = pageNo;
	}
	public long getPrev() {
		if(this.pageNo>1){
			this.prev=this.pageNo-1;
		}else{
			this.prev=1;
		}
		return this.prev;
	}
	public void setPrev(long prev) {
		
		this.prev = prev;
	}
	public long getNext() {
		if(this.pageNo<this.pageCount){
			this.next=this.pageNo+1;
		}else{
			this.next=this.pageCount;
		}
		return this.next;
	}
	public void setNext(long next) {
		
		this.next = next;
	}
	
}
