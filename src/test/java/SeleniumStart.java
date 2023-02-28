import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class SeleniumStart {

    WebDriver wd;

    @BeforeMethod
    public void preCondition() {
        System.out.println("Opening web-site");
        wd = new ChromeDriver();
//    wd.get("https://telranedu.web.app/home");
//        wd.navigate().to("https://telranedu.web.app/home");
        wd.navigate().to("https://telranedu.web.app/login");
//    wd.navigate().forward();
//    wd.navigate().back();
    }

    @Test
    public void testLogin() {
//        System.out.println("Test is over");
        WebElement element = wd.findElement(By.tagName("a"));
        wd.findElement(By.xpath("//a"));
        WebElement form = wd.findElement(By.tagName("form"));
        List<WebElement> elements = wd.findElements(By.tagName("a"));
        System.out.println(elements.size());

        WebElement root = wd.findElement(By.id("root"));
        wd.findElement(By.className("navbar-component_nav__1X_4m"));
        wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));
        wd.findElement(By.cssSelector("[class='navbar-component_nav__1X_4m']"));
        wd.findElement(By.xpath("//*[@class='navbar-component_nav__1X_4m']"));
//        wd.findElement(By.linkText("Registration"));
        wd.findElement(By.cssSelector("*[name^='Lo']"));
        wd.findElement(By.name("password"));
        wd.findElement(By.partialLinkText("LOG"));


    }


    @AfterMethod
    public void postCondition() {
//    wd.close();
    wd.quit();
    }
}
