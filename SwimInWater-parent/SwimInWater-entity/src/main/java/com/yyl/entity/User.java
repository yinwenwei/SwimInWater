package com.yyl.entity;
import java.io.Serializable;
import java.util.*;
import java.sql.*;
/***
*   
*/
public class User implements Serializable {
        /** 用户id */
        private Integer id;
        /** 用户名 */
        private String uName;
        /** 用户密码 */
        private String uPwd;
        /** 手机号码 */
        private Integer uPhone;
        /** 性别 (1,男 2,女) */
        private String uSex;
        /** 身份证 */
        private String uIdentity;
        /** 用户角色(1,管理员 2,普通用户) */
        private Integer uRole;
        //get set 方法
        public void setId (Integer  id){
            this.id=id;
        }
        public  Integer getId(){
            return this.id;
        }
        public void setUName (String  uName){
            this.uName=uName;
        }
        public  String getUName(){
            return this.uName;
        }
        public void setUPwd (String  uPwd){
            this.uPwd=uPwd;
        }
        public  String getUPwd(){
            return this.uPwd;
        }
        public void setUPhone (Integer  uPhone){
            this.uPhone=uPhone;
        }
        public  Integer getUPhone(){
            return this.uPhone;
        }
        public void setUSex (String  uSex){
            this.uSex=uSex;
        }
        public  String getUSex(){
            return this.uSex;
        }
        public void setUIdentity (String  uIdentity){
            this.uIdentity=uIdentity;
        }
        public  String getUIdentity(){
            return this.uIdentity;
        }
        public void setURole (Integer  uRole){
            this.uRole=uRole;
        }
        public  Integer getURole(){
            return this.uRole;
        }
}
