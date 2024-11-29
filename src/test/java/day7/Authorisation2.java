package day7;


import io.restassured.RestAssured;
import io.restassured.response.Response;
public class Authorisation2 {
	
	   public static void main(String[] args) {
	        Response response = RestAssured.given()
	            .auth()
	            .basic("username", "password")  // Providing username and password for basic auth
	            .get("https://api.example.com/protected-resource");

	        System.out.println(response.getStatusCode());  // Print status code
	        System.out.println(response.getBody().asString());  // Print response body
	    }
	}


