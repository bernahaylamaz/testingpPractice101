import com.github.javafaker.Faker;
import org.junit.Test;

public class practice5_2 {
    @Test
    public void fakerTest(){
        Faker faker = new Faker();
      String fakeName =  faker.name().firstName();
      String lName = faker.name().lastName();
      String fName = faker.name().username();
        System.out.println(fakeName);
        System.out.println(lName);
        System.out.println(fName);
        System.out.println(faker.name().title());
        System.out.println(faker.phoneNumber().cellPhone());
        System.out.println(faker.internet().emailAddress());
        System.out.println(faker.number().digits(5));
    }

    
}
