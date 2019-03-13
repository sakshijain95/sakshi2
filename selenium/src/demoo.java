import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class demoo {
    public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver",
                    "/home/ttn/IdeaProjects/silenium/ss/chromedriver");
            WebDriver driver = new ChromeDriver();

            driver.get("http://demo.guru99.com/test/web-table-element.php");

        List<WebElement> trcount = driver.findElements(By.xpath("//table[@class='dataTable']//tr"));

        System.out.println(trcount.size());

        List<WebElement> thcount  = driver.findElements(By.xpath("//table[@class='dataTable']//tr//th"));

        System.out.println(thcount.size());
        for(int i=2;i<=trcount.size();i++)
        {
            List<WebElement> tdcount  = driver.findElements(By.xpath("//table[@class='dataTable']//tr["+i+"]//td"));
            for(int j=1;j<=tdcount.size();j++)
            {

                String data = driver.findElement(By.xpath("//table[@class='dataTable']//tr["+i+"]//td["+j+"]")).getText();
                System.out.print(data);
               }
            System.out.println(" ");
            System.out.println(" ");

        }


    }


}
