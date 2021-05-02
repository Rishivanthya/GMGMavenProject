package GMG.com.website.pages;

import br.com.gmg.page.PageBase;
import br.com.gmg.support.Log;
import br.com.gmg.support.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import static br.com.gmg.support.Driver.driver;
import static org.junit.Assert.assertEquals;


import java.util.List;


public class Homepageverification extends PageBase {

    @FindBy(xpath = "//i[@class='glyphicon glyphicon-th']")
    private WebElement buttonSelectDate;

    @FindBy(xpath = "/html/body/div[3]/div[1]/table/tfoot/tr[1]/th")
    private WebElement todayDate;

    @FindBy(xpath = "//*[@id=\"sandbox-container1\"]/div/input")
    private WebElement date;
    
    @FindBy(xpath = "//*[@id=\"sg-navbar-collapse\"]/div/div/nav/div[2]/div[3]/div/ul/li[1]/a")
    private WebElement MenMenubutton;

    @FindBy(xpath = "//*[@id=\"mens\"]/div/div/div[1]/section/figcaption/div/a")
    private WebElement Shopbutton;

    @FindBy(xpath = "//*[@id=\"sandbox-container1\"]/div/input")
    private WebElement date1;

    @FindBy(xpath = "//*[@id=\"product-search-results\"]/div[2]/div[2]/div/div[1]/div/div/div[2]/div[1]/a")
    private WebElement clickproduct;
    
    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[4]/div/div[2]/div/div[6]/div[2]/div/div/div[4]/div/button/span[1]")
    private WebElement Color;
    
   @FindBy(xpath = "//*[@id=\"consent-tracking\"]/div/div/button[1]")
   private WebElement Agree;
    
    @FindBy(xpath = "/html/body/div[1]/header/div[1]/nav/div[1]/div/div[3]/div/div[2]/a/span[1]")
    private WebElement productConfiramationOverlay;
    
    @FindBy(css = "line-item-name")
    private WebElement productNameOnCart;
    
    @FindBy(xpath = "/html/body/div[1]/header/div[1]/nav/div[1]/div/div[3]/div/div[2]/a")
    private WebElement ClickonCart;
    
    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[4]/div/div[2]/div/div[7]/div/div/div/div[2]/button")
    private WebElement AddtoBag;
 
    @FindBy(id = "select2-vendorSize-shoesize-container")
    private WebElement AddSize;
    
    @FindBy(xpath = "/html/body/div[1]/header/div[1]/nav/div[1]/div/div[3]/div/div[3]/div[1]/button/span[1]")
    private WebElement Addcartbutton;
   
    
    
    
    
    @FindBy(id = "guest-email")
    private WebElement EnterEmailfield;
    
    @FindBy(xpath = "//*[@id=\"register\"]/form[2]/button")
    private WebElement GuestLogin;
    
    @FindBy(id = "shippingPhoneNumberdefault")
    private WebElement MobileNumber;
    
    @FindBy(id = "shippingFirstNamedefault")
    private WebElement Firstname;
    
    @FindBy(id = "shippingLastNamedefault")
    private WebElement Lastname;
    
    @FindBy(id = "shippingAddressOnedefault")
    private WebElement Addressline1;
    
    @FindBy(id = "shippingAddressTwodefault")
    private WebElement Addressline2;
    
    
    @FindBy(id = "shippingZipCodedefault")
    private WebElement Zipcode;
   
    public void clickMenMenubutton() throws InterruptedException {
		// TODO Auto-generated method stub
		
	
        click(MenMenubutton);
		
	}
    
    public void click(WebElement element){
        
        element.click();
    
}

	public void clickShopbutton() throws InterruptedException {
		// TODO Auto-generated method stub
		
        click(Shopbutton);
		
		
	}
	
	public void clickColor() throws InterruptedException {
		// TODO Auto-generated method stub
		
        click(Color);
		
		
	}
	
	public void clickAddtoBag() throws InterruptedException {
		// TODO Auto-generated method stub
		
        click(AddtoBag);
		
		
	}
	
	public void Acceptbutton()
	{
		click(Agree);
	}
	
	
	

    public void assertPageTitle(){
        assertEquals("SSSS Home", driver.getTitle());
    }

    
    public void Clickonproduct()
    {
    	click(clickproduct);
    	
    }
    

public void clickonCart()
{
	click(ClickonCart);
}
    
    

    public void verifyAddedProductToCartPage() throws InterruptedException {
       //waitForElement(productConfiramationOverlay);
      click(Addcartbutton);
      Thread.sleep(1000);
    }
    
    
    public void SelectSize() throws InterruptedException
    {
    	
    	 Select se = new Select(driver.findElement(By.id("vendorSize-shoesize")));
        
    	   se.selectByVisibleText("EU 40");
    	 
    	   
     
    
        }
   
  public void Checkout() throws InterruptedException
  {
	  Thread.sleep(1000);
	  //driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/nav/div[1]/div/div[3]/div/div[3]/div[2]/div[2]/div[2]/div[3]/div[2]/a")).click();
	  Thread.sleep(5000);
   
  }
    


public void EnterEmail()
{
	EnterEmailfield.sendKeys("rishi_vanthya@yahoo.com");
}
    


public void ClickonContinueasGuest()
{
	click(GuestLogin);
}


public void Contactdetails()
{
	
	
	Select Title = new Select(driver.findElement(By.id("select2-shippingSalutationdefault-container")));
    
	   Title.selectByVisibleText("Mrs");
	   
	   MobileNumber.sendKeys("567773832");
	   Firstname.sendKeys("Rishivanthya");
	   Lastname.sendKeys("GTS");
	   
	   
	   
}


public void ShippingAddress()
{
	   
	   Addressline1.sendKeys("Dubai JVC");
	   Addressline2.sendKeys("JVC flat 710");
	   
	Select Region = new Select(driver.findElement(By.id("shippingCitydefault")));
	    
	   Region.selectByValue("Dubai");
	   
	Select Area = new Select(driver.findElement(By.id("shippingAreadefault")));
	    
	   Area.selectByValue("Al Bada");
	   Zipcode.sendKeys("6878");
	   
}   
	
}




    

