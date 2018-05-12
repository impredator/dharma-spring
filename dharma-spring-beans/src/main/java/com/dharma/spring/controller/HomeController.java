package com.dharma.spring.controller;

import com.dharma.spring.beans.AnnotatedBean;
import com.dharma.spring.beans.XmlBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@Scope("request")
public class HomeController {

	private XmlBean xmlBean;

	private AnnotatedBean annotatedBean;

	@Autowired
	public void setXmlBean(XmlBean xmlBean) {
	    System.out.println("xml bean setter");
		this.xmlBean = xmlBean;
	}

	@Autowired
	public void setAnnotatedBean(AnnotatedBean obj) {
        System.out.println("xml bean annotate");
		this.annotatedBean = obj;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		System.out.println("XmlBean hashcode="+ xmlBean.hashCode());
		System.out.println("AnnotatedBean hashcode="+ annotatedBean.hashCode());

		annotatedBean.setStudentID(9527);
		model.addAttribute("student", annotatedBean.getStudentID());
		model.addAttribute("greeting", "Hi" );

		return "home";
	}

}
