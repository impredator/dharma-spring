package com.dharma.spring.service;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import com.dharma.spring.bean.Employee;

public class EmployeeService implements InitializingBean, DisposableBean{

	private Employee employee;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public EmployeeService(){
		System.out.println("EmployeeService no-args constructor called");
	}

	public void destroy() {
		System.out.println("EmployeeService Closing resources");
	}

	public void afterPropertiesSet() {
		System.out.println("EmployeeService initializing to dummy value");
		if(employee.getName() == null){
			employee.setName("Ashton");
		}
	}
}
