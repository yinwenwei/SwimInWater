package com.yyl.entity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.sql.*;
/**
* 
* @ClassName: Dictionary
* @Description: 景点相关
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
        private String sRegion;
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
        
        public Scenicspot() {
			super();
		}
        
		public Scenicspot(String sName, String sCity, String sRegion,
				Integer sStatus) {
			super();
			this.sName = sName;
			this.sCity = sCity;
			this.sRegion = sRegion;
			this.sStatus = sStatus;
		}

		public Scenicspot(Integer id, String sName, String sCity,
				String sRegion, String sContent, Double sPrice,
				Timestamp sPubTime, Integer sCollectionNum, Integer sStatus) {
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
		}

		@Override
		public String toString() {
			return "Scenicspot [id=" + id + ", sName=" + sName + ", sCity="
					+ sCity + ", sRegion=" + sRegion + ", sContent=" + sContent
					+ ", sPrice=" + sPrice + ", sPubTime=" + sPubTime
					+ ", sCollectionNum=" + sCollectionNum + ", sStatus="
					+ sStatus + "]";
		}

		//get set 方法
        public void setId (Integer  id){
            this.id=id;
        }
        public  Integer getId(){
            return this.id;
        }
        public void setSName (String  sName){
            this.sName=sName;
        }
        public  String getSName(){
            return this.sName;
        }
        public void setSCity (String  sCity){
            this.sCity=sCity;
        }
        public  String getSCity(){
            return this.sCity;
        }
        public void setSRegion (String  sRegion){
            this.sRegion=sRegion;
        }
        public  String getSRegion(){
            return this.sRegion;
        }
        public void setSContent (String  sContent){
            this.sContent=sContent;
        }
        public  String getSContent(){
            return this.sContent;
        }
        public void setSPrice (Double  sPrice){
            this.sPrice=sPrice;
        }
        public  Double getSPrice(){
            return this.sPrice;
        }
        public void setSPubTime (Timestamp  sPubTime){
            this.sPubTime=sPubTime;
        }
        public  Timestamp getSPubTime(){
            return this.sPubTime;
        }
        public void setSCollectionNum (Integer  sCollectionNum){
            this.sCollectionNum=sCollectionNum;
        }
        public  Integer getSCollectionNum(){
            return this.sCollectionNum;
        }
        public void setSStatus (Integer  sStatus){
            this.sStatus=sStatus;
        }
        public  Integer getSStatus(){
            return this.sStatus;
        }
}
