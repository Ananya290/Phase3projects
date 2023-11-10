package restassureScript;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Script001SetUpCheck {

	@Test
	public void setupCheck() {
		
		//this is https get method like selenium 
		Response res = RestAssured.get("https://reqres.in/api/users/2");
		
		
		System.out.println(res.asString());
		
		System.out.println(res.getStatusCode());

	}

}
