package br.com.gmg.page;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.gmg.support.Driver;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.fail;


public class PageBase {

    private static final int LOAD_TIMEOUT = 500;
   
    public PageBase(){
		PageFactory.initElements(Driver.driver, this);
    }

    public void waitForElement(WebElement element){
        try {
            WebDriverWait driverWait = new WebDriverWait(Driver.driver, LOAD_TIMEOUT);
            driverWait.until(ExpectedConditions.visibilityOf(element));
        } catch (Exception e) {
            fail("Tempo excedido para aguardar elemento: "+element);
        }
    }
    public void click(WebElement element){
      
            element.click();
        
    }

    public void writeInField(WebElement element, String keysToSend){
        try {
            waitForElement(element);
            element.clear();
            element.sendKeys(keysToSend);
        } catch (WebDriverException e) {
            fail("Nao foi possivel encontrar o elemento para preencher: "+element +". Pagina: " + Driver.driver.getTitle()+"\n "+e.getMessage());

        }
    }

    public void scroll(WebElement element){
        JavascriptExecutor jse = (JavascriptExecutor) Driver.driver;
        jse.executeScript("window.scrollTo(0," + element.getLocation().y + ")");
    }

    public boolean isVisibility(WebElement element){
        try {
            return element.isDisplayed();
        } catch (NoSuchElementException e){
            return false;
        }
    }

    public void selectElementByVisibleText(WebElement element, String textVisible){
        try {
            new Select(element).selectByVisibleText(textVisible);
        } catch (NoSuchElementException e){
            fail("Erro ao selecionar no elemento: ["+element.getTagName()+ "] com o o valor: "+textVisible);
        }
    }

    public void selectElementByVisibleValue(WebElement element, String valueVisibel){
        try {
            new Select(element).selectByValue(valueVisibel);
        } catch (NoSuchElementException e){
            fail("Erro ao selecionar no elemento: ["+element.getTagName()+ "] com o o valor: "+valueVisibel);
        }
    }

    public List<WebElement> getTableCompleta(WebElement table){

        List<WebElement> tr;
        tr = table.findElements(By.cssSelector("tr"));

        return tr;
    }

    public List<List<WebElement>> getTable(WebElement table) {

        waitForElement(table);

        List<WebElement> tr = table.findElements(By.cssSelector("tr"));
        List<List<WebElement>> tabela = new ArrayList<List<WebElement>>();

        tr.forEach(linhas -> {

            List<WebElement> celulas = linhas.findElements(By.cssSelector("td"));
            List<WebElement> linha = new ArrayList<WebElement>();

            linha.addAll(celulas);
            tabela.add(linha);

        });

        return tabela;
    }


}
