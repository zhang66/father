package com.module.order.context;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * 订单模块
 * 
 * @author zhangyalin
 *
 */

@SpringBootApplication(scanBasePackages = { "com.module" })
@ImportResource(locations = { "classpath:config/default-conf.xml" })
@EnableEurekaClient
@EnableFeignClients
@EnableWebMvc
public class OrderApplication {
	public static void main(String[] args) {
		SpringApplication.run(OrderApplication.class, args);
	}
}
