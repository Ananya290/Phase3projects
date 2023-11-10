package restassureScript;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class LogginginRestAssured {
	
	@Test
	public void loggingmethods()
	{
		String PMapikey = "PMAK-6543b7fb6d0f58002a8ebe36-10174e750054f3d0bacfff1ff81a2f9f63";
		given().baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("X-API-Key", PMapikey)
		.when().get()
		//.then().statusCode(200).log().headers()
		//.then().log().ifError()
		//.then().statusCode(200).log().cookies();
		.then().statusCode(200).log().all();
		
		
	}


}
