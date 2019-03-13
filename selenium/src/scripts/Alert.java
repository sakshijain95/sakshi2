package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "/home/ttn/IdeaProjects/silenium/ss/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
        WebElement we =driver.findElement(By.xpath("//button[@onclick]"));
       //  System.out.println(we.getText());
        we.click();
        System.out.println( driver.switchTo().alert().getText());

    }
}
