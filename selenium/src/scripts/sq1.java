package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sq1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver",
                "/home/ttn/IdeaProjects/silenium/ss/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com/");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.close();
    }
}
