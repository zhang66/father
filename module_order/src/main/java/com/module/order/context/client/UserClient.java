package com.module.order.context.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="user",url = "http://localhost:8081")
public interface UserClient {

	@RequestMapping(value = "userServer/getUser", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	Object getUser(@RequestParam("id") String id);
}
