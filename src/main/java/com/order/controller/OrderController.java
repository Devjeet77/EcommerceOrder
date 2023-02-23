package com.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.order.entity.Order;
import com.order.services.OrderService;

@RestController
@CrossOrigin
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@PostMapping("/order")
	public Order postOrder(@RequestBody Order order) throws Exception{
		return orderService.postOrder(order);
	}
	@GetMapping("/order/get")
	public List<Order> getOrders(){
		return orderService.getOrders();
	}
}
