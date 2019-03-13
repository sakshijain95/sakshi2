package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class LaunchChrome {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "/home/ttn/IdeaProjects/silenium/ss/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("file:///home/ttn/Downloads/DemoPage%20(3).html");

       driver.manage().window().maximize();

       driver.findElement(By.name("Demo")).sendKeys("sakshi");
    String txt = driver.findElement(By.name("Demo")).getAttribute("value");
        System.out.println(txt);



       List<WebElement>ls = driver.findElements(By.xpath("//a[text()='Great Place to Learn- w3schools']"));

        System.out.println(ls.size());
        ListIterator<WebElement> li = ls.listIterator();
        while(li.hasNext()) {
            System.out.println(li.next());
        }
        ls.get(1).click();
        System.out.println(driver.getTitle());
        //driver.navigate().to();

        driver.close();
    }

}
