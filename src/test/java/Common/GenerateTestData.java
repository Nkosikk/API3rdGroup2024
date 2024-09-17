package Common;

import com.github.javafaker.Faker;
import com.github.javafaker.PhoneNumber;

public class GenerateTestData {

    static Faker faker = new Faker();
    public static String FirstName = faker.name().firstName();
    public static String JobName = faker.job().title();
    public static String  Address=faker.address().cityName();
    public static String CellNumber = faker.phoneNumber().phoneNumber();

}
