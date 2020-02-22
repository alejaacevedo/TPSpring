/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package org.mines.douai.tp.spring.alejandra;

import org.junit.jupiter.api.Test;
import org.mines.douai.tp.spring.alejandra.valentin.App;
import org.mines.douai.tp.spring.alejandra.valentin.purexml.QuoteBeanImpl;
import org.mines.douai.tp.spring.alejandra.valentin.purexml.QuoteMain;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
   
    
    @Test
	public void should_quote_service_bean_be_injected() {
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
	QuoteBeanImpl bean = applicationContext.getBean("quoteBean", QuoteBeanImpl.class);
	// V�rifie que le bean a bien �t� inject�, sinon le test echou�
	Assertions.assertNotNull(bean.getService());
	}
    
    @Test
    public void should_bitcoin_bean_be_injected() {
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
    	QuoteMain bean = applicationContext.getBean("quoteMain", QuoteMain.class);
    	// V�rifie que le bean a bien �t� inject�, sinon le test echou�
    	Assertions.assertNotNull(bean.getBitcoinBean());
    }
    
    @Test
    public void should_litecoin_bean_be_injected() {
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
    	QuoteMain bean = applicationContext.getBean("quoteMain", QuoteMain.class);
    	// V�rifie que le bean a bien �t� inject�, sinon le test echou�
    	Assertions.assertNotNull(bean.getLitecoinBean());
    }
    
    @Test
    public void should_namecoin_bean_be_injected() {
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
    	QuoteMain bean = applicationContext.getBean("quoteMain", QuoteMain.class);
    	// V�rifie que le bean a bien �t� inject�, sinon le test echou�
    	Assertions.assertNotNull(bean.getNamecoinBean());
    }
    
    @Test
    public void is_bitcoin_bean_name_injected() {
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
    	QuoteMain bean = applicationContext.getBean("quoteMain", QuoteMain.class);
    	bean.initalizeQuoteMain();
    // V�rifie que le bean a bien �t� inject�, sinon le test echou�
     Assertions.assertEquals(bean.getBitcoinBean().getName(), "Bitcoin");
    }
    
    @Test
    public void is_litecoin_bean_name_injected() {
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
    	QuoteMain bean = applicationContext.getBean("quoteMain", QuoteMain.class);
    	bean.initalizeQuoteMain();
    // V�rifie que le bean a bien �t� inject�, sinon le test echou�
     Assertions.assertEquals(bean.getLitecoinBean().getName(), "Litecoin");
     
     
    }
    
    @Test
    public void is_namecoin_bean_name_injected() {
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
    	QuoteMain bean = applicationContext.getBean("quoteMain", QuoteMain.class);
    	bean.initalizeQuoteMain();
    // V�rifie que le bean a bien �t� inject�, sinon le test echou�
     Assertions.assertEquals(bean.getNamecoinBean().getName(), "Namecoin");
    }
    
    
}
