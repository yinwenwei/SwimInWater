package com.yyl.entity;
import java.io.Serializable;
/**
 * 
* @ClassName: Hotel
* @Description: 酒店相关数据模型
* @author lkw
* @date 2019年1月10日 上午8:50:04
*
 */
public class Hotel implements Serializable {
        /** @Fields serialVersionUID */
	private static final long serialVersionUID = -4838686086699039097L;
		/** 酒店id */
        private Integer id;
        /** 酒店名称 */
        private String hName;
        /** 景点id */
        private Integer sId;
        /** 酒店等级 (1,三星级酒店 2,四星级酒店 3,五星级酒店) */
        private Integer hGrage;
        /** 酒店详情 */
        private String hContent;
        
        public Hotel() {
			super();
			// TODO Auto-generated constructor stub
		}
        
		public Hotel(Integer id) {
			super();
			this.id = id;
		}
		

		public Hotel(String hName, Integer hGrage) {
			super();
			this.hName = hName;
			this.hGrage = hGrage;
		}

		public Hotel(Integer id, Integer sId) {
			super();
			this.id = id;
			this.sId = sId;
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
