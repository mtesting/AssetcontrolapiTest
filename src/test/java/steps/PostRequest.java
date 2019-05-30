package steps;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;
import org.junit.Test;
import org.junit.Assert;
import cucumber.api.java.en.Given;
import io.restassured.specification.RequestSpecification;
import java.net.MalformedURLException;
import java.net.URL;
import static io.restassured.RestAssured.given;


public class PostRequest {

    String payload;
    Response resp;
    String endURL;

    /** connecting to end Url*/
    public void endURL()
    {
         endURL = "https://petstore.swagger.io";
    }
    /** sending post request*/
    public void postRequest() throws MalformedURLException {
        payload= "{\r\n" +
                "  \"id\": 0,\r\n" +
                "  \"petId\": 0,\r\n" +
                "  \"quantity\": 0,\r\n" +
                "  \"shipDate\": \"2019-05-30T11:08:23.428Z\",\r\n" +
                "  \"status\": \"placed\",\r\n" +
                "  \"complete\": false\r\n" +
                "}";

        resp = given().header(new Header("content-Type","application/json")).body(payload).when().post(new URL(endURL));
    }

    /** getting the response back*/
    public void getResponse(){
        System.out.println(resp.getBody().asString());
    }
}
