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
    public static JSONObject updateUserProfileObject() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", FirstName);
        jsonObject.put("job", JobName);
        jsonObject.put("address", Address);
        jsonObject.put("CellNumber", CellNumber);


        return jsonObject;
    }
}
