package consumer;

import services.Service;

public class XMLApp {

    private Service service;

    //constructor-based dependency injection
//	public XMLApp(Service svc) {
//		this.service = svc;
//	}

    //setter-based/method-based dependency injection
    public void setService(Service svc){
        this.service=svc;
    }

    public boolean process(String msg, String rec) {
        return this.service.send(msg, rec);
    }
}
