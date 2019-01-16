package com.yyl.entity.enums;
/**
 * 订单状态
 * @ClassName: OrderStatus
 * @author lkw
 * @date 2019年1月16日 上午9:54:56
 *
 */
public enum OrderStatus {
	PAY(1, "已付款"),
	UNPAY(2, "未付款");
	
	private Integer index;
	
	private String statu;

	private OrderStatus(Integer index, String statu) {
		this.index = index;
		this.statu = statu;
	}

	public Integer getIndex() {
		return index;
	}

	public String getStatu() {
		return statu;
	}
	
	

}
