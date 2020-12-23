package com.atguigu.gmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
//import org.springframework.cloud.netflix.hystrix.EnableHystrix;


@EnableDubbo  //开启基于注解的Dubbo功能
//@ImportResource(locations="classpath:provider.xml")
//@EnableDubbo(scanBasePackages="com.atguigu.gmall")
//@EnableHystrix //开启服务容错
@SpringBootApplication
public class BootUserServiceProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootUserServiceProviderApplication.class, args);
	}

}
