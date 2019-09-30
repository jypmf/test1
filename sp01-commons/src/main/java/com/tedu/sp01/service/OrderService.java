package com.tedu.sp01.service;

import com.tedu.sp01.pojo.Order;

//订单对象
public interface OrderService {
	
	//获取订单 
	Order getOrder(String orderId);
	//保存 订单
	void addOrder(Order order);
}
