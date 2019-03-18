package testingqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class Q2 {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver",
                "/home/ttn/Desktop/IP/QATest/ss/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("file:///home/ttn/Downloads/Registration.html");

        Properties prop = new Properties();
        File f = new File("/home/ttn/Desktop/IP/QATest/src/test/java/testingqa/QA_Properties/QA.properties");
        FileInputStream fip = new FileInputStream(f);
        prop.load(fip);
        //System.out.println(prop.getProperty("First Name"));
        driver.findElement(By.xpath("//*[@ng-model='FirstName']")).sendKeys(prop.getProperty("FirstName"));
        driver.findElement(By.xpath("//*[@ng-model='LastName']")).sendKeys(prop.getProperty("LastName"));
        driver.findElement(By.xpath("//*[@ng-model='Adress']")).sendKeys(prop.getProperty("Address"));
        driver.findElement(By.xpath("//*[@ng-model='EmailAdress']")).sendKeys(prop.getProperty("Email"));
        driver.findElement(By.xpath("//*[@ng-model='Phone']")).sendKeys(prop.getProperty("Phone"));

        List<WebElement> radio=driver.findElements(By.name("radiooptions"));
        for (WebElement rd:radio) {
            if(rd.getAttribute("Value").equals(prop.getProperty("Gender")))
            {
                rd.click();

            }

        }



       //(Integer.parseInt(prop.getProperty("Gender"))).click();
   List<WebElement> ls1 = driver.findElements(By.xpath("//input[@type='checkbox']"));
        for (WebElement a:ls1) {
            String str=a.getAttribute("value");
            if(str.equals(prop.getProperty("Hobbies"))||(str.equals(prop.getProperty("Hobbies1"))))

            {

               a.click();
            }

        }
      // ls1.get(1).click();
        //driver.findElements(By.id("checkbox1")).get(Integer.parseInt(prop.getProperty("Hobbies"))).click();*/
       // driver.findElement(By.id("checkbox2")).click();
       driver.findElement(By.xpath("//*[@ng-model='Password']")).sendKeys(prop.getProperty("Password"));
        driver.findElement(By.xpath("//*[@ng-model='CPassword']")).sendKeys(prop.getProperty("Cpassword"));

       // driver.findElement(By.xpath("//*[@ng-model='Adress']")).sendKeys(prop.getProperty("Address"));
    }

    }

