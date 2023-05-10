import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice4_1 {
    WebDriver driver;
    @Before
    public void beforeclass(){
        System.setProperty("web-driver.chrome.driver","/Users/haylamazb@moravian.edu/Documents/selenium dependencies/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/login/");
    }
    @Test
            public void xpathAndCss() throws InterruptedException {

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("bernahaylamaz@gmail.com");
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("#pass")).sendKeys("14531453");


        driver.quit();
    }

}
