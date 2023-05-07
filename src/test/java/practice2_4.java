import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice2_4 {
    public static void main(String[] args) {
        System.setProperty("web-driver.chrome.driver","/Users/haylamazb@moravian.edu/Documents/selenium dependencies/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
    }
}
