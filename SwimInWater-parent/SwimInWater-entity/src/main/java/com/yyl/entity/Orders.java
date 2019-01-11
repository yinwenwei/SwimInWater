package com.yyl.entity;
import java.io.Serializable;
import java.util.*;
import java.sql.*;
/***
*   
*/
public class Orders implements Serializable {
        /** 订单id */
        private Integer id;
        /** 景点id */
        private Integer sId;
        /** 景点价格 */
        private Double sPrice;
        /** 线路id */
        private Integer lId;
        /** 线路价格 */
        private Double lPrice;
        /** 酒店id */
        private Integer hId;
        /** 酒店价格 */
        private Double hPrice;
        /** 订单总价格 */
        private Double oTotalPirce;
        /** 订单数量 */
        private Integer oNumber;
        /** 创建时间 */
        private Timestamp oCreateTime;
        /** 订单状态 (1,已付款 2,未付款) */
        private Integer oStatus;
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
