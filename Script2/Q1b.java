package Script2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Q1b {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver",
                "/home/ttn/IdeaProjects/silenium/ss/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
        WebElement we = driver.findElement(By.xpath("//button[text()='Click me!']"));
        //  System.out.println(we.getText());
        we.click();
        driver.switchTo().alert().dismiss();

        driver.close();
    }
}
