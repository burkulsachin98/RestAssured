package day3;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class CoockiesDemo {

	//@Test
	void testCoockies() {

		given()

		.when().get("https://www.google.com/")

		.then()
		.cookie("AEC","AZ6Zc-UgF2IjhihO20M9QVFz7_LMSppXofJ74NzuslWL34hV0huS5K2OUpw")

		.log().all();

	}
	@Test
	void getCoockiesInfo() {

		Response res=	given()

				.when()
				.get("https://www.google.com/");

		//get single cookie info

		String coockie_value = res.getCookie("AEC");
		System.out.println("Value of coockie is =="+coockie_value);

		//get all cookie info

		Map <String,String > cookie_values=res.getCookies();

		//	System.out.println(cookie_values.keySet());// it will print the all keys

		for (String k: cookie_values.keySet()) {

			String cookie_value= res.getCookie(k);
			System.out.println(k+"  "+cookie_value);


		}







	}
}
