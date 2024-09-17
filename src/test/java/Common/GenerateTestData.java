package Common;

import com.github.javafaker.Faker;

public class GenerateTestData {

    static Faker faker = new Faker();
    public static String FirstName = faker.name().firstName();
    public static String JobName = faker.job().title();

}
