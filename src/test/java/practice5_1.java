import org.checkerframework.checker.fenum.qual.SwingTextOrientation;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class practice5_1 {
    WebDriver driver;
    @Before
    public void setUp() {
        System.setProperty("web-driver.chrome.driver", "/Users/haylamazb@moravian.edu/Documents/selenium dependencies/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dropdown");
    }
    @Test
    public void selectByIndexTest() throws InterruptedException {
        WebElement dropdown = driver.findElement(By.id("dropdown"));
//        2. use select object
        Select select = new Select(dropdown);
//        3. selecting the option by index
//        Index start from 0
        Thread.sleep(5000);
        select.selectByIndex(1);//Option 1
    }
    @Test
    public void selectByValueTest() {
        WebElement dropdown = driver.findElement(By.id("dropdown"));
//        2. use select object
        Select select = new Select(dropdown);
        select.selectByValue("1");
    }
    @Test
    public void selectByVisibleText() {
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Option 2");
    }
    //getOptions returns all options as list on the console
    @Test
    public void printAllTest(){
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropdown);
       List<WebElement> allOptions =  select.getOptions();
       for(WebElement eachOption:allOptions) {
           System.out.println(eachOption.getText());
       }}
    //return only the selected option
    @Test
    public void printFirstSelectedOptionTest(){
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropdown);
        WebElement selectedOption = select.getFirstSelectedOption();
        System.out.println("Slected option is " +selectedOption.getText());
        Assert.assertEquals("Please select an option", selectedOption.getText());
    }
    @Test
    public void sizeTest(){
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropdown);
        List<WebElement> allOptions =  select.getOptions();
        int numberOfOptions = allOptions.size();
        Assert.assertEquals("Expected Is Not Equal Actual", numberOfOptions,3);
        System.out.println(numberOfOptions);

    }

    @After
    public void tearDown(){
        driver.quit();




}
}
