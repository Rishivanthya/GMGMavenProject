package GMG.com.website.steps;


	
import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;

import java.util.HashMap;
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
	    Response res1;



		   //final static String url="http://demo.guru99.com/V4/sinkministatement.php?CUSTOMER_ID=68195&PASSWORD=1234!&Account_No=1";

   
	@Given("^I trigger the get API$")
    public void i_trigger_the_get_API() throws Throwable {
        RestAssured.baseURI = "https://gorest.co.in/public-api";
        Response response = given()
                .contentType(ContentType.JSON)
                .when()
                .get("/posts")
                .then()
                .extract().response();

        System.out.println("API Response Code"+response.statusCode());
        res1= response ;
        //Response header
        String contentType = response.header("Content-Type");
        System.out.println("Content-Type: " + contentType);

    }
        @Then("^I verify API statuscode$")
        public void i_verify_API_statuscode() throws Throwable {
            //Validate Status Code
            System.out.println("API Response Code" + res1.statusCode());
            try {
                if (res1.statusCode() == 200) {
                    Assert.assertTrue(true);
                } else {
                    Assert.assertTrue("STATUS CODE : " + res1.statusCode(), false);
                }
            } catch (Exception e) {
                Assert.assertTrue(false);
            }
        }

    @Then("^I verify title$")
    public void i_verify_title() throws Throwable {
        //Assert Title
        HashMap<String, String> datadetails1 = res1.getBody().jsonPath().get("data[0]");
        String resposnetitle1= datadetails1.get("title");
        System.out.println("restile"+resposnetitle1);
        Assert.assertEquals("Incorrect Title","Vaco et avaritia dens molestiae sonitus vel ulterius voluntarius eligendi caveo tutamen thalassinus tristis umquam astrum vindico placeat.",resposnetitle1);

    }

    @Then("^I verify userid$")
    public void i_verify_userid() throws Throwable {
        //Assert User ID
        // String userId = res1.getBody().jsonPath().get("data[0].user_id").toString();
        List<HashMap<String, Integer>> datadetails = res1.getBody().jsonPath().get("data");
        System.out.println("size:"+datadetails.size());
        for(int i=1;i<=datadetails.size()-1;){
            for (HashMap<String, Integer> mapObj : datadetails) {
                HashMap<String, Integer> data = (HashMap<String, Integer>) mapObj;
                int responseuserid = data.get("user_id");
                System.out.println("responseuseridvalue:" + responseuserid);
                Assert.assertEquals("Invalid ID", i, responseuserid);
                i++;
            }

        }
    }
	}
    
    


	    	      
	    	     
	    	//Response response = RestAssured.given(this.requestSpecification) .headers(headers) .when() .get("https://gorest.co.in/public-api/posts");
	    
	



