import consumer.AnnotateApp;
import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import services.Service;

@Configuration
@ComponentScan(value="consumer")
public class ClientTest {

    private AnnotationConfigApplicationContext context = null;

    @Bean
    public Service getMessageService() {
        return new Service(){

            public boolean send(String msg, String rec) {
                System.out.println("Mock Service");
                return true;
            }

        };
    }

    @Before
    public void setUp() {
        context = new AnnotationConfigApplicationContext(ClientTest.class);
    }

    @After
    public void tearDown() {
        context.close();
    }

    @Test
    public void test() {
        AnnotateApp app = context.getBean(AnnotateApp.class);
        Assert.assertTrue(app.process("Hi Ashton", "ashton@me.com"));
    }

}
