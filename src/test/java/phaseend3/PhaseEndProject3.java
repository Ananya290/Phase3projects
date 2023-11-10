package phaseend3;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PhaseEndProject3 {
	
	@Test(priority ='1')
	public void part1() {
		
		
		String jsonrequest = "{\r\n"
				+ "\"id\": 344,\r\n"
				+ "\"category\": {\r\n"
				+ " \"id\": 0,\r\n"
				+ " \"name\": \"string\"\r\n"
				+ "},\r\n"
				+ "\"name\": \"Doggie\",\r\n"
				+ "\"photoUrls\": [\r\n"
				+ " \"string\"\r\n"
				+ "],\r\n"
				+ "\"tags\": [\r\n"
				+ " {\r\n"
				+ " \"id\": 0,\r\n"
				+ " \"name\": \"string\"\r\n"
				+ " }\r\n"
				+ "],\r\n"
				+ "\"status\": \"available\"\r\n"
				+ "}";
		
		RestAssured.given()
		.baseUri("https://petstore.swagger.io")
		.basePath("/v2/pet")
		.contentType(ContentType.JSON)
		.accept("application/json")
		.body(jsonrequest)
		.when().post()  // execute post request
		.then()
		.statusCode(200)
		//.body("Pet.id", Matchers.equalTo(344))
		.log().all();
	}
	
	

	@Test(priority ='2')
	public void GetMethodBDDStyle() {
		
		
		RestAssured.given()
		.baseUri("https://petstore.swagger.io")
		.queryParam("PetID", "2023")
		.when().get()
		.then()
		.statusCode(200)
		.log().all();
	}
	

	@Test(priority ='3')

	
	public void delete() {
		
		
		RestAssured.given()
		.baseUri("https://petstore.swagger.io")
		.queryParam("PetID", "2023")
		.when().delete()
		.then()
		.statusCode(200)
		.log().all();
	}
	
	
	

}
