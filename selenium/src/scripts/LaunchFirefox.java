package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class LaunchFirefox {
    public static void main(String[] args) {
            System.setProperty("webdriver.gecko.driver",
                    "/home/ttn/IdeaProjects/silenium/ss/geckodriver");
            WebDriver driver = new FirefoxDriver();
            driver.get("http://www.tothenew.com/");

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);

           driver.close();

    }
}
