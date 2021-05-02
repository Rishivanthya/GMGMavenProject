package br.com.gmg.steps;

import br.com.gmg.page.PageBase;
import br.com.gmg.support.Driver;
import br.com.gmg.support.Property;
import io.cucumber.java.After;
import io.cucumber.java.Before;



public class Hooks extends PageBase {

	@Before
    public void before() throws InterruptedException {
		Driver.driver = Driver.getDriver();
		Driver.driver.navigate().to(Property.URL);
	}
	  
	 @After
	 public void after() {
		 if(Driver.driver != null){
			 Driver.driver.quit();
		 }
		 Driver.driver = null;
	  }

}
