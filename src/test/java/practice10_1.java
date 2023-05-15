import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;


public class practice10_1 extends TestBase {
    @Test
    public void testActio23(){
        extentTest.pass("goo to amazon");
        driver.get("https://www.amazon.com");
        extentTest.pass("find element");
        WebElement accountHoverover = driver.findElement(By.id("nav-link-accountList"));
        Actions actions = new Actions(driver);
        actions.moveToElement(accountHoverover).perform();
        driver.findElement(By.linkText("Account")).click();

        extentReports.flush();
    }
}
