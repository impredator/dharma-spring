package test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import configuration.DIConfig;
import consumer.AnnotateApp;

public class Client {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfig.class);
        AnnotateApp app = context.getBean(AnnotateApp.class);

        app.process("Hi Ashton", "ashton@me.com");

        context.close();
    }

}

