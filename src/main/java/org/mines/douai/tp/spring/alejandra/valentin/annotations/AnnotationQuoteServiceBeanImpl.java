package org.mines.douai.tp.spring.alejandra.valentin.annotations;

import java.math.BigDecimal;
import java.util.HashMap;

import org.mines.douai.tp.spring.alejandra.valentin.QuoteServiceBean;
import org.springframework.stereotype.Component;

@Component
public class AnnotationQuoteServiceBeanImpl implements QuoteServiceBean {
	private HashMap<String,BigDecimal> parity;
	
	public AnnotationQuoteServiceBeanImpl() {
		this.parity = new HashMap<String, BigDecimal>();
		this.parity.put("Bitcoin", new BigDecimal("15.34")); //create a bigdecimal that is not a float
		this.parity.put("Litecoin", new BigDecimal("6.12"));
		this.parity.put("Namecoin", new BigDecimal("0.12"));
	}
	
 public BigDecimal getParityInDollars(String country) {
	 BigDecimal tmp= parity.get(country);
	 parity.replace(country, parity.get(country).add(new BigDecimal(1)));
	 return tmp;
 }
 
}
