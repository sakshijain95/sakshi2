package Script2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;

public class Q5 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "/home/ttn/IdeaProjects/silenium/ss/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.londonfreelance.org/courses/frames/index.html");
        List<WebElement> list = driver.findElements(By.xpath("//frame"));
        System.out.println(list.size());

        driver.switchTo().frame("navbar");
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        WebElement we =driver.findElement(By.xpath("//a[text()='Sample content']"));
        we.click();
        driver.switchTo().defaultContent();
        driver.switchTo().frame("content");
    WebElement we1 = driver.findElement(By.xpath("//h2[text()='Acid-free paper for the digital age']"));
    System.out.println(we1.getText());
       //System.out.println();



    }
}

//Click on Sample content link & Then validate the header text as Acid-free paper for the digital age.
