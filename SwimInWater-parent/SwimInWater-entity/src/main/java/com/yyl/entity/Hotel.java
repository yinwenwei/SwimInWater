package com.yyl.entity;
import java.io.Serializable;
import java.util.*;
import java.sql.*;
/***
*   
*/
public class Hotel implements Serializable {
        /** 酒店id */
        private Integer id;
        /** 酒店名称 */
        private String hName;
        /** 景点id */
        private Integer sId;
        /** 酒店等级 (1,三星级酒店 2,四星级酒店 3,五星级酒店) */
        private Integer hGrage;
        /** 酒店详情 */
        private String hContent;
        //get set 方法
        public void setId (Integer  id){
            this.id=id;
        }
        public  Integer getId(){
            return this.id;
        }
        public void setHName (String  hName){
            this.hName=hName;
        }
        public  String getHName(){
            return this.hName;
        }
        public void setSId (Integer  sId){
            this.sId=sId;
        }
        public  Integer getSId(){
            return this.sId;
        }
        public void setHGrage (Integer  hGrage){
            this.hGrage=hGrage;
        }
        public  Integer getHGrage(){
            return this.hGrage;
        }
        public void setHContent (String  hContent){
            this.hContent=hContent;
        }
        public  String getHContent(){
            return this.hContent;
        }
}
