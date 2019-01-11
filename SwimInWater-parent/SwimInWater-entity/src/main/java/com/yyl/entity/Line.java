package com.yyl.entity;
import java.io.Serializable;
import java.util.*;
import java.sql.*;
/***
*   
*/
public class Line implements Serializable {
        /** 路线id */
        private Integer id;
        /** 景点id */
        private Integer sId;
        /** 线路名称 */
        private String lName;
        /** 线路说明内容 */
        private String lContent;
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
        public void setLName (String  lName){
            this.lName=lName;
        }
        public  String getLName(){
            return this.lName;
        }
        public void setLContent (String  lContent){
            this.lContent=lContent;
        }
        public  String getLContent(){
            return this.lContent;
        }
}
