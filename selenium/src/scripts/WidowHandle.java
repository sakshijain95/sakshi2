package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WidowHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/home/ttn/IdeaProjects/silenium/ss/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/windows");
        String parentWinHandle = driver.getWindowHandle();
        //System.out.println(parentWinHandle);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[text()='Click Here']")).click();
        System.out.println("1"+driver.getCurrentUrl());
        driver.findElement(By.xpath("//a[text()='Elemental Selenium']")).click();
        System.out.println("2"+driver.getCurrentUrl());

        Set<String> s = driver.getWindowHandles();
        String str[]=new String[s.size()];
        int i=0;
        Iterator<String> itr = s.iterator();

        while (itr.hasNext())
        {
            str[i]=itr.next();
            i++;
        }
        driver.switchTo().window(str[1]);
        System.out.println("3"+driver.getCurrentUrl());
        //driver.switchTo().window(str[0]);
        driver.close();
        driver.switchTo().window(str[0]);
        System.out.println("4"+driver.getCurrentUrl());
        driver.quit();
    }

}
