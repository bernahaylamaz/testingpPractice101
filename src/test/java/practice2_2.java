import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice2_2 {
    public static void main(String[] args) {
            System.setProperty("web-driver.chrome.driver","/Users/haylamazb@moravian.edu/Documents/selenium dependencies/drivers/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.google.com");

            String actualURL = driver.getCurrentUrl();
            String expectedURL= "www.google.com";

            if (actualURL.equals(expectedURL)){
                System.out.println("PASS");
            }else System.out.println("ACTUAL : "+actualURL);
                  System.out.println("EXPECTED : "+expectedURL);
            driver.quit();
    }
}
