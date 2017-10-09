package com.module.user.context.client.fallback;

import org.springframework.stereotype.Component;

import com.module.user.context.client.OrderClient;
import com.module.user.context.client.entity.Order;

@Component
public class OrderClientHystrix implements OrderClient {

	@Override
	public Order getOrderInfo(String id) {
		throw new RuntimeException("订单信息获取异常");

	}

}
