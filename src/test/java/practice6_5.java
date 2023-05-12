
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class practice6_5 {

    @Test
    public void newTabs() {
        System.setProperty("web-driver.chrome.driver", "/Users/haylamazb@moravian.edu/Documents/selenium dependencies/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        //open tab1
        driver.get("https://www.google.com");
        String googleWindowHandle = driver.getWindowHandle();

        //open tab2 and swiching
        WebDriver tab2 = driver.switchTo().newWindow(WindowType.TAB);
        tab2.get("https://www.amazon.com");
        String amazonWindowHandle =driver.getWindowHandle();

        //open tab 3 and switch it.
        WebDriver tab3 = driver.switchTo().newWindow(WindowType.TAB);
        tab3.get("https://www.linkedin.com");
        String linkedinWindowHandle =driver.getWindowHandle();
        driver.switchTo().window(googleWindowHandle);
        driver.switchTo().window(amazonWindowHandle);





    }




    }

