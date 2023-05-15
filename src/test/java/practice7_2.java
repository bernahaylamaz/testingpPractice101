import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;


import java.time.Duration;

public class practice7_2 extends TestBase {

    @Test
    public void contextClickMethod() {
        driver.get("https://the-internet.herokuapp.com/context_menu");
        System.out.println(driver.getTitle());
        WebElement box = driver.findElement(By.id("hot-spot"));
        Actions actions = new Actions(driver);
        actions.contextClick(box).perform();

       String alert = driver.switchTo().alert().getText();
        Assert.assertEquals("You selected a context menu",alert);
        driver.switchTo().alert().accept();
    }
    @Test
    public void testAction2(){
        driver.get("https://www.amazon.com");
        WebElement accountHoverover = driver.findElement(By.id("nav-link-accountList"));
        Actions actions = new Actions(driver);
        actions.moveToElement(accountHoverover).perform();
        driver.findElement(By.linkText("Account")).click();
    }
    @Test
    public void keysUpDown(){
        driver.get("https://www.google.com");
       WebElement dounleClick = driver.findElement(By.id("APjFqb"));
        Actions actions = new Actions(driver);
        actions.keyDown(dounleClick, Keys.SHIFT);
        actions.doubleClick(dounleClick).perform();
        dounleClick.sendKeys("iPhone X prices");
    }


    }


