package com.yyl.entity;
import java.io.Serializable;
import java.sql.Timestamp;
/**
 * 
* @ClassName: Dictionary
* @Description: 数据字典相关数据模型
* @author lkw
* @date 2019年1月10日 上午8:51:29
*
 */
public class Dictionary implements Serializable {
        /** @Fields serialVersionUID*/
	private static final long serialVersionUID = -2727932447525162791L;
		/** 数据字典id */
        private Integer id;
        /** 类型分类 */
        private String dTypeClassification;
        /** 类型名称 */
        private String dTypeName;
        /** 内容Id */
        private Integer dContentId;
        /** 内容名称 */
        private String dContentName;
        /** 创建人 */
        private Integer dCreateById;
        /** 创建日期 */
        private Timestamp dCreateTime;
        
        
        public Dictionary() {
			super();
		}
        
		public Dictionary(Integer id) {
			super();
			this.id = id;
		}

		public Dictionary(String dTypeClassification, String dTypeName,
				Integer dContentId) {
			super();
			this.dTypeClassification = dTypeClassification;
			this.dTypeName = dTypeName;
			this.dContentId = dContentId;
		}

		@Override
		public String toString() {
			return "Dictionary [id=" + id + ", dTypeClassification="
					+ dTypeClassification + ", dTypeName=" + dTypeName
					+ ", dContentId=" + dContentId + ", dContentName="
					+ dContentName + ", dCreateById=" + dCreateById
					+ ", dCreateTime=" + dCreateTime + "]";
		}

		//get set 方法
        public void setId (Integer  id){
            this.id=id;
        }
        public  Integer getId(){
            return this.id;
        }
        public void setDTypeClassification (String  dTypeClassification){
            this.dTypeClassification=dTypeClassification;
        }
        public  String getDTypeClassification(){
            return this.dTypeClassification;
        }
        public void setDTypeName (String  dTypeName){
            this.dTypeName=dTypeName;
        }
        public  String getDTypeName(){
            return this.dTypeName;
        }
        public void setDContentId (Integer  dContentId){
            this.dContentId=dContentId;
        }
        public  Integer getDContentId(){
            return this.dContentId;
        }
        public void setDContentName (String  dContentName){
            this.dContentName=dContentName;
        }
        public  String getDContentName(){
            return this.dContentName;
        }
        public void setDCreateById (Integer  dCreateById){
            this.dCreateById=dCreateById;
        }
        public  Integer getDCreateById(){
            return this.dCreateById;
        }
        public void setDCreateTime (Timestamp  dCreateTime){
            this.dCreateTime=dCreateTime;
        }
        public  Timestamp getDCreateTime(){
            return this.dCreateTime;
        }
}
