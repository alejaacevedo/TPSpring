package org.mines.douai.tp.spring.alejandra.valentin;


public class QuoteMain {
	
	QuoteBean bitcoinBean;
	QuoteBean namecoinBean;
	QuoteBean litecoinBean;
	
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

	public void printMoneyAndParities() {
		System.out.println("The Parities for the following cryptoCurrencies are: ");
		System.out.print( bitcoinBean.getName() + " : " );
		bitcoinBean.printParityInDollars();
		System.out.print( litecoinBean.getName() + " : " );
		litecoinBean.printParityInDollars();
		System.out.print( namecoinBean.getName() + " : " );
		namecoinBean.printParityInDollars();		
	}
}
