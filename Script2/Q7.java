package Script2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Q7 {
        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver",
                    "/home/ttn/IdeaProjects/silenium/ss/chromedriver");
            WebDriver driver = new ChromeDriver();

            driver.get("https://www.myntra.com/");

            WebElement we = driver.findElement(By.xpath("//a[text()='Home & Living']"));
            Actions actions = new Actions(driver);
            actions.moveToElement(we).perform();
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            WebElement we1 = driver.findElement(By.xpath("//a[text()='Clocks']"));
            Actions actions1 = new Actions(driver);
            actions1.moveToElement(we1).click().perform();
          //  actions1.click(we1).perform();
            System.out.println(driver.getCurrentUrl());
if(driver.getCurrentUrl().equals("https://www.myntra.com/clocks"))
{
    System.out.println("validated");

}
else
{

    System.out.println("not validated");



}


        }


}

