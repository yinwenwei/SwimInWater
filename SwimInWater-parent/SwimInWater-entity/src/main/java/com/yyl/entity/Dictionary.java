package com.yyl.entity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.sql.*;
/**
* 
* @ClassName: Dictionary
* @Description: 数据字典相关
* @author Auto-generated
* @date 2019年1月11日 下午 4:40:50
*
 */
@ApiModel(value = "Dictionary", description = "数据字典相关")
public class Dictionary implements Serializable {
        /** @Fields serialVersionUID */
	private static final long serialVersionUID = -2727932447525162791L;
		/** 数据字典id */
        @ApiModelProperty(value = "数据字典id")
        private Integer id;
        /** 类型分类 */
        @ApiModelProperty(value = "类型分类")
        private String dTypeClassification;
        /** 类型名称 */
        @ApiModelProperty(value = "类型名称")
        private String dTypeName;
        /** 内容Id */
        @ApiModelProperty(value = "内容Id")
        private Integer dContentId;
        /** 内容名称 */
        @ApiModelProperty(value = "内容名称")
        private String dContentName;
        /** 创建人 */
        @ApiModelProperty(value = "创建人")
        private Integer dCreateById;
        /** 创建日期 */
        @ApiModelProperty(value = "创建日期")
        private Timestamp dCreateTime;
        
        public Dictionary() {
			super();
		}
        
		public Dictionary(String dTypeClassification, String dTypeName,
				Integer dContentId, String dContentName) {
			super();
			this.dTypeClassification = dTypeClassification;
			this.dTypeName = dTypeName;
			this.dContentId = dContentId;
			this.dContentName = dContentName;
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
