package com.yyl.entity;
import java.io.Serializable;
/**
 * 
* @ClassName: Picture
* @Description: 图片相关数据模型
* @author lkw
* @date 2019年1月10日 上午8:50:42
*
 */
public class Picture implements Serializable {
        /** @Fields serialVersionUID */
	private static final long serialVersionUID = -3816609038446744932L;
		/** 图片id */
        private Integer id;
        /** 类型 (1,用户头像 2,景点图片 3,酒店图片) */
        private String pType;
        /** {类型id} (用户id,景点id,酒店id) */
        private Integer pTypeId;
        /** 相对路径 */
        private String pRelativePath;
        /** 绝对路径 */
        private String pAbsolutePath;
        
        
        public Picture() {
			super();
		}
        
		public Picture(Integer id, String pType, Integer pTypeId) {
			super();
			this.id = id;
			this.pType = pType;
			this.pTypeId = pTypeId;
		}

		public Picture(String pType, Integer pTypeId, String pRelativePath,
				String pAbsolutePath) {
			super();
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
