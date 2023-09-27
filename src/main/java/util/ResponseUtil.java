package util;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ResponseUtil {

    public Response getResponse() {

        return RestAssured.given()
                .baseUri("https://restful-booker.herokuapp.com/ping")
                .contentType(ContentType.JSON)
                .body("{\"id\":\"1\",\"name\":\"test\"}")
                .when().get();
    }
}
