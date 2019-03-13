package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Sq11 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "/home/ttn/IdeaProjects/silenium/ss/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("file:///home/ttn/Downloads/Registration.html");
        //driver.findElement(By.xpath("//"))
        driver.findElement(By.xpath("//*[@ng-model='FirstName']")).sendKeys("Sakshi");
        driver.findElement(By.xpath("//*[@ng-model='LastName']")).sendKeys("Jain");
        driver.findElement(By.xpath("//*[@ng-model='Adress']")).sendKeys("Laxmi nagar");
        driver.findElement(By.xpath("//*[@ng-model='EmailAdress']")).sendKeys("sakshi.jain@tothenew.com");
        driver.findElement(By.xpath("//*[@ng-model='Phone']")).sendKeys("8377885762");
        driver.findElements(By.name("radiooptions")).get(1).click();
        driver.findElement(By.id("checkbox1")).click();
        driver.findElement(By.id("checkbox2")).click();
        driver.findElement(By.xpath("//*[@ng-model='Password']")).sendKeys("sakshijain");
        driver.findElement(By.xpath("//*[@ng-model='CPassword']")).sendKeys("sakshijain");

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("signup"))));


        driver.findElement(By.id("submitbtn")).submit();



        driver.manage().window().maximize();
        driver.close();
    }

}
