package day2;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.hamcrest.Matcher;
import org.testng.annotations.Test;

import java.util.HashMap;

public class DiffWaysToCreateThePostRequestBody {
	int id;
	

	@Test(priority=0)
	void testPostUsingHashMap() {

		HashMap data = new HashMap();
		data.put("fruit", "Banana");

		String courseArr[] = { "Small", "Large" };
		data.put("size", courseArr);

		data.put("color", "Yellow");

		given().contentType("application/json").body(data)

				.when().post("http://localhost:3000/sample1")
				
				.then()
				.statusCode(201);
				
	}
	
	void deleteUser() {
		
		
	}

}
