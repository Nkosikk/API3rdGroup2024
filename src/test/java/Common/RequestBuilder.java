package Common;

import io.restassured.response.Response;

import static Common.BasePaths.*;
import static Common.ContentType.json_contentType;
import static Common.PayloadBuilder.createUserProfileObject;
import static Common.PayloadBuilder.registerNewWeatherStationObject;
import static Common.QueryParameterBuilder.API_key;
import static io.restassured.RestAssured.given;


public class RequestBuilder {

    public static String UserID;
    public static String weatherStationID;


    public static Response createUserProfileResponse() {
        Response response = given().
                when().
                body(createUserProfileObject()).
                contentType(json_contentType).
                log().all().
                post(ReqRes_baseURL + "api/users/").
                then().
                log().all().
                extract().response();
        UserID = response.jsonPath().getString("id");
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

    public static Response getAllDogsBreedsResponse() {
        return given().
                when().
                contentType(json_contentType).
                log().all().
                get(DogsAPI_baseURL + "list/all").
                then().
                log().all().
                extract().response();
    }

    public static Response getRandomImageResponse() {
        return given().
                when().
                contentType(json_contentType).
                log().all().
                get(DogsAPI_baseURL + "image/random").
                then().
                log().all().
                extract().response();
    }

    public static Response registerWeatherStationResponse() {
        Response response = given().
                when().queryParam("appid",API_key).
                body(registerNewWeatherStationObject()).
                contentType(json_contentType).
                log().all().
                post(weather_API_baseURL).
                then().
                log().all().
                extract().response();
        weatherStationID = response.jsonPath().getString("ID");
        return response;
    }


}
