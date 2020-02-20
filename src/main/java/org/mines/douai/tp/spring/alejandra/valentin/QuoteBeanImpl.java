package org.mines.douai.tp.spring.alejandra.valentin;

public class QuoteBeanImpl implements QuoteBean {
	String name;
	QuoteServiceBean service;
	
	public String getName(){
		return this.name;
	}
	
	public void printParityInDollars() {
	  System.out.println(service.getParityInDollars(name));
	}
}
