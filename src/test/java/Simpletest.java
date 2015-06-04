import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.browserlaunchers.locators.GoogleChromeLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Администратор on 03.06.2015.
 */
public class Simpletest {
    @Test
    public void Testing12(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.google.com.ua");
      WebElement SearchField = driver.findElement(By.id("lst-ib"));
        SearchField.clear();
        SearchField.sendKeys("qa");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement searchButton = driver.findElement(By.cssSelector(".lsb"));
searchButton.click();
    }
}
