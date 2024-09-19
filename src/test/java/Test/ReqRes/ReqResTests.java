package Test.ReqRes;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

import static Common.RequestBuilder.*;
import static org.hamcrest.Matchers.notNullValue;

@Test
@Feature("ReqRes")
@Story("User Profile")
public class ReqResTests {

    public void createUserProfileTests() {
        createUserProfileResponse().
                then().
                assertThat().
                statusCode(201).
                body("name",notNullValue()).
                body("job",notNullValue());
    }

    public void getUserProfileTests() {
        getUserProfileResponse().
                then().
                assertThat().
                statusCode(200);
    }
//    public void updateUserProfileTests() {
//        updateUserProfileResponse().
//                then().
//                assertThat().
//                statusCode(200).
//                body("name",notNullValue()).
//                body("job",notNullValue()).
//                body("address",notNullValue()).
//                body("CellNumber",notNullValue());
//
//    }
}
