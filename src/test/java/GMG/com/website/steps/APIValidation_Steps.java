package GMG.com.website.steps;


	
import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;

import java.util.List;

import org.junit.Assert;



import GMG.com.website.pages.APIValidation;
import br.com.gmg.page.PageBase;
import br.com.gmg.page.PageHome;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Headers;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;




import static io.restassured.RestAssured.given;

	

	public class APIValidation_Steps extends PageBase {
		
	
		
		

		PageHome WebsiteVerification = new PageHome();
	    APIValidation APIverification = new APIValidation();
	   



		   //final static String url="http://demo.guru99.com/V4/sinkministatement.php?CUSTOMER_ID=68195&PASSWORD=1234!&Account_No=1";

	  @Given("validate the Status code of the API")
	    public void SuccessstatuscodeValidation() throws InterruptedException {
	    	
		  
		  Response response = get("https://gorest.co.in/public-api/posts");
		  int statusCode = response.getStatusCode();
		  Assert.assertEquals(statusCode /*actual value*/, 200 /*expected value*/);
		  System.out.println("Success status code of api :"+statusCode);
	    }

	  
	  //@Then("Validate the Error status code of the API")
	    
	 /* public void Errorstatuscode()throws InterruptedException 
	  {
		  
		  Response response = get(baseURI);
		  int statusCode = response.getStatusCode();
	//	  Assert.assertEquals(statusCode /*actual value*//*expected value*/;
	//	  System.out.println("Error status code of api :"+statusCode);
		 
	//}
	
	    @When("I try to get all the Response Header")
	    	
	    	 public  void GetHeaders() throws InterruptedException{
	    	
	    	 Response response = get("https://gorest.co.in/public-api/posts");
	    	Headers allHeaders = response.getHeaders();
	    	System.out.println("Header response "+allHeaders);
	
	    	
	    }
	    
	    @Then("I try to verify the response header")
	    
	    public void ValidateHeaders()
	    {
	    
	     Response response = get("https://gorest.co.in/public-api/posts");
	     String contentType = response.header("Content-Type");
	     Assert.assertEquals(contentType /* actual value */, "application/json; charset=utf-8" /* expected value */);
	     System.out.println("Content Type from the API is "+contentType);
	     
	     String serverType =  response.header("Server");
	     Assert.assertEquals(serverType /* actual value */, "nginx" /* expected value */);
	     System.out.println("Server Type from the API is"+serverType);
	     String contentEncoding = response.header("Content-Encoding");
	     Assert.assertEquals(contentEncoding /* actual value */, "gzip" /* expected value */);
	     System.out.println("ContentEncoding from the API is"+contentEncoding);
	    }
	
	     
	    
	    
	    @When("Fetch all the Usertitles from the response body")
	     public void titles() throws InterruptedException 
	    
	    {
	    
	       //List jsonResponse = response.jsonPath().getList("$");
	    	
	    	
	    	
	    	List<String> titles = get("https://gorest.co.in/public-api/posts").jsonPath().getList("$");

	        //System.out.println(jsonResponse.size());
	    
	      //  String usernames = response.jsonPath().getString("title");
	        System.out.println(titles);
	    }
    
	}

   
        
	    	      
	    	     
	    	//Response response = RestAssured.given(this.requestSpecification) .headers(headers) .when() .get("https://gorest.co.in/public-api/posts");
	    	    	
	    	        
	    	    	
	    	    	
	              
	               
	    	
	    	       // Headers header = getHeaders();

	    
			
		

		
	

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
	



