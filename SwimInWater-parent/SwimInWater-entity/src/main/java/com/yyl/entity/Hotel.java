package com.yyl.entity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
* 酒店相关
* @ClassName: Dictionary
* @author Auto-generated
* @date 2019年1月11日 下午 4:40:50
*
 */
@ApiModel(value = "Hotel", description = "酒店相关")
public class Hotel implements Serializable {
        /** @Fields serialVersionUID */
	private static final long serialVersionUID = -6922458424090994533L;
		/** 酒店id */
        @ApiModelProperty(value = "酒店id")
        private Integer id;
        /** 酒店名称 */
        @ApiModelProperty(value = "酒店名称")
        private String hName;
        /** 酒店价格 */
        @ApiModelProperty(value = "酒店价格")
        private Double hPrice;
        /** 景点id */
        @ApiModelProperty(value = "景点id")
        private Integer sId;
        /** 酒店等级 (1,三星级酒店 2,四星级酒店 3,五星级酒店) */
        @ApiModelProperty(value = "酒店等级 (1,三星级酒店 2,四星级酒店 3,五星级酒店)")
        private Integer hGrage;
        /** 酒店详情 */
        @ApiModelProperty(value = "酒店详情")
        private String hContent;
		public Hotel() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Hotel(Integer id, String hName, Double hPrice, Integer sId,
				Integer hGrage, String hContent) {
			super();
			this.id = id;
			this.hName = hName;
			this.hPrice = hPrice;
			this.sId = sId;
			this.hGrage = hGrage;
			this.hContent = hContent;
		}
		@Override
		public String toString() {
			return "Hotel [id=" + id + ", hName=" + hName + ", hPrice="
					+ hPrice + ", sId=" + sId + ", hGrage=" + hGrage
					+ ", hContent=" + hContent + "]";
		}
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String gethName() {
			return hName;
		}
		public void sethName(String hName) {
			this.hName = hName;
		}
		public Double gethPrice() {
			return hPrice;
		}
		public void sethPrice(Double hPrice) {
			this.hPrice = hPrice;
		}
		public Integer getsId() {
			return sId;
		}
		public void setsId(Integer sId) {
			this.sId = sId;
		}
		public Integer gethGrage() {
			return hGrage;
		}
		public void sethGrage(Integer hGrage) {
			this.hGrage = hGrage;
		}
		public String gethContent() {
			return hContent;
		}
		public void sethContent(String hContent) {
			this.hContent = hContent;
		}
		public static long getSerialversionuid() {
			return serialVersionUID;
		}
	
        
        
}
