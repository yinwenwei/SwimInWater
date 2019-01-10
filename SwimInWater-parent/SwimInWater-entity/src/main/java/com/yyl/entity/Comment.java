package com.yyl.entity;
import java.io.Serializable;
import java.sql.Timestamp;
/**
 * 
* @ClassName: Comment
* @Description: 评论相关数据模型
* @author lkw
* @date 2019年1月10日 上午8:51:44
*
 */
public class Comment implements Serializable {
        /** @Fields serialVersionUID */
	private static final long serialVersionUID = 6369177164080329236L;
		/** 评论id */
        private Integer id;
        /** 景点id */
        private Integer sId;
        /** 用户id */
        private Integer uId;
        /** 用户名称 */
        private String uName;
        /** 评论内容 */
        private String cContent;
        /** 评论人 */
        private String cName;
        /** 评论时间 */
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
