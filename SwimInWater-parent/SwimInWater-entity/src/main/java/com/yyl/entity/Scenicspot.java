package com.yyl.entity;
import java.io.Serializable;
import java.util.*;
import java.sql.*;
/***
*   
*/
public class Scenicspot implements Serializable {
        /** 景点id */
        private Integer id;
        /** 景点名称 */
        private String sName;
        /** 所属城市 */
        private String sCity;
        /** 所属地区 (1,国内 2,境外 3,港澳) */
        private String sRegion;
        /** 景点内容 */
        private String sContent;
        /** 景点价格 */
        private Double sPrice;
        /** 发布时间 */
        private Timestamp sPubTime;
        /** 发布状态 (1,发布 2,未发布 3,热门) */
        private Integer sStatus;
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
        public void setSStatus (Integer  sStatus){
            this.sStatus=sStatus;
        }
        public  Integer getSStatus(){
            return this.sStatus;
        }
}
