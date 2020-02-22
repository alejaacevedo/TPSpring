package org.mines.douai.tp.spring.alejandra.valentin.purexml;

import org.mines.douai.tp.spring.alejandra.valentin.QuoteBean;

public class QuoteMain {
	
	QuoteBean bitcoinBean;
	QuoteBean namecoinBean;
	QuoteBean litecoinBean;
	
	public void initalizeQuoteMain() {
		this.bitcoinBean.setName("Bitcoin");
		this.litecoinBean.setName("Litecoin");
		this.namecoinBean.setName("Namecoin");
	}
	
	public QuoteBean getBitcoinBean() {
		return bitcoinBean;
	}

	public void setBitcoinBean(QuoteBean bitcoinBean) {
		this.bitcoinBean = bitcoinBean;
	}

	public QuoteBean getNamecoinBean() {
		return namecoinBean;
	}

	public void setNamecoinBean(QuoteBean namecoinBean) {
		this.namecoinBean = namecoinBean;
	}

	public QuoteBean getLitecoinBean() {
		return litecoinBean;
	}

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
