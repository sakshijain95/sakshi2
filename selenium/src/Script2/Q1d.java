package Script2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Q1d {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver",
                "/home/ttn/IdeaProjects/silenium/ss/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
        WebElement we = driver.findElement(By.xpath("//button[text()='Click me!']"));
        we.click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
        driver.switchTo().alert().accept();


        driver.close();

    }
}
