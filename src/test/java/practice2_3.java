import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice2_3 {
    public static void main(String[] args) {
        System.setProperty("web-driver.chrome.driver","/Users/haylamazb@moravian.edu/Documents/selenium dependencies/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        String pageSource = driver.getPageSource();

        if (pageSource.contains("Best Seller")){
            System.out.println("PASS");
        }else System.out.println("FAIL");
        driver.quit();
    }
}
