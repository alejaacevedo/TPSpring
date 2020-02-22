package org.mines.douai.tp.spring.alejandra.valentin.purexml;

import org.mines.douai.tp.spring.alejandra.valentin.QuoteBean;
import org.mines.douai.tp.spring.alejandra.valentin.QuoteServiceBean;

public class QuoteBeanImpl implements QuoteBean {
	String name;
	

	QuoteServiceBean service;

	public QuoteServiceBean getService() {
		return service;
	}

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
