package com.yyl.entity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.sql.*;
/**
* 
* @ClassName: Dictionary
* @Description: 评论相关模型
* @author Auto-generated
* @date 2019年1月11日 下午 4:40:50
*
 */
@ApiModel(value = "Comment", description = "评论相关模型")
public class Comment implements Serializable {
        /** @Fields serialVersionUID */
	private static final long serialVersionUID = -1183962606508746726L;
		/** 评论id */
        @ApiModelProperty(value = "评论id")
        private Integer id;
        /** 景点id */
        @ApiModelProperty(value = "景点id")
        private Integer sId;
        /** 用户id */
        @ApiModelProperty(value = "用户id")
        private Integer uId;
        /** 用户名称 */
        @ApiModelProperty(value = "用户名称")
        private String uName;
        /** 评论内容 */
        @ApiModelProperty(value = "评论内容")
        private String cContent;
        /** 评论人 */
        @ApiModelProperty(value = "评论人")
        private String cName;
        /** 评论时间 */
        @ApiModelProperty(value = "评论时间")
        private Timestamp cTime;
        
        
        public Comment() {
			super();
		}
        
		public Comment(Integer id, Integer sId, Integer uId) {
			super();
			this.id = id;
			this.sId = sId;
			this.uId = uId;
		}

		public Comment(Integer id, Integer sId, Integer uId, String uName,
				String cContent, String cName, Timestamp cTime) {
			super();
			this.id = id;
			this.sId = sId;
			this.uId = uId;
			this.uName = uName;
			this.cContent = cContent;
			this.cName = cName;
			this.cTime = cTime;
		}

		@Override
		public String toString() {
			return "Comment [id=" + id + ", sId=" + sId + ", uId=" + uId
					+ ", uName=" + uName + ", cContent=" + cContent
					+ ", cName=" + cName + ", cTime=" + cTime + "]";
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
        public void setUId (Integer  uId){
            this.uId=uId;
        }
        public  Integer getUId(){
            return this.uId;
        }
        public void setUName (String  uName){
            this.uName=uName;
        }
        public  String getUName(){
            return this.uName;
        }
        public void setCContent (String  cContent){
            this.cContent=cContent;
        }
        public  String getCContent(){
            return this.cContent;
        }
        public void setCName (String  cName){
            this.cName=cName;
        }
        public  String getCName(){
            return this.cName;
        }
        public void setCTime (Timestamp  cTime){
            this.cTime=cTime;
        }
        public  Timestamp getCTime(){
            return this.cTime;
        }
}
