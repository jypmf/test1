package com.tedu.sp01.service;

import java.util.List;

import com.tedu.sp01.pojo.Item;
//��Ʒ�ӿ�
public interface ItemService {

	//��ȡָ�������е���Ʒ
	List<Item> getItems(String orderId);
	//������Ʒ���
	void decreaseNumber(List<Item> list);
}