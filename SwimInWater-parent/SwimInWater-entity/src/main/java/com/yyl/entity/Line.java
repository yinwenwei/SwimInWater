package com.yyl.entity;
import java.io.Serializable;
/**
 * 
* @ClassName: Line
* @Description: 线路相关数据模型
* @author lkw
* @date 2019年1月10日 上午8:50:16
*
 */
public class Line implements Serializable {
        /** @Fields serialVersionUID*/
	private static final long serialVersionUID = -272861836759078735L;
		/** 路线id */
        private Integer id;
        /** 景点id */
        private Integer sId;
        /** 线路名称 */
        private String lName;
        /** 线路说明内容 */
        private String lContent;
        /** 线路价格 */
        private Double lPrice;
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
        public void setLPrice (Double  lPrice){
            this.lPrice=lPrice;
        }
        public  Double getLPrice(){
            return this.lPrice;
        }
}
