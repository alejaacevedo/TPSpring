package org.mines.douai.tp.spring.alejandra.valentin.annotations;

import org.mines.douai.tp.spring.alejandra.valentin.QuoteBean;
import org.mines.douai.tp.spring.alejandra.valentin.QuoteServiceBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class AnnotationQuoteBeanImpl implements QuoteBean {
	String name;
	@Autowired
	QuoteServiceBean service;

	public QuoteServiceBean getService() {
		return service;
	}
	@Autowired
	public void setService(QuoteServiceBean service) {
		this.service = service;
	}

	public String getName() {
		return this.name;
	}
	
	// Should setName be necessary??
	public void setName(String name) {
		this.name = name;
	}

	public void printParityInDollars() {
		System.out.println(" La parité de la monnaie " + getName() + " est de : ");
		System.out.println(service.getParityInDollars(name));
		System.out.println("hashcode : " + hashCode()); // Prints hashCode for the current Quote Bean
		System.out.println("--------------");
	}
}
