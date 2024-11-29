package day7;


import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

public class Authentications {
	@Test
	void testBasicAuthentication(){
		given()
		
		.auth().basic("postman", "password")
		.when()
		.get("https://postman-echo.com/basic-auth")
		.then()
		.statusCode(200)
		.body("authenticated", equalTo(true));
		
	}
	void testDigestAuthentication(){
		given()
		
		.auth().digest("postman", "password")
		.when()
		.get("https://postman-echo.com/basic-auth")
		.then()
		.statusCode(200)
		.body("authenticated", equalTo(true));
		
	}
	void testPreemtiveAuthentication(){
		given()
		
		.auth().preemptive().basic("postman", "password")
		.when()
		.get("https://postman-echo.com/basic-auth")
		.then()
		.statusCode(200)
		.body("authenticated", equalTo(true));
		
	}
	void testBearerTokenAuthentication(){
		
		String bearertoken= "";
		
		given()
		
		.headers("Authorization","Bearer "+bearertoken)
		.when()
		.get("https://postman-echo.com/basic-auth")
		.then()
		.statusCode(200)
		.log().all();
		
	}
	void testOAuthAuthentication() {
		
		given()
		
			.auth().oauth("CunsumerKey","customerSecret","Accesstoken","tokanseret")
			
			.when()
			.get("url")
			
			.then()
			.statusCode(200)
			.log().all();
		
		
	}
void testOAut2hAuthentication() {
		
		given()
		
			.auth().oauth2("generated token")
			
			.when()
			.get("url")
			
			.then()
			.statusCode(200)
			.log().all();
		
		
	}
	
	
	
}
