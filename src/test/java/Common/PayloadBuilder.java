package Common;

import org.json.simple.JSONObject;

import static Common.GenerateTestData.*;

public class PayloadBuilder {


    public static JSONObject createUserProfileObject() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", FirstName);
        jsonObject.put("job", JobName);

        return jsonObject;
    }

    public static JSONObject registerNewWeatherStationObject() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("external_id", "SF_TEST001");
        jsonObject.put("name", "San Francisco Test Station");
        jsonObject.put("latitude", 65.87);
        jsonObject.put("longitude", -36.78);
        jsonObject.put("altitude", 12.34);

        return jsonObject;
    }
}


