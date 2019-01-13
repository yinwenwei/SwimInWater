package com.yyl.entity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
* 线路相关
* @ClassName: Dictionary
* @author Auto-generated
* @date 2019年1月11日 下午 4:40:50
*
 */
@ApiModel(value = "Line", description = "线路相关")
public class Line implements Serializable {
        /** @Fields serialVersionUID */
	private static final long serialVersionUID = -6712788815348560679L;
		/** 路线id */
        @ApiModelProperty(value = "路线id")
        private Integer id;
        /** 景点id */
        @ApiModelProperty(value = "景点id")
        private Integer sId;
        /** 线路名称 */
        @ApiModelProperty(value = "线路名称")
        private String lName;
        /** 线路说明内容 */
        @ApiModelProperty(value = "线路说明内容")
        private String lContent;
        
        public Line() {
			super();
		}
        
		public Line(Integer id, Integer sId) {
			super();
			this.id = id;
			this.sId = sId;
		}

		public Line(Integer id, Integer sId, String lName, String lContent) {
			super();
			this.id = id;
			this.sId = sId;
			this.lName = lName;
			this.lContent = lContent;
		}

		@Override
		public String toString() {
			return "Line [id=" + id + ", sId=" + sId + ", lName=" + lName
					+ ", lContent=" + lContent + "]";
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
