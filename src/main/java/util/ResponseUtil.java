package util;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

// Remove final from the class and static from the method to get 100% code coverage sample
public final class ResponseUtil {

    public static Response getResponse() {

        return RestAssured.given()
                .baseUri("https://restful-booker.herokuapp.com/ping")
                .contentType(ContentType.JSON)
                .body("{\"id\":\"1\",\"name\":\"test\"}")
                .when().get();
    }
}
