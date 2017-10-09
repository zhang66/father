package com.module.user.context.server;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.module.user.entity.UserInfo;

@RestController
@CrossOrigin
@RequestMapping("userServer")
public class UserServer {

	@RequestMapping("getUser")
	public UserInfo getUser(String id) {

		UserInfo u = new UserInfo();
		u.setId(46783);
		u.setName("跨域服务获取用户信息");
		return u;

	}

}
