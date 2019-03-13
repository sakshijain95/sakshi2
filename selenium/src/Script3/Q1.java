package Script3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Q1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "/home/ttn/IdeaProjects/silenium/ss/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ultimateqa.com/simple-html-elements-for-automation/");
        driver.manage().window().maximize();
        List<WebElement> trcount = driver.findElements(By.xpath("//div[@class='et_pb_text_inner']//h2[text()='HTML Table with no id']/following-sibling::table//tr"));


        //List<WebElement> trcount = driver.findElements(By.xpath("//table[@class='dataTable']//tr"));

        System.out.println(trcount.size());

        List<WebElement> thcount = driver.findElements(By.xpath("//div[@class='et_pb_text_inner']//h2[text()='HTML Table with no id']/following-sibling::table//tr//th"));
        System.out.println(thcount.size());

        for (int i = 2; i <= trcount.size(); i++) {
            List<WebElement>lst = driver.findElements(By.xpath("//div[@class='et_pb_text_inner']//h2[text()='HTML Table with no id']/following-sibling::table//tr[" + i + "]//td"));

            if(lst.get(0).getText().equals("Quality Assurance Engineer"))
            {
                System.out.println(lst.get(2).getText());

            }
            }
            System.out.println(" ");
            System.out.println(" ");

        }

    }
