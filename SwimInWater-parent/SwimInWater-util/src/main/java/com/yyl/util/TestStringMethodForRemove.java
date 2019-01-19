package com.yyl.util;

import java.util.ArrayList;
import java.util.List;
/**
 * 手动分页循环逻辑
 * @ClassName: TestStringMethodForRemove
 * @author lkw
 * @date 2019年1月17日 上午8:56:53
 *
 */
public class TestStringMethodForRemove {
	public static void main(String[] args) {
		
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		
		list.remove(4);
		
		Integer currentPage = 1;
		Integer size = 5;
		System.out.println("--------"+list.size());
		// 分页list
		Integer start = (currentPage-1)*size;
		// 定义从第几条数据开始,循环多少条
		for (int i = start; i < start+size; i++) {
			// 判断索引不能大于或者等于总记录数
			if(i < list.size()){
				System.out.println("循环索引:"+ i + "集合内容:" + list.get(i));
				// 分页list.add()
			}
		}
		
		
	}

}
