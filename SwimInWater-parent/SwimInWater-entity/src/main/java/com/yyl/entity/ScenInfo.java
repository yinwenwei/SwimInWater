package com.yyl.entity;

import java.io.Serializable;
/**
 * 景点信息solr实体类
 * @author LENOVO
 *
 */
public class ScenInfo implements Serializable{
	private Integer id;
	private String sName;
	private String sCity;
	private String sContent;
	private Double sPrice;
	private Integer pid;
	private String pRelativePath;
	public ScenInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ScenInfo(Integer id, String sName, String sCity, String sContent,
			Double sPrice, Integer pid, String pRelativePath) {
		super();
		this.id = id;
		this.sName = sName;
		this.sCity = sCity;
		this.sContent = sContent;
		this.sPrice = sPrice;
		this.pid = pid;
		this.pRelativePath = pRelativePath;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsCity() {
		return sCity;
	}
	public void setsCity(String sCity) {
		this.sCity = sCity;
	}
	public String getsContent() {
		return sContent;
	}
	public void setsContent(String sContent) {
		this.sContent = sContent;
	}
	public Double getsPrice() {
		return sPrice;
	}
	public void setsPrice(Double sPrice) {
		this.sPrice = sPrice;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getpRelativePath() {
		return pRelativePath;
	}
	public void setpRelativePath(String pRelativePath) {
		this.pRelativePath = pRelativePath;
	}
	
	
}
