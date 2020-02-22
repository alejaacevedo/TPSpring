package org.mines.douai.tp.spring.alejandra.valentin.annotations;

import org.mines.douai.tp.spring.alejandra.valentin.QuoteBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AnnotationQuoteMain {
	@Autowired
	QuoteBean bitcoinBean;
	@Autowired
	QuoteBean namecoinBean;
	@Autowired
	QuoteBean litecoinBean;

	public void initalizeQuoteMain() {
		this.bitcoinBean.setName("Bitcoin");
		this.litecoinBean.setName("Litecoin");
		this.namecoinBean.setName("Namecoin");
	}

	public QuoteBean getBitcoinBean() {
		return bitcoinBean;
	}

	@Autowired
	public void setBitcoinBean(QuoteBean bitcoinBean) {
		this.bitcoinBean = bitcoinBean;
	}

	public QuoteBean getNamecoinBean() {
		return namecoinBean;
	}

	@Autowired
	public void setNamecoinBean(QuoteBean namecoinBean) {
		this.namecoinBean = namecoinBean;
	}

	public QuoteBean getLitecoinBean() {
		return litecoinBean;
	}

	@Autowired
	public void setLitecoinBean(QuoteBean litecoinBean) {
		this.litecoinBean = litecoinBean;
	}

	// Methode pour initaliser les noms de cryptomonnaies.

	public void printMoneyAndParities() {
		bitcoinBean.printParityInDollars();
		litecoinBean.printParityInDollars();
		namecoinBean.printParityInDollars();
	}
}
