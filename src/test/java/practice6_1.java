import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class practice6_1 {
    WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("web-driver.chrome.driver", "/Users/haylamazb@moravian.edu/Documents/selenium dependencies/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/javascript_alerts");
    }
        @Test
        public void acceptAlert () {
        WebElement button1 = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        button1.click();
      String alertText =  driver.switchTo().alert().getText();
      Assert.assertEquals("Text does not match","I am a JS Alert", alertText);
      driver.switchTo().alert().accept();
      String result1 =driver.findElement(By.id("result")).getText();
      Assert.assertEquals("You successfully clicked an alert",result1);
        }
        @Test
    public void secondAlert(){
        WebElement button2 =driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        button2.click();
        String alertText2 =driver.switchTo().alert().getText();
        Assert.assertEquals("Text does not match","I am a JS Confirm", alertText2);
        driver.switchTo().alert().dismiss();
        String result2 = driver.findElement(By.id("result")).getText();
        Assert.assertEquals("You clicked: Cancel",result2);
        }
        @Test
    public void lastAlertTest(){
        WebElement button3 = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        button3.click();
        String alertText3 =driver.switchTo().alert().getText();
        Assert.assertEquals("I am a JS prompt", alertText3);
        driver.switchTo().alert().sendKeys("I understand");
        driver.switchTo().alert().accept();
        String result3 =  driver.findElement(By.id("result")).getText();
        Assert.assertEquals("You entered: I understand",result3);
        }
    }


