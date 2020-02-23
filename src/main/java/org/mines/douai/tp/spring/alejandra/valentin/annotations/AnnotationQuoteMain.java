package org.mines.douai.tp.spring.alejandra.valentin.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("AnnotationQuoteMain")
public class AnnotationQuoteMain {
	@Autowired
	//@Qualifier("annotationQuoteBean")
	AnnotationQuoteBean bitcoinBean;
	@Autowired
	//@Qualifier("annotationQuoteBean")
	AnnotationQuoteBean namecoinBean;
	@Autowired
	//@Qualifier("annotationQuoteBean")
	AnnotationQuoteBean litecoinBean;

	public void initalizeQuoteMain() {
		this.bitcoinBean.setName("Bitcoin");
		this.litecoinBean.setName("Litecoin");
		this.namecoinBean.setName("Namecoin");
	}


	// Methode pour initaliser les noms de cryptomonnaies.

	public void printMoneyAndParities() {
		bitcoinBean.printParityInDollars();
		litecoinBean.printParityInDollars();
		namecoinBean.printParityInDollars();
	}


	public AnnotationQuoteBean getBitcoinBean() {
		return bitcoinBean;
	}


	public AnnotationQuoteBean getNamecoinBean() {
		return namecoinBean;
	}


	public AnnotationQuoteBean getLitecoinBean() {
		return litecoinBean;
	}

}
