package postman;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Test1 {
	@Test
	public void Flyawaya() {
		String url = "http://localhost:8082/FlyAway/memberbookings";
		RestAssured.baseURI= url;
		
		RequestSpecification requestSpecification = RestAssured.given();
		Response response = requestSpecification.accept(ContentType.JSON).get();
		System.out.println(response.asPrettyString());
}
}
