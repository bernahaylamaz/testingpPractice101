import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class practice4_3 {
    WebDriver driver;
    @Before
    public void setUp(){
        System.setProperty("web-driver.chrome.driver","/Users/haylamazb@moravian.edu/Documents/selenium dependencies/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @Test
    public void Tets1RadioButton(){
        driver.get("https://www.facebook.com");

        driver.findElement(By.linkText("Create new account")).click();

        driver.findElement(By.xpath("//input[@type='radio']")).click();




    }
}
