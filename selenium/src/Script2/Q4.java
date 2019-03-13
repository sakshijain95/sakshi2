package Script2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Q4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "exe/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://demo.automationtesting.in/Frames.html#Single");

        WebElement element = driver.findElement(By.xpath("//a[text()='Single Iframe ']"));
        element.click();

        System.out.println(element.getText());

        driver.switchTo().frame("SingleFrame");

        WebElement ele = driver.findElement(By.xpath("//div[@class='row']/div/input[@type='text']"));

        ele.sendKeys("India is a good country");

        driver.switchTo().defaultContent();


        driver.findElement(By.xpath("//a[@href='#Multiple']")).click();

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']")));

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']")));

        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("India is a good country always!!");
    }


}