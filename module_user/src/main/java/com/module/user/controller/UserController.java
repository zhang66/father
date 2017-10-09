package com.module.user.controller;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.module.user.context.client.OrderClient;
import com.module.user.context.client.entity.Order;
import com.module.user.entity.UserInfo;


@RestController
@RequestMapping("userMgr")
public class UserController {

	@Resource
	private OrderClient orderClient;

	
	@RequestMapping(value="login",produces="application/json")
	public UserInfo login() {

		UserInfo u = new UserInfo();
		u.setId(46783);
		u.setName("天一方");
		Order o = orderClient.getOrderInfo("1");
		u.setOrder(o);
		return u;

	}
	
	
	@RequestMapping(value="post")
	public UserInfo post() {

		UserInfo u = new UserInfo();
		u.setId(46783);
		u.setName("post");
		Order o = orderClient.getOrderInfo("888");
		u.setOrder(o);
		return u;

	}

}
