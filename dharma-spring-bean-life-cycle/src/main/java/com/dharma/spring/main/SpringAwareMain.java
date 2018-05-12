package com.dharma.spring.main;

import com.dharma.spring.service.MyAwareService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAwareMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-aware.xml");

		ctx.getBean("myAwareService", MyAwareService.class);

		ctx.close();
	}

}
