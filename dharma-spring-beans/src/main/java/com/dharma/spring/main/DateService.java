package com.dharma.spring.main;

import java.util.Date;

public class DateService {

	public void log(String msg){
		System.out.println(new Date()+"::"+msg);
	}
}
