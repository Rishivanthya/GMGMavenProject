package GMG.com.website.pages;


	
	import br.com.gmg.page.PageBase;
import br.com.gmg.support.Log;
import br.com.gmg.support.Utils;

import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;

import static br.com.gmg.support.Driver.driver;
import static org.junit.Assert.assertEquals;


	public class PLPPageValidation extends PageBase {

		@FindBy(xpath = "//*[@id=\"mens\"]/div/div/div[1]/section/figcaption/div/a")
	    private WebElement MenMenubutton;

	    @FindBy(xpath = "//*[@id=\"mens\"]/div/div/div[1]/section/figcaption/div/a")
	    private WebElement Shopbutton;

	    @FindBy(xpath = "//*[@id=\"sandbox-container1\"]/div/input")
	    private WebElement date;

	    
	    
	    
	    
	    public void assertPageTitle(){
	        assertEquals("All men's. Right here.", driver.getTitle());
	    }
	    
	    public void clickMenMenubutton() throws InterruptedException {
			// TODO Auto-generated method stub
			
			Thread.sleep(1000);
	        click(MenMenubutton);
			
		}

		public void clickShopbutton() throws InterruptedException {
			// TODO Auto-generated method stub
			Thread.sleep(1000);
	        click(Shopbutton);
			
			
		}

	

	   /* public void clickSelectDate() throws InterruptedException {
	        Thread.sleep(1000);
	        click(buttonSelectDate);
	        Log.info("Click selecionar data");

	    }

	    public void clickTodayDate() throws InterruptedException {
	        Thread.sleep(1000);
	        click(todayDate);
	        Log.info("Data atual selecionada");

	    }

	    public void assertTodayDate() {
	        assertEquals(Utils.getDataAtualFormatddMMyyyy(), date.getAttribute("value"));
	        Log.info("Validação concluída com sucesso");

	    }*/
	}



