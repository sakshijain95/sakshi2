package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sq11b {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "/home/ttn/IdeaProjects/silenium/ss/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("file:///home/ttn/Downloads/Registration.html");
        driver.findElement(By.xpath("//*[@ng-model='FirstName']")).sendKeys("Sakshi");
        driver.findElement(By.xpath("//*[@ng-model='LastName']")).sendKeys("Jain");
        driver.findElement(By.xpath("//*[@ng-model='Adress']")).sendKeys("Laxmi nagar");
        driver.findElement(By.xpath("//*[@ng-model='EmailAdress']")).sendKeys("sakshi.jain@tothenew.com");
        driver.findElement(By.xpath("//*[@ng-model='Phone']")).sendKeys("8377885762");
        driver.findElements(By.name("radiooptions")).get(1).click();
        driver.findElements(By.className("checks")).get(1).click();
        driver.findElement(By.xpath("//*[@ng-model='Password']")).sendKeys("sakshijain");
        driver.findElement(By.xpath("//*[@ng-model='CPassword']")).sendKeys("sakshijain");


     //   driver.findElement(By.id("submitbtn")).submit();
        System.out.println( driver.findElements(By.name("radiooptions")).get(1).isSelected());
        driver.manage().window().maximize();
    }
}
