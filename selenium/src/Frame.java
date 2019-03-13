import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "/home/ttn/IdeaProjects/silenium/ss/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.londonfreelance.org/courses/frames/index.html");

        driver.switchTo().frame("main");
       // driver.findElement(By.xpath("//h2[text()='Title bar']"));
        WebElement we = driver.findElement(By.xpath("//body[@background='top.gif']//h2"));
        System.out.println(we.getText());

        driver.switchTo().defaultContent();


        driver.switchTo().frame("bot");
        WebElement we1 = driver.findElement(By.xpath("//body[@background='bot.gif']//h2"));
        System.out.println(we1.getText());



    }

}
