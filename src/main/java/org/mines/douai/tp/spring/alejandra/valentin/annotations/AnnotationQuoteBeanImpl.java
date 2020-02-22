package org.mines.douai.tp.spring.alejandra.valentin.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class AnnotationQuoteBeanImpl implements AnnotationQuoteBean {
	String name;
	@Autowired()
	AnnotationQuoteServiceBean service;

	public AnnotationQuoteServiceBean getService() {
		return service;
	}

	public String getName() {
		return this.name;
	}

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
