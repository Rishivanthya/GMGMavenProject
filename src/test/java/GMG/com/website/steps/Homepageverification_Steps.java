package GMG.com.website.steps;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import GMG.com.website.pages.Homepageverification;
import br.com.gmg.page.PageHome;
import br.com.gmg.support.Driver;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Homepageverification_Steps {

    PageHome homeSeleniumEasy = new PageHome();
    Homepageverification pageverification = new Homepageverification();
    
    
    
   

    @Given("Click on URL and verify whether page is loaded successfully")
    public void the_page_date_pickers_is_visible() throws InterruptedException {
    	
    	Thread.sleep(1000);
    	pageverification.Acceptbutton();
    	
    	//driver2.findElement(By.xpath("//i[@class='glyphicon glyphicon-th']")).click();
       // homeSeleniumEasy.acessarBootstrapDatePicker();
        //pageBootstrap.assertPageTitle();
    }

    @When("click on Men Menu and it should land on Mens page")
    public void MenMenuvalidation() throws InterruptedException {
       // homeSeleniumEasy.acessarBootstrapDatePicker();
    	//pageBootstrapDatePicker.assertPageTitle();
    	Thread.sleep(1000);
    	
    	pageverification.clickMenMenubutton();
    }

	

    @And("click SHOP ALL button")
    public void ClickShopAll() throws InterruptedException {
    	
    	Thread.sleep(1000);
    	pageverification.clickShopbutton();
    }
    
    @Then("Click on any product from PLP")
    public void ClickProduct() throws InterruptedException {
    	
    	Thread.sleep(1000);
        pageverification.Clickonproduct();
        
    	
    }

    @Then("Click on Size")
    public void SelectSize() throws InterruptedException {
    	Thread.sleep(1000);
    	pageverification.SelectSize();
    }

    @And("Add the product to Bag")
    public void AddtoBag() throws InterruptedException {
    	Thread.sleep(2000);
    	pageverification.clickAddtoBag();
    	
    }

    @Then("Click on Cart and validate the product")
    public void ValidateProduct() throws InterruptedException {
    	
    	Thread.sleep(2000);
    	pageverification.verifyAddedProductToCartPage();
    }
    
    
    @Then("Click on Checkout Securely")
 public void Checkoutoption() throws InterruptedException {
    	
    	
    	//pageverification.Checkout();
    	//pageverification.verifyAddedProductToCartPage(Product);
    }
    
    
    @And("Enter the email address")
    public void EnterEmail() throws InterruptedException
    {
    	Thread.sleep(2000);
    	pageverification.EnterEmail();
    }
    
    @Then("click on continue as Guest")
    public void ClickonContinueasGuest() throws InterruptedException
    {
    	Thread.sleep(1000);
    	pageverification.ClickonContinueasGuest();
    }
    
    @Then("fill up the contact details form")
    public void Contactdetails() throws InterruptedException
    {
    	Thread.sleep(1000);
    	pageverification.Contactdetails();
    	
    	
    }
    
    @And("Shipping address")
    
    public void ShippingAddress() throws InterruptedException
    {
    	Thread.sleep(1000);
    	pageverification.ShippingAddress();
    }
    
    
    
    
    
    
  
   
  
}

	  
