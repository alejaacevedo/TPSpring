package org.mines.douai.tp.spring.alejandra.valentin.annotations;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

@Component
public interface AnnotationQuoteServiceBean {

	 BigDecimal getParityInDollars(String money); 
}
