package com.zz.mycode.dao;

import java.util.Collection;

import com.zz.mycode.pojo.po.Order;

public interface IOrderDao {
	
	void save(Order order);

	void remove(Integer id);
	
	void update(Integer id);
	
	Order get(Integer id);
	
	Collection<Order> getAll();
	
	
	
}
