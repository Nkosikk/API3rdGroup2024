package Common;

import com.github.javafaker.Faker;

public class GenerateTestData {

    static Faker faker = new Faker();
    public static String FirstName = faker.name().firstName();
    public static String JobName = faker.job().title();
    public  static String cityName = faker.address().cityName();
   //public  static  Float latitude = Float.valueOf(faker.address().latitude());
    //public  static  Float longitude = Float.valueOf(faker.address().longitude());
    //public  static  Float altitude = Float.valueOf(faker.address().latitude());

}
