package com.yyl.entity;
import java.io.Serializable;
import java.util.*;
import java.sql.*;
/***
*   
*/
public class Picture implements Serializable {
        /** 图片id */
        private Integer id;
        /** 类型 (1,用户头像 2,景点图片 3,酒店图片) */
        private String pType;
        /** {类型id} (用户id,景点id,酒店id) */
        private Integer pTypeId;
        /** 相对路径 */
        private String pRelativePath;
        /** 绝对路径 */
        private String pAbsolutePath;
        //get set 方法
        public void setId (Integer  id){
            this.id=id;
        }
        public  Integer getId(){
            return this.id;
        }
        public void setPType (String  pType){
            this.pType=pType;
        }
        public  String getPType(){
            return this.pType;
        }
        public void setPTypeId (Integer  pTypeId){
            this.pTypeId=pTypeId;
        }
        public  Integer getPTypeId(){
            return this.pTypeId;
        }
        public void setPRelativePath (String  pRelativePath){
            this.pRelativePath=pRelativePath;
        }
        public  String getPRelativePath(){
            return this.pRelativePath;
        }
        public void setPAbsolutePath (String  pAbsolutePath){
            this.pAbsolutePath=pAbsolutePath;
        }
        public  String getPAbsolutePath(){
            return this.pAbsolutePath;
        }
}
