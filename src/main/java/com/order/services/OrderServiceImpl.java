package com.order.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.order.entity.Order;
import com.order.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepository;

	@Override
	public Order postOrder(Order order) throws Exception {
		// TODO Auto-generated method stub
		return orderRepository.save(order);
	}

	@Override
	public List<Order> getOrders() {
		// TODO Auto-generated method stub
		return orderRepository.findAll();
	}
}
