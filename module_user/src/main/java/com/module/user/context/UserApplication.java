package com.module.user.context;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * 用户启动项
 * 
 * @author zhangyalin
 *
 */
@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication(scanBasePackages ={"com.module"})
@ImportResource(locations = {"classpath:config/default-conf.xml"})
@EnableWebMvc
public class UserApplication {
	public static void main(String[] args) {
		SpringApplication.run(UserApplication.class, args);
	}
}
