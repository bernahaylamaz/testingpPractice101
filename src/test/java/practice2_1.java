import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice2_1 {
    public static void main(String[] args) {
        System.setProperty("web-driver.chrome.driver","/Users/haylamazb@moravian.edu/Documents/selenium dependencies/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        //actual
        String actualTittle = driver.getTitle();
        //expected
        String expectedTitle = "Google";
        //verify
        if (actualTittle.equals(expectedTitle)){
            System.out.println("PASS");
        }else{System.out.println("ACTUAL: "+actualTittle);
            System.out.println("EXPECTED: "+expectedTitle);


        }
driver.quit();

    }
}
