package com.order.services;

import java.util.List;

import com.order.entity.Order;

public interface OrderService {

	public Order postOrder(Order order) throws Exception;

	public List<Order> getOrders();

}
