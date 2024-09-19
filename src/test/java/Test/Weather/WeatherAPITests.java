package Test.Weather;

import org.testng.annotations.Test;

import static Common.RequestBuilder.createUserProfileResponse;
import static Common.RequestBuilder.registerWeatherStationResponse;
import static org.hamcrest.Matchers.notNullValue;


@Test
public class WeatherAPITests {

    @Test
    public void registerNewWeatherStationTests() {
        registerWeatherStationResponse().
                then().
                assertThat().
                statusCode(201).
                log().all().
                extract().response();

    }

}
