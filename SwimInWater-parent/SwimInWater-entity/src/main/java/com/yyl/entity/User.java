package com.yyl.entity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
* 
* @ClassName: Dictionary
* @Description: 用户相关
* @author Auto-generated
* @date 2019年1月11日 下午 4:40:50
*
 */
/**
 * 用户相关数据模型
 * @ClassName: User
 * @author lkw
 * @date 2019年1月11日 下午5:05:05
 */
@ApiModel(value = "User", description = "用户相关")
public class User implements Serializable {
        /** @Fields serialVersionUID */
	private static final long serialVersionUID = -6826880110430599220L;
		/** 用户id */
        @ApiModelProperty(value = "用户id")
        private Integer id;
        /** 用户名 */
        @ApiModelProperty(value = "用户名")
        private String uName;
        /** 用户密码 */
        @ApiModelProperty(value = "用户密码")
        private String uPwd;
        /** 手机号码 */
        @ApiModelProperty(value = "手机号码")
        private Integer uPhone;
        /** 性别 (1,男 2,女) */
        @ApiModelProperty(value = "性别 (1,男 2,女)")
        private String uSex;
        /** 身份证 */
        @ApiModelProperty(value = "身份证")
        private String uIdentity;
        /** 用户角色(1,管理员 2,普通用户) */
        @ApiModelProperty(value = "用户角色(1,管理员 2,普通用户)")
        private Integer uRole;
        
        public User() {
			super();
		}
        
		public User(String uName, String uPwd, Integer uRole) {
			super();
			this.uName = uName;
			this.uPwd = uPwd;
			this.uRole = uRole;
		}

		public User(Integer id, String uName, String uPwd, Integer uPhone,
				String uSex, String uIdentity, Integer uRole) {
			super();
			this.id = id;
			this.uName = uName;
			this.uPwd = uPwd;
			this.uPhone = uPhone;
			this.uSex = uSex;
			this.uIdentity = uIdentity;
			this.uRole = uRole;
		}

		@Override
		public String toString() {
			return "User [id=" + id + ", uName=" + uName + ", uPwd=" + uPwd
					+ ", uPhone=" + uPhone + ", uSex=" + uSex + ", uIdentity="
					+ uIdentity + ", uRole=" + uRole + "]";
		}

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
