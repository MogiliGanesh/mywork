package Api.RestAssured;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;


public class AppTest {
@Test
public void GetStatusCode() {
	
	given().
	when().
		get("https://reqres.in/api/users").
	then().
	assertThat().
		statusCode(200);
}}
