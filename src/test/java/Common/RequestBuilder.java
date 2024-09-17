package Common;

import io.restassured.response.Response;

import static Common.BasePaths.ReqRes_baseURL;
import static Common.ContentType.json_contentType;
import static Common.PayloadBuilder.createUserProfileObject;
import static io.restassured.RestAssured.given;


public class RequestBuilder {

    public static String UserID;

    public static Response createUserProfileResponse() {
        Response response = given().
                when().
                body(createUserProfileObject()).
                contentType(json_contentType).
                log().all().
                post(ReqRes_baseURL + "/api/users").
                then().
                log().all().
                extract().response();
        UserID=response.jsonPath().getString("id");
        return response;
    }

    public static Response getUserProfileResponse() {
        return given().
                when().
                contentType(json_contentType).
                log().all().
                get(ReqRes_baseURL + "/api/users?page=2").
                then().
                log().all().
                extract().response();
    }
}
