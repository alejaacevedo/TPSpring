package org.mines.douai.tp.spring.alejandra.valentin;

public interface QuoteBean {
	void setName(String name); // pouvoir initialiser les names de chaque bean via cette methode
	String getName();
	void printParityInDollars();

}
