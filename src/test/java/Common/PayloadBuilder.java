package Common;

import org.json.simple.JSONObject;
import static Common.GenerateTestData.FirstName;
import static Common.GenerateTestData.JobName;

public class PayloadBuilder {

    public static JSONObject createUserProfileObject() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", FirstName);
        jsonObject.put("job", JobName);

        return jsonObject;
    }
}
