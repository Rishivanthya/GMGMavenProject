package GMG.com.website.steps;

import GMG.com.website.pages.Homepageverification;
import GMG.com.website.pages.PLPPageValidation;
import br.com.gmg.page.PageHome;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

	
	

public class PLPpagevalidation_Steps {

    PageHome homeSeleniumEasy = new PageHome();
    PLPPageValidation pageBootstrapDatePicker = new PLPPageValidation();

   /* @Given("Click on Men Menu and verify whether page is loaded successfully ")
    public void the_page_date_pickers_is_visible() throws InterruptedException {
       // homeSeleniumEasy.acessarBootstrapDatePicker();
    	//pageBootstrapDatePicker.assertPageTitle();
    	
    	pageBootstrapDatePicker.clickMenMenubutton();
    }

	

   @When("click SHOP ALL button")
    public void click_to_select_the_date() throws InterruptedException {
	   pageBootstrapDatePicker.clickShopbutton();
    }

  /*  @When("click the Today button")
    public void click_the_today_button() throws InterruptedException {
        pageBootstrapDatePicker.clickTodayDate();
    }

    @Then("the current date must be selected")
    public void the_current_date_must_be_selected() {
        pageBootstrapDatePicker.assertTodayDate();
    }
    */

}



