import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;


import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class practice7_3 extends TestBase {

@Test
    public void isExists(){
   String pathOfTheImage ="/Users/haylamazb@moravian.edu/Desktop";
   System.out.println(pathOfTheImage);
   boolean isExist = Files.exists(Paths.get(pathOfTheImage));
   Assert.assertTrue(isExist);
}
@Test
    public void dowloadTest() {
    driver.get("https://the-internet.herokuapp.com/download");
    driver.findElement(By.linkText("flowers.jpg")).click();

    String pathOfTheFlower = "/Users/haylamazb@moravian.edu/Downloads";
    boolean flowerExists = Files.exists(Paths.get(pathOfTheFlower));
    Assert.assertTrue(flowerExists);
}
@Test
    public void fileUploadTest(){
    driver.get("https://the-internet.herokuapp.com/upload");

    String pathOfTheFlower = "/Users/haylamazb@moravian.edu/Downloads";
    driver.findElement(By.id("file-upload")).sendKeys(pathOfTheFlower);

   String message = driver.findElement(By.xpath("//h3")).getText();
   Assert.assertEquals("File Uploader",message);



}

}
