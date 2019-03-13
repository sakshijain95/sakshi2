package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.ListIterator;

public class guru99 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "/home/ttn/IdeaProjects/silenium/ss/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("file:///home/ttn/Downloads/DemoPage%20(5).html");

        WebElement drop = driver.findElement(By.xpath("//select[@size='4']"));
       Select sl = new Select(drop);
     sl.selectByVisibleText("Noida");
     sl.selectByVisibleText("Delhi");
        List<WebElement> allSelectedOptions = sl.getAllSelectedOptions();
        ListIterator li = allSelectedOptions.listIterator();

        while(li.hasNext())
        {
            WebElement a = (WebElement)li.next();
            System.out.println(a.getText());

        }


        System.out.println(sl.isMultiple());
        driver.manage().window().maximize();
    }
}
