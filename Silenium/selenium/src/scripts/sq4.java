package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sq4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "/home/ttn/IdeaProjects/silenium/ss/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tothenew.com/");
     //driver.findElement(By.id("h-contact-us")).cl
     driver.findElement(By.xpath("//a[text()='contact us']")).click();

        driver.manage().window().maximize();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.close();
    }
}
