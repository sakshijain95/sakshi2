package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sq6 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "/home/ttn/IdeaProjects/silenium/ss/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tothenew.com/");


        WebElement wr = driver.findElement(By.xpath("//a[text()='contact us']"));
        wr.click();
        System.out.println(driver.getCurrentUrl());
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.close();
    }
}
