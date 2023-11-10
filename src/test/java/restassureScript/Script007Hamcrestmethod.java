package restassureScript;

import static io.restassured.RestAssured.given;

import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;
public class Script007Hamcrestmethod {
	
	// Hamcrest dependency ahs been added to your POM file
		// This depenedency provides us many validation methods that help us to validate the response code

		// equalTo() Hamcrest method
		@Test(priority='1')
		public void ValidateRepsonseBody()
		{
			
			//PMAK-654c65967589fb003f03fcdc-5b7f54d41a4a635796f7240551aa63805c
			String PMapikey = "PMAK-6543b7fb6d0f58002a8ebe36-10174e750054f3d0bacfff1ff81a2f9f63";
			given().baseUri("https://api.postman.com")
			.basePath("/workspaces")
			.header("X-API-Key", PMapikey)
			.when().get()
			.then().statusCode(200)
			// fetch the repsonse body and validate if response includes corrrect values or not
			.body("workspaces[4].id", equalTo("d90967d3-ba05-4cd6-89f2-d49dc6596ae9"),
				  "workspaces[4].name",equalTo("myworkspaceNew"),
				   "workspaces[4].type",equalTo("team"));
			
			
		}
		
		@Test(priority='2')
		public void ValidateRepsonseBody_equlaTo()
		{
			
			given().baseUri("https://petstore.swagger.io")
			.basePath("/v2/user/Uname001")
			.when().get()
			.then().statusCode(200)
			// fetch the repsonse body and validate if response includes corrrect values or not
			.body("username", equalTo("Uname001"),
				  "email", equalTo("Positive@Attitude.com"),
				  "userStatus", equalTo(1));
			
			
		}
		
		
		@Test(priority='3')
		public void ValidateRepsonseBody_hasitems()
		{
			String PMapikey = "PMAK-6543b7fb6d0f58002a8ebe36-10174e750054f3d0bacfff1ff81a2f9f63";
			given().baseUri("https://api.postman.com")
			.basePath("/workspaces")
			.header("X-API-Key", PMapikey)
			.when().get()
			.then().statusCode(200)
			// fetch the repsonse body and validate if response includes corrrect values or not
			.body("workspaces.name", hasItems("Team Workspace","Phase3-Trainer","My Workspace"),
					"workspaces.type", hasItems("team","personal"));
			
			
		}

}
