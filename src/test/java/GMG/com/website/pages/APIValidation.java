package GMG.com.website.pages;


	
import br.com.gmg.page.PageBase;
import br.com.gmg.support.Log;
import br.com.gmg.support.Utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.ArrayList;

import static br.com.gmg.support.Driver.driver;
import static io.restassured.RestAssured.*;
import static java.util.concurrent.TimeUnit.MILLISECONDS;
import static org.junit.Assert.assertEquals;
	

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Logger;



import org.junit.Test;




import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

	

	public class APIValidation extends PageBase {
		
	
		public static String apiEndPointUri;
		public static String testName;
		public static String CONTENT_TYPE;
		public static String STATUS_CODE;
		public static String FILE_PATH;
		public static String REQUESTBODY;
		public static String RESPONSEBODY;
		


		public void BaseURI() throws InterruptedException {
	    	

			  RestAssured.baseURI = "https://gorest.co.in/public-api/posts";
			  
		}
		    
		   
	  
	    
	   
	    
	   
	    	      
	    	     
	    	//Response response = RestAssured.given(this.requestSpecification) .headers(headers) .when() .get("https://gorest.co.in/public-api/posts");
	    	    	
	    	        
	    	    	
	    	    	
	              
	               
	    	
	    	       // Headers header = getHeaders();

	    }
			
		

		
	
