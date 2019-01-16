package com.yyl.util;

import java.io.UnsupportedEncodingException;

/**
 * 解决乱码
 * @author Administrator
 *
 */
public class EncodingTool {
	public static String encodeStr(String str){
		try {
			return new String(str.getBytes("ISO-8859-1"),"UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null; 
		}
	}
}
