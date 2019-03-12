package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sq3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "/home/ttn/IdeaProjects/silenium/ss/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        driver.manage().window().maximize();
        driver.findElement(By.name("q")).sendKeys("To The New");
        //driver.findElement(By.xpath("//input[text()='Google Search']"));
driver.findElement(By.name("btnK")).submit();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.close();
    }
}
