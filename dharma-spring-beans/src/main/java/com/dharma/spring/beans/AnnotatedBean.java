package com.dharma.spring.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

@Service
@Scope(WebApplicationContext.SCOPE_REQUEST)
public class AnnotatedBean implements InitializingBean, DisposableBean {

	private int studentID;

	public int getStudentID() {
		System.out.println("get annotate bean");
		return studentID;
	}

	public void setStudentID(int studentID) {
		System.out.println("set annotate bean");
		this.studentID = studentID;
	}

	@Override
	public void afterPropertiesSet() {
		System.out.println("Bean initialization code");
	}

	@Override
	public void destroy() {
        System.out.println("Bean destruction code");
	}

}
