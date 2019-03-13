package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.ListIterator;

public class sq12 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "/home/ttn/IdeaProjects/silenium/ss/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("file:///home/ttn/Downloads/Registration.html");
        List<WebElement> ls = driver.findElements(By.name("Demo"));
        System.out.println(ls.size());
       ListIterator<WebElement> li = ls.listIterator();
        while(li.hasNext()) {
            System.out.println(li.next());
        }
        ls.get(0).sendKeys("Sakshi");
        ls.get(1).sendKeys("Jain");
        ls.get(2).sendKeys("sakshi.jain@tothenew.com");
    }
}
