package com.yyl.entity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
* 图片相关
* @ClassName: Dictionary
* @author Auto-generated
* @date 2019年1月11日 下午 4:40:50
*
 */
@ApiModel(value = "Picture", description = "图片相关")
public class Picture implements Serializable {
        /** @Fields serialVersionUID */
	private static final long serialVersionUID = -823467625059782663L;
		/** 图片id */
        @ApiModelProperty(value = "图片id")
        private Integer id;
        /** 类型 (1,用户头像 2,景点图片 3,酒店图片) */
        @ApiModelProperty(value = "类型 (1,用户头像 2,景点图片 3,酒店图片)")
        private String pType;
        /** {类型id} (用户id,景点id,酒店id) */
        @ApiModelProperty(value = "{类型id} (用户id,景点id,酒店id)")
        private Integer pTypeId;
        /** 相对路径 */
        @ApiModelProperty(value = "相对路径")
        private String pRelativePath;
        /** 绝对路径 */
        @ApiModelProperty(value = "绝对路径")
        private String pAbsolutePath;
        
        
		public Picture() {
			super();
		}
		
		public Picture(Integer id, String pType, Integer pTypeId,
				String pRelativePath, String pAbsolutePath) {
			super();
			this.id = id;
			this.pType = pType;
			this.pTypeId = pTypeId;
			this.pRelativePath = pRelativePath;
			this.pAbsolutePath = pAbsolutePath;
		}

		@Override
		public String toString() {
			return "Picture [id=" + id + ", pType=" + pType + ", pTypeId="
					+ pTypeId + ", pRelativePath=" + pRelativePath
					+ ", pAbsolutePath=" + pAbsolutePath + "]";
		}

		//get set 方法
        public void setId (Integer  id){
            this.id=id;
        }
        public  Integer getId(){
            return this.id;
        }
        public void setPType (String  pType){
            this.pType=pType;
        }
        public  String getPType(){
            return this.pType;
        }
        public void setPTypeId (Integer  pTypeId){
            this.pTypeId=pTypeId;
        }
        public  Integer getPTypeId(){
            return this.pTypeId;
        }
        public void setPRelativePath (String  pRelativePath){
            this.pRelativePath=pRelativePath;
        }
        public  String getPRelativePath(){
            return this.pRelativePath;
        }
        public void setPAbsolutePath (String  pAbsolutePath){
            this.pAbsolutePath=pAbsolutePath;
        }
        public  String getPAbsolutePath(){
            return this.pAbsolutePath;
        }
}
