package com.dharma.spring.main;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Configuration
@ComponentScan(value = "com.dharma.spring.main")
public class Config implements InitializingBean, DisposableBean {

    @Bean()
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public DateService getService() {
        return new DateService();
    }

    @PostConstruct
    public void init() {
        System.out.println("post construct");
    }

    @PreDestroy
    public void finish() {
        System.out.println("pre destruct");
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("main init");
    }

    @Override
    public void destroy() {
        System.out.println("main destroy");
    }
}
