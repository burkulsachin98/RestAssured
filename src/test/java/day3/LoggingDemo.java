package day3;


import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class LoggingDemo {
	@Test

	void testlogs() {

		given()

		.when()
		.get("https://reqres.in/api/users?page=2")

		.then()
		//.log().headers();
		.log().all();

		//.log().body();
		//.log().cookies();








	}

}
