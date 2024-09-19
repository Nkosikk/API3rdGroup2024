package Test.Weather;

import org.testng.annotations.Test;

import static Common.RequestBuilder.*;
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

    @Test(priority = 1)
    public void getNewWeatherStationTests() {
      getWeatherStationResponse().
                then().
                assertThat().
                statusCode(200).
                log().all().
                extract().response();

    }
}
