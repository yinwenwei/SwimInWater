package com.yyl.entity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.sql.*;
/**
* 
* @ClassName: Dictionary
* @Description: 订单相关
* @author Auto-generated
* @date 2019年1月11日 下午 4:40:50
*
 */
@ApiModel(value = "Orders", description = "订单相关")
public class Orders implements Serializable {
        /** @Fields serialVersionUID */
	private static final long serialVersionUID = -3811879360691995831L;
		/** 订单id */
        @ApiModelProperty(value = "订单id")
        private Integer id;
        /** 景点id */
        @ApiModelProperty(value = "景点id")
        private Integer sId;
        /** 景点价格 */
        @ApiModelProperty(value = "景点价格")
        private Double sPrice;
        /** 线路id */
        @ApiModelProperty(value = "线路id")
        private Integer lId;
        /** 线路价格 */
        @ApiModelProperty(value = "线路价格")
        private Double lPrice;
        /** 酒店id */
        @ApiModelProperty(value = "酒店id")
        private Integer hId;
        /** 酒店价格 */
        @ApiModelProperty(value = "酒店价格")
        private Double hPrice;
        /** 订单总价格 */
        @ApiModelProperty(value = "订单总价格")
        private Double oTotalPirce;
        /** 订单数量 */
        @ApiModelProperty(value = "订单数量")
        private Integer oNumber;
        /** 创建时间 */
        @ApiModelProperty(value = "创建时间")
        private Timestamp oCreateTime;
        /** 订单状态 (1,已付款 2,未付款) */
        @ApiModelProperty(value = "订单状态 (1,已付款 2,未付款)")
        private Integer oStatus;
        
        public Orders() {
			super();
		}
        
		public Orders(Integer id, Integer sId, Integer lId, Integer hId,
				Integer oStatus) {
			super();
			this.id = id;
			this.sId = sId;
			this.lId = lId;
			this.hId = hId;
			this.oStatus = oStatus;
		}

		public Orders(Integer id, Integer sId, Double sPrice, Integer lId,
				Double lPrice, Integer hId, Double hPrice, Double oTotalPirce,
				Integer oNumber, Timestamp oCreateTime, Integer oStatus) {
			super();
			this.id = id;
			this.sId = sId;
			this.sPrice = sPrice;
			this.lId = lId;
			this.lPrice = lPrice;
			this.hId = hId;
			this.hPrice = hPrice;
			this.oTotalPirce = oTotalPirce;
			this.oNumber = oNumber;
			this.oCreateTime = oCreateTime;
			this.oStatus = oStatus;
		}

		@Override
		public String toString() {
			return "Orders [id=" + id + ", sId=" + sId + ", sPrice=" + sPrice
					+ ", lId=" + lId + ", lPrice=" + lPrice + ", hId=" + hId
					+ ", hPrice=" + hPrice + ", oTotalPirce=" + oTotalPirce
					+ ", oNumber=" + oNumber + ", oCreateTime=" + oCreateTime
					+ ", oStatus=" + oStatus + "]";
		}

		//get set 方法
        public void setId (Integer  id){
            this.id=id;
        }
        public  Integer getId(){
            return this.id;
        }
        public void setSId (Integer  sId){
            this.sId=sId;
        }
        public  Integer getSId(){
            return this.sId;
        }
        public void setSPrice (Double  sPrice){
            this.sPrice=sPrice;
        }
        public  Double getSPrice(){
            return this.sPrice;
        }
        public void setLId (Integer  lId){
            this.lId=lId;
        }
        public  Integer getLId(){
            return this.lId;
        }
        public void setLPrice (Double  lPrice){
            this.lPrice=lPrice;
        }
        public  Double getLPrice(){
            return this.lPrice;
        }
        public void setHId (Integer  hId){
            this.hId=hId;
        }
        public  Integer getHId(){
            return this.hId;
        }
        public void setHPrice (Double  hPrice){
            this.hPrice=hPrice;
        }
        public  Double getHPrice(){
            return this.hPrice;
        }
        public void setOTotalPirce (Double  oTotalPirce){
            this.oTotalPirce=oTotalPirce;
        }
        public  Double getOTotalPirce(){
            return this.oTotalPirce;
        }
        public void setONumber (Integer  oNumber){
            this.oNumber=oNumber;
        }
        public  Integer getONumber(){
            return this.oNumber;
        }
        public void setOCreateTime (Timestamp  oCreateTime){
            this.oCreateTime=oCreateTime;
        }
        public  Timestamp getOCreateTime(){
            return this.oCreateTime;
        }
        public void setOStatus (Integer  oStatus){
            this.oStatus=oStatus;
        }
        public  Integer getOStatus(){
            return this.oStatus;
        }
}
