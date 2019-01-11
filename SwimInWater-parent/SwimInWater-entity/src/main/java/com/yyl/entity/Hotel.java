package com.yyl.entity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
* 
* @ClassName: Dictionary
* @Description: 酒店相关
* @author Auto-generated
* @date 2019年1月11日 下午 4:40:50
*
 */
@ApiModel(value = "Hotel", description = "酒店相关")
public class Hotel implements Serializable {
        /** @Fields serialVersionUID */
	private static final long serialVersionUID = -6922458424090994533L;
		/** 酒店id */
        @ApiModelProperty(value = "酒店id")
        private Integer id;
        /** 酒店名称 */
        @ApiModelProperty(value = "酒店名称")
        private String hName;
        /** 景点id */
        @ApiModelProperty(value = "景点id")
        private Integer sId;
        /** 酒店等级 (1,三星级酒店 2,四星级酒店 3,五星级酒店) */
        @ApiModelProperty(value = "酒店等级 (1,三星级酒店 2,四星级酒店 3,五星级酒店)")
        private Integer hGrage;
        /** 酒店详情 */
        @ApiModelProperty(value = "酒店详情")
        private String hContent;
        
        public Hotel() {
			super();
		}
        
		public Hotel(Integer id, Integer sId) {
			super();
			this.id = id;
			this.sId = sId;
		}

		public Hotel(Integer id, String hName, Integer sId, Integer hGrage,
				String hContent) {
			super();
			this.id = id;
			this.hName = hName;
			this.sId = sId;
			this.hGrage = hGrage;
			this.hContent = hContent;
		}

		@Override
		public String toString() {
			return "Hotel [id=" + id + ", hName=" + hName + ", sId=" + sId
					+ ", hGrage=" + hGrage + ", hContent=" + hContent + "]";
		}

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
