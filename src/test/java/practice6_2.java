import com.beust.ah.A;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class practice6_2 {
    WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("web-driver.chrome.driver", "/Users/haylamazb@moravian.edu/Documents/selenium dependencies/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/iframe");
    }
    @Test
    public void iFrameTest(){
       String header = driver.findElement(By.xpath("//h3")).getText();
        Assert.assertTrue(header.contains("Editor"));
        //switch the frame by index
        driver.switchTo().frame(0);
        WebElement textBox =driver.findElement(By.xpath("//p"));
        textBox.clear();
        textBox.sendKeys("This text box is inside the iframe");
        driver.switchTo().defaultContent();
       WebElement elementalSelenium = driver.findElement(By.linkText("Elemental Selenium"));
       Assert.assertTrue(elementalSelenium.isDisplayed());
    }

}
