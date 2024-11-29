package day5;



import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import  io.restassured.module.jsv.JsonSchemaValidator;

	

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;



public class ParsingXMLResponse {
	@Test
	void testXMLResponse() {
		
		RestAssured.baseURI="https://jsonplaceholder.typicode.com";
		
		String response =RestAssured.given()
		
		
		.when()
		.get("/posts/2").getBody().asString();
		assertThat(response,mathchesJsonSchemaInClassPath("JSONSchemaValidation.json"));
		
		
	
	      
		
		
		//.body(JsonSchemaValidator.matchesJsonSchemaInClasspath(new File("JSONSchemaValidation.json")));
		

		
		
		//JsonSchemaValidator.
	    //  matchesJsonSchema
		
		
		
	}
	
	
	

}
