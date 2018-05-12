package com.dharma.spring.service;

import com.dharma.spring.bean.Employee;

public class XmlEmployeeService {

	private Employee employee;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public XmlEmployeeService(){
		System.out.println("XmlEmployeeService no-args constructor called");
	}

	public void destroy() {
		System.out.println("XmlEmployeeService Closing resources");
	}

	public void init() {
		System.out.println("XmlEmployeeService initializing to dummy value");
		if(employee.getName() == null){
			employee.setName("Ashton");
		}
	}
}
