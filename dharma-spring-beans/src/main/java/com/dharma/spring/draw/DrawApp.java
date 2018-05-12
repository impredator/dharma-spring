package com.dharma.spring.draw;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class DrawApp {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        context.registerShutdownHook(); //jvm closing hook

        Triangle triangle = (Triangle) context.getBean("dharmaTriangle");

        triangle.draw();

    }

}