package test;

import consumer.XMLApp;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLClient {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        XMLApp app = context.getBean(XMLApp.class);

        app.process("Hi Ashton", "ashton@me.com");

        context.close();
    }

}
