import com.github.javafaker.Faker;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class practice5_3 {
    WebDriver driver;
    Faker faker = new Faker();
    @Before
    public void setUp(){
        System.setProperty("web-driver.chrome.driver","/Users/haylamazb@moravian.edu/Documents/selenium dependencies/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
    }
    @Test
    public void testFakers(){
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(faker.internet().emailAddress());

        driver.findElement(By.cssSelector("#pass")).sendKeys(faker.internet().password());






    }

}
