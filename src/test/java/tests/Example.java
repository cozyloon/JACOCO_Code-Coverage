package tests;

import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import util.ResponseUtil;


public class Example {

    @Test
    public void testJacoco() {
        ResponseUtil responseUtil = new ResponseUtil();
        Response response = responseUtil.getResponse();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(response.getStatusCode(), HttpStatus.SC_CREATED, "status code not matched");
        softAssert.assertAll();
    }
}
