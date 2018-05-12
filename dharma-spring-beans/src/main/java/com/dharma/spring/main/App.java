package com.dharma.spring.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
				Config.class);
		DateService service = ctx.getBean(DateService.class);

		service.log("Hi");

		DateService newService = ctx.getBean(DateService.class);
		System.out.println("service hashcode="+service.hashCode());
		System.out.println("newService hashcode="+newService.hashCode());

		ctx.close();
	}

}
