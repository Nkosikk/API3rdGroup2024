package Test.Dogs;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static Common.RequestBuilder.*;
import static org.hamcrest.Matchers.notNullValue;

@Test
@Feature("Dogs API")
@Story("Dogs Breeds and Images")

public class DogsTests {
    public void getDogsBreedsTests() {
        getAllDogsBreedsResponse().
                then().
                assertThat().
                statusCode(200).
                log().all().
                extract().response();
    }
}
