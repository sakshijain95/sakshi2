package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {
    public static void main(String[] args) {
            System.setProperty("webdriver.gecko.driver",
                    "/home/ttn/IdeaProjects/silenium/ss/geckodriver");
            WebDriver driver = new FirefoxDriver();
            driver.get("http://www.tothenew.com/");
            driver.close();

    }
}
