package com.dharma.spring.main;

import com.dharma.spring.service.XmlEmployeeService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

		System.out.println("Spring Context initialized");

		XmlEmployeeService service = ctx.getBean("myEmployeeService", XmlEmployeeService.class);
		//EmployeeService service = ctx.getBean("employeeService", EmployeeService.class);

		System.out.println("Bean retrieved from Spring Context");

		System.out.println("Employee Name="+service.getEmployee().getName());

		ctx.close();
		System.out.println("Spring Context Closed");
	}

}
