import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class TableTest {

WebDriver wd;

@BeforeMethod
    public void init(){
    wd = new ChromeDriver();
    wd.navigate().to("https://www.w3schools.com/css/css_table.asp");
}

@Test
    public void tableTestCss(){
    List<WebElement> trs = wd.findElements(By.cssSelector("#customers tr"));
    System.out.println(trs.size());
    List<WebElement> ths = wd.findElements(By.cssSelector("#customers th"));
    System.out.println(ths.size());
//    By.cssSelector("#customers th").findElement(wd);
    WebElement tr3 = wd.findElement(By.cssSelector("#customers tr:nth-child(3)"));
    System.out.println(tr3.getText());
    WebElement lastColumn = wd.findElement(By.cssSelector("#customers tr th:last-child"));


}

}
