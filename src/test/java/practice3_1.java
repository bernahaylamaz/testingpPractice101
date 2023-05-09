import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;

import javax.swing.text.Element;

public class practice3_1 {
    @Test
    public void locators(){
        System.setProperty("web-driver.chrome.driver","/Users/haylamazb@moravian.edu/Documents/selenium dependencies/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/login/");
        driver.findElement(By.id("email")).sendKeys("bernahaylamaz@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("Seyrantepe9.");
        driver.findElement(By.id("loginbutton")).click();
        WebElement username = driver.findElement(By.className("_1vp5"));
        System.out.println(username);
        String actualUsernameIdText = username.getText();
        System.out.println(actualUsernameIdText);
        String expectedUserID = "Berna";
        Assert.assertEquals(actualUsernameIdText,expectedUserID);
        driver.quit();
    }
}
