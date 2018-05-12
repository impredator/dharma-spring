package com.dharma.spring.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Service {

    @PostConstruct
    public void init() {
        System.out.println("Post construct: Service init method called");
    }

    public Service() {
        System.out.println("Service no-args constructor called");
    }

    @PreDestroy
    public void destory() {
        System.out.println("Pre destroy: Service destroy method called");
    }
}
