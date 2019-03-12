package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sq11c {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "/home/ttn/IdeaProjects/silenium/ss/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("file:///home/ttn/Downloads/Registration.html");
        //driver.findElement(By.xpath("//"))


        System.out.println(driver.findElement(By.xpath("//h1[contains(text(),'Automation Demo Site')]")).isDisplayed());
        // driver.findElement(By.id("submitbtn")).submit();


        driver.manage().window().maximize();
        driver.close();


    }
}

