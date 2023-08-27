package postman;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Bookings {
	@Test
	public void Flyawaya1() {
		String url = "http://localhost:8002/FlyAway/home?source=1&destination=11";
		RestAssured.baseURI= url;
		
		RequestSpecification requestSpecification1= RestAssured.given();
		Response response1 = requestSpecification1.accept(ContentType.JSON).get();
		System.out.println(response1.asPrettyString());
}
}
