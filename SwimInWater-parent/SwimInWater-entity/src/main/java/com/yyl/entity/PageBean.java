package com.yyl.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * 
* @ClassName: PageBean
* @Description: 分页相关数据模型
* @author lkw
* @date 2019年1月10日 上午9:00:46
*
* @param <T>
 */
public class PageBean<T> implements Serializable {
	/** 总记录数 */
	private Integer totalCount;
	/** 每页大小 */
	private Integer pageSize;
	/** 总页数 */
	private Integer pageCount;
	/** 当前页 */
	private Integer currentPage;
	/** 上一页 */
	private Integer prev;
	/** 下一页 */
	private Integer next;
	/** 一页数据 */
	private List<T> list;

	/** 查询条件【页面回显】 */
	private Map<String, Object> params;

	/**
	 * 计算总页数--》当前页,上一页，下一页
	 * @param totalCount
	 * @param pageSize
	 * @param currentPage
	 */
	public PageBean(Integer totalCount, Integer pageSize, Integer currentPage) {
		super();
		this.totalCount = totalCount;
		this.pageSize = (null == pageSize) ? 5 : pageSize;
        System.out.println("测试null:totalCount:"+this.totalCount+"\tpageSize:"+this.pageSize+"\tcurrentPage:"+this.currentPage);
		this.pageCount = (this.totalCount + this.pageSize - 1) / this.pageSize;
        System.out.println("测试null:totalCount:currentPage:"+currentPage);
		setCurrentPage(currentPage);
        System.out.println("测试null:totalCount:currentPage:"+getCurrentPage());
		getPrev();
		getNext();
	}

	public PageBean() {
		super();
	}



	public Integer getPrev() {
		if (this.currentPage > 1) {
			this.prev = this.currentPage - 1;
		}else {
			this.prev = 1;
		}
		return this.prev;
	}

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageCount() {
		return (totalCount + pageSize - 1) / pageSize;
	}

	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}

	public Integer getCurrentPage() {
		if(null == this.currentPage){
            return 1;
        }
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
        if(null == currentPage){
            this.currentPage =  1;
        }else{
            this.currentPage = currentPage;
        }
	}

	public void setPrev(Integer prev) {
		this.prev = prev;
	}

	public Integer getNext() {
	    if(currentPage < pageCount){
	       next = currentPage + 1;
        }else{
            next = pageCount;
        }
		return next;
	}

	public void setNext(Integer next) {
		this.next = next;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	public Map<String, Object> getParams() {
		return params;
	}

	public void setParams(Map<String, Object> params) {
		this.params = params;
	}

	/**
	 * 版本号
	 */
	private static final long serialVersionUID = 3500388402761025065L;

}
