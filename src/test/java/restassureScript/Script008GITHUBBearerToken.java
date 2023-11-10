package restassureScript;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;
import io.restassured.response.Response;


public class Script008GITHUBBearerToken {

	

	@Test(priority='1')
	public void Authorization_bearertoken()
	{
		
	Response res=	given().baseUri("https://api.github.com")
		.basePath("/user/repos")
		.header("Authorization","Bearer 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")
		.when().get()
		.then().statusCode(200)
		.extract().response();
	
		res.prettyPrint();
	}
	
	
	

	
	@Test(priority='2')
	public void Authorization_bearertoken_specificrepo()
	{
		
	Response res=	given().baseUri("https://api.github.com")
		.basePath("/repos/Ananya290/java-practice-Project")
		.header("Authorization","Bearer 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")
		.when().get()
		.then().statusCode(200)
		.extract().response();
	
		res.prettyPrint();
	}
	
	
	
	

}
		
