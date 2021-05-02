package br.com.gmg.page;

import static br.com.gmg.support.Driver.driver;
import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import br.com.gmg.support.Log;



public class PageHome extends PageBase {

	@FindBy(id = "image-darkener")
	private WebElement alertLearnSelenium;

	@FindBy(xpath = "//a[contains(text(), 'No, thanks!')]")
	private WebElement buttonNoThanks;

	@FindBy(linkText="Input Forms")
	private WebElement inputForms;

	@FindBy(linkText="Simple Form Demo")
	private WebElement simpleFormDemo;

	@FindBy(linkText="Checkbox Demo")
	private WebElement checkBoxDemo;

	@FindBy(linkText="Radio Buttons Demo")
	private WebElement radioButtonsDemo;

	@FindBy(linkText="Select Dropdown List")
	private WebElement selectDropdownList;

	@FindBy(linkText="Input Form Submit")
	private WebElement inputFormSubmit;

	@FindBy(linkText="Ajax Form Submit")
	private WebElement ajaxFormSubmit;

	@FindBy(linkText="Table Sort & Search")
	private WebElement tableSortAndSearch;

	@FindBy(linkText="JQuery Select dropdown")
	private WebElement jQuerySelectDropdown;

	@FindBy(id="btn_basic_example")
	private WebElement botaoStart;

	@FindBy(linkText="Table")
	private WebElement table;

	@FindBy(linkText = "Table Data Search")
	private WebElement tableDataSearch;

	@FindBy(linkText="Date pickers")
	private WebElement datePickers;

	@FindBy(linkText = "Bootstrap Date Picker")
	private WebElement bootstrapDatePicker;

	@FindBy(xpath = "//span[@itemprop=\"sku\"]")
    private WebElement productName;
	@FindBy(xpath = "//span[@itemprop=\"sku\"]")
    private WebElement productModel;
    @FindBy(id = "our_price_display")
    private WebElement productPrice;
    @FindBy(id = "reduction_percent_display")
    private WebElement productDiscount;
    @FindBy(id = "quantity_wanted")
    private WebElement productQty;
    @FindBy(id = "group_1")
    private WebElement productSize;
    @FindBy(xpath = "//select[@id='group_1']/option[@selected=\"selected\"]")
    private WebElement defaultSizeSelection;
    @FindBy(xpath = "//*[@id='color_to_pick_list']/li")
    private List<WebElement> productColorList;
	public void accessInputForms() throws InterruptedException {
		refuseAlertLearnSelenium();
		Thread.sleep(3000);
		waitForElement(inputForms);
		click(inputForms);
	}

	public void accessTable() throws InterruptedException {
		Thread.sleep(1000);
		refuseAlertLearnSelenium();
		waitForElement(table);
		click(table);
	}

	public void accessDatePickers() throws InterruptedException {
		Thread.sleep(1000);
		refuseAlertLearnSelenium();
		waitForElement(datePickers);
		click(datePickers);
	}

	public void refuseAlertLearnSelenium() throws InterruptedException {
		Thread.sleep(10000);
		if(isVisibility(alertLearnSelenium)){
			click(buttonNoThanks);
		}
	}

	public void accessSimpleFormDemo() throws InterruptedException {
		accessInputForms();
		waitForElement(simpleFormDemo);
		click(simpleFormDemo);
		Log.info("Acessando página SimpleFormDemo");
	}

	public void acessarCheckBoxDemo() throws InterruptedException {
		accessInputForms();
		Thread.sleep(1000);
		click(checkBoxDemo);
		Log.info("Acessando página CheckBoxDemo");
	}

	public void acessarRadioButtonsDemo() throws InterruptedException {
		accessInputForms();
		waitForElement(radioButtonsDemo);
		click(radioButtonsDemo);
		Log.info("Acessando página RadioButtonsDemo");
	}

	public void acessarSelectDropdownList() throws InterruptedException {
		accessInputForms();
		waitForElement(selectDropdownList);
		click(selectDropdownList);
		Log.info("Acessando página SelectDropdown List");
	}

	public void acessarAjaxFormSubmit() throws InterruptedException {
		accessInputForms();
		waitForElement(ajaxFormSubmit);
		click(ajaxFormSubmit);
		Log.info("Acessando página Ajax Form Submit");
	}

	public void acessarTableDataSearch() throws InterruptedException {
		accessTable();
		waitForElement(tableDataSearch);
		click(tableDataSearch);
	}

	public void acessarBootstrapDatePicker() throws InterruptedException {
		accessDatePickers();
		waitForElement(bootstrapDatePicker);
		click(bootstrapDatePicker);
	}

	public void acessarTableSortAndSearch() throws InterruptedException {
		accessTable();
		waitForElement(tableSortAndSearch);
		click(tableSortAndSearch);
		Log.info("Acessando página Table Sort And Search");
	}
	

    public void assertPageTitle(){
        assertEquals("All men's. Right here.", driver.getTitle());
    }
    
    
    
    
   /* public void verifyProductDetailspage(){
        assertPresent(productName);
        assertPresent(productModel);
        assertPresent(productDiscount);
        assertPresent(productPrice);
        assertPresent(productQty);
        

        WebElement colorSelection = productColorList.get(1);

        productDetailsBean.setProductName(productName.getText());
        productDetailsBean.setProductModelNo(productModel.getText());
        productDetailsBean.setProductDiscount(productDiscount.getText());
        productDetailsBean.setProductPrice(productPrice.getText());
        productDetailsBean.setProductQty(productQty.getText());
        productDetailsBean.setProductSize(productSize.getText());
        productDetailsBean.setProductColor(colorSelection.getText());

        System.setProperty("product.productName", productDetailsBean.getProductName());
        System.setProperty("product.productModel", productDetailsBean.getProductModelNo());
        System.setProperty("product.productDiscount", productDetailsBean.getProductDiscount());
        System.setProperty("product.productPrice", productDetailsBean.getProductPrice());
        System.setProperty("product.productQty", productDetailsBean.getProductQty());
        System.setProperty("product.productColor", productDetailsBean.getProductColor());

    }*/
    

}
