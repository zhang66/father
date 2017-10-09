package com.module.order.context.server;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.module.order.entity.Order;

@RequestMapping("orderServer")
@RestController
@CrossOrigin
public class OrderServer {

	@RequestMapping("getOrderInfo")
	public Order getOrderInfo(String id) {
		Order o = new Order();
		o.setOrderId(id);
		o.setOrderName("跨域获取订单信息");
		return o;
	}

}
