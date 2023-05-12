import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class practice4_3 {
    WebDriver driver;
    @Before
    public void setUp(){
        System.setProperty("web-driver.chrome.driver","/Users/haylamazb@moravian.edu/Documents/selenium dependencies/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
    }

    @Test
    public void Tets1RadioButton(){
        driver.findElement(By.linkText("Create new account")).click();
        driver.findElement(By.xpath("//input[@type='radio']")).click();
    }
    //dropdown
    @Test
    public void selectBirthMonth(){
        WebElement selectBirthMonth = driver.findElement(By.id("month"));
        Select monthSelect = new Select(selectBirthMonth);
        monthSelect.selectByVisibleText("October");
        WebElement selectBirthDay =driver.findElement(By.id("day"));
        Select daySelect = new Select(selectBirthDay);
        daySelect.selectByVisibleText("23");
        WebElement selectBirthYear =driver.findElement(By.id("year"));
        Select yearSelect = new Select(selectBirthYear);
        yearSelect.selectByVisibleText("1997");




    }

}
