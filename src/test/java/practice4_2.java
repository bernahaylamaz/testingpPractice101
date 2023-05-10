import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Time;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class practice4_2 {
    WebDriver driver;
    @Before
    public void setUp(){
        System.setProperty("web-driver.chrome.driver","/Users/haylamazb@moravian.edu/Documents/selenium dependencies/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }
    @Test
    public void test1Checkbox(){
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        WebElement checkbox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        Assert.assertTrue(!checkbox1.isSelected());
        WebElement checkbox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
        Assert.assertTrue(checkbox2.isSelected());
        checkbox1.click();
        checkbox2.click();

        if (!checkbox1.isSelected()){
            checkbox1.click();
        }
        if (!checkbox2.isSelected()){
            checkbox2.click();
        }
Assert.assertTrue(checkbox2.isSelected());
        Assert.assertTrue(checkbox1.isSelected());



    }

}
