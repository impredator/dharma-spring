package com.dharma.spring.beans;

public class XmlBean {

	private String name;

	public String getName() {
		System.out.println("get xml bean" + name);
		return name;
	}
	public void setName(String name) {
		System.out.println("set xml bean" + name);
		this.name = name;
	}

}
