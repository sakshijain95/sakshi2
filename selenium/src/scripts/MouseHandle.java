package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.nio.channels.AcceptPendingException;
import java.util.concurrent.TimeUnit;

public class MouseHandle {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "/home/ttn/IdeaProjects/silenium/ss/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);

        WebElement we = driver.findElement(By.xpath("//a[@tabindex=28]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(we).perform();


        WebElement we1 = driver.findElement(By.id("multiasins-img-link"));
        Actions actions1 = new Actions(driver);
        actions1.click(we1).perform();

    }
}
