package com.module.user.context.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.module.user.context.client.entity.Order;
import com.module.user.context.client.fallback.OrderClientHystrix;

@FeignClient(value = "order", url = "http://localhost:8082", fallback = OrderClientHystrix.class)
public interface OrderClient {

	@RequestMapping(value = "orderServer/getOrderInfo", method = RequestMethod.POST)
	Order getOrderInfo(@RequestParam("id") String id);

}
