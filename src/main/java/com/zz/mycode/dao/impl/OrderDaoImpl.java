package com.zz.mycode.dao.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.zz.mycode.dao.IOrderDao;
import com.zz.mycode.pojo.po.Order;

public class OrderDaoImpl implements IOrderDao {

	private static Map<Integer,Order> orders = null;
	//创建虚拟数据
	static {
		orders = new HashMap<Integer,Order>();
		orders.put(1, new Order(1,"订单1",20.1));
		orders.put(1, new Order(2,"订单1",20.1));
		orders.put(1, new Order(3,"订单1",20.1));
		orders.put(1, new Order(4,"订单1",20.1));

	}
	
	private static Integer initId = 6;
	
	
	
	@Override
	public void save(Order order) {
		if(order.getId()==null){
			
			order.setId(initId++);
		}
		orders.put(order.getId(), order);
	}

	@Override
	public void remove(Integer id) {
		
		orders.remove(id);
	}

	@Override
	public void update(Integer id) {
		

	}

	@Override
	public Order get(Integer id) {
		
		return orders.get(id);
	}

	@Override
	public Collection<Order> getAll() {
		// TODO Auto-generated method stub
		return orders.values();
	}

}
