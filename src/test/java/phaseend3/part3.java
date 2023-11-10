package phaseend3;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class part3 {
	
	
	
	@Test
	public void getmethod()
	{
		
		given().baseUri("https://petstore.swagger.io")
		.basePath("/v2/user/Uname001")
		.when().delete()
		.then().statusCode(200)
		// fetch the repsonse body and validate if response includes corrrect values or not
		.body("username", equalTo("Uname001"),
			  "email", equalTo("Positive@Attitude.com"),
			  "userStatus", equalTo(1));
		
		
	}

}
