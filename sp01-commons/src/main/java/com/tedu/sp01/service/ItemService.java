package com.tedu.sp01.service;

import java.util.List;

import com.tedu.sp01.pojo.Item;
//商品接口
public interface ItemService {

	//获取指定订单中的商品
	List<Item> getItems(String orderId);
	//减少商品库存
	void decreaseNumber(List<Item> list);
}
