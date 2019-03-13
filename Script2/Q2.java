package Script2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class Q2 {

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver",
                "/home/ttn/IdeaProjects/silenium/ss/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
        WebElement we = driver.findElement(By.xpath("//select[@multiple='multiple']"));
        Select sl= new Select(we);
        System.out.println(sl.isMultiple());
        List<WebElement> ls = sl.getOptions();
        ListIterator<WebElement> li=ls.listIterator();
        while (li.hasNext())
        {
            WebElement a = li.next();
            System.out.println(a.getText());

        }
        sl.selectByVisibleText("New Jersey");
        sl.selectByVisibleText("New York");
        sl.selectByVisibleText("Texas");

     System.out.println(sl.getFirstSelectedOption().getText());
        List<WebElement> ls1 = sl.getAllSelectedOptions();
        ListIterator<WebElement> li1=ls1.listIterator();
        while (li1.hasNext())
        {
            WebElement a = li1.next();
            System.out.println(a.getText());


        }
        sl.deselectAll();


driver.close();

    }
}
