package org.mines.douai.tp.spring.alejandra.valentin.annotations;

import org.springframework.stereotype.Component;

@Component
public interface AnnotationQuoteBean {
	void setName(String name); // pouvoir initialiser les names de chaque bean via cette methode
	String getName();
	void printParityInDollars();

}
