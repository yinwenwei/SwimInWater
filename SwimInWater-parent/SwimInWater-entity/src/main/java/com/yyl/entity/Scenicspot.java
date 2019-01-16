package com.yyl.entity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.sql.*;
/**
* 景点相关
* @ClassName: Dictionary
* @author Auto-generated
* @date 2019年1月11日 下午 4:40:50
*
 */
@ApiModel(value = "Scenicspot", description = "景点相关")
public class Scenicspot implements Serializable {
        /** @Fields serialVersionUID */
	private static final long serialVersionUID = 1224565339762752553L;
		/** 景点id */
        @ApiModelProperty(value = "景点id")
        private Integer id;
        /** 景点名称 */
        @ApiModelProperty(value = "景点名称")
        private String sName;
        /** 所属城市 */
        @ApiModelProperty(value = "所属城市")
        private String sCity;
        /** 所属地区 (1,国内 2,境外 3,港澳) */
        @ApiModelProperty(value = "所属地区 (1,国内 2,境外 3,港澳)")
        private Integer sRegion;
        /** 景点内容 */
        @ApiModelProperty(value = "景点内容")
        private String sContent;
        /** 景点价格 */
        @ApiModelProperty(value = "景点价格")
        private Double sPrice;
        /** 发布时间 */
        @ApiModelProperty(value = "发布时间")
        private Timestamp sPubTime;
        /** 收藏数量 */
        @ApiModelProperty(value = "收藏数量")
        private Integer sCollectionNum;
        /** 发布状态 (1,发布 2,未发布 3,热门) */
        @ApiModelProperty(value = "发布状态 (1,发布 2,未发布 3,热门)")
        private Integer sStatus;
        /** 相对路径 */
        @ApiModelProperty(value = "相对路径")
        private String pRelativePath;
		public Scenicspot() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Scenicspot(Integer id, String sName, String sCity,
				Integer sRegion, String sContent, Double sPrice,
				Timestamp sPubTime, Integer sCollectionNum, Integer sStatus,
				String pRelativePath) {
			super();
			this.id = id;
			this.sName = sName;
			this.sCity = sCity;
			this.sRegion = sRegion;
			this.sContent = sContent;
			this.sPrice = sPrice;
			this.sPubTime = sPubTime;
			this.sCollectionNum = sCollectionNum;
			this.sStatus = sStatus;
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
		public Integer getsRegion() {
			return sRegion;
		}
		public void setsRegion(Integer sRegion) {
			this.sRegion = sRegion;
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
		public Timestamp getsPubTime() {
			return sPubTime;
		}
		public void setsPubTime(Timestamp sPubTime) {
			this.sPubTime = sPubTime;
		}
		public Integer getsCollectionNum() {
			return sCollectionNum;
		}
		public void setsCollectionNum(Integer sCollectionNum) {
			this.sCollectionNum = sCollectionNum;
		}
		public Integer getsStatus() {
			return sStatus;
		}
		public void setsStatus(Integer sStatus) {
			this.sStatus = sStatus;
		}
		public String getpRelativePath() {
			return pRelativePath;
		}
		public void setpRelativePath(String pRelativePath) {
			this.pRelativePath = pRelativePath;
		}
		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		@Override
		public String toString() {
			return "Scenicspot [id=" + id + ", sName=" + sName + ", sCity="
					+ sCity + ", sRegion=" + sRegion + ", sContent=" + sContent
					+ ", sPrice=" + sPrice + ", sPubTime=" + sPubTime
					+ ", sCollectionNum=" + sCollectionNum + ", sStatus="
					+ sStatus + ", pRelativePath=" + pRelativePath + "]";
		}
        
		
}
