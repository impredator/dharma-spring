package consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import services.Service;

@Component
public class AnnotateApp {

    //field-based dependency injection
    //@Autowired
    private Service service;

//	constructor-based dependency injection
//	@Autowired
//	public AnnotateApp(Service svc){
//		this.service=svc;
//	}

//  method-based dependency injection
    @Autowired
    public void setService(Service svc){
        this.service=svc;
    }

    public boolean process(String msg, String rec){
        return this.service.send(msg, rec);
    }
}
