import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class practice6_6 {
    @Test
    public void newWindowTest(){
        System.setProperty("web-driver.chrome.driver", "/Users/haylamazb@moravian.edu/Documents/selenium dependencies/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        String googleWindowHandle = driver.getWindowHandle();
        //2. window
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.amazon.com");
        String amazonHandle = driver.getWindowHandle();
        //open window3
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.linkedin.com");
        String linkedinHandle = driver.getWindowHandle();







    }



}
