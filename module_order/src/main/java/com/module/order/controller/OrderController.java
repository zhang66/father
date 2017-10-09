package com.module.order.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.module.order.entity.Order;

@RestController
@RequestMapping("orderMgr")
public class OrderController {

	@RequestMapping("getOrder")
	public Object getOrder() {
		Order o = new Order();
		o.setOrderId("20170808");
		o.setOrderName("假设对象");
		return o;
	}

}
