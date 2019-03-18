package testingqa;

import org.junit.runner.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;


public class Automation {
    WebDriver driver;

    @BeforeSuite
    public WebDriver driver() throws IOException {
        System.setProperty("webdriver.chrome.driver",
                "/home/ttn/Desktop/IP/QATest/ss/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://newtours.demoaut.com/mercurywelcome.php");
        return (driver);
    }
 //**************First possitive test case **************

        @BeforeClass
        public void register() throws IOException {

       // WebDriver driver=driver();
        //driver();
        driver.findElement(By.xpath("//a[text()='REGISTER']")).click();

        Properties prop = new Properties();
        File f = new File("/home/ttn/Desktop/IP/QATest/src/test/java/testingqa/QA_Properties/ap.properties");
        FileInputStream fip = new FileInputStream(f);
        prop.load(fip);
        //System.out.println(prop.getProperty("First Name"));
        driver.findElement(By.name("firstName")).sendKeys(prop.getProperty("FirstName"));
        driver.findElement(By.name("lastName")).sendKeys(prop.getProperty("LastName"));
        driver.findElement(By.name("phone")).sendKeys(prop.getProperty("Phone"));
        driver.findElement(By.name("userName")).sendKeys(prop.getProperty("Email"));

        driver.findElement(By.name("address1")).sendKeys(prop.getProperty("Address"));
        driver.findElement(By.name("address2")).sendKeys(prop.getProperty("Address1"));

        driver.findElement(By.name("city")).sendKeys(prop.getProperty("City"));
        driver.findElement(By.name("state")).sendKeys(prop.getProperty("State"));
        driver.findElement(By.name("postalCode")).sendKeys(prop.getProperty("Pin"));

        WebElement country = driver.findElement(By.name("country"));
        Select s = new Select(country);
        s.selectByVisibleText("INDIA");

        driver.findElement(By.name("email")).sendKeys(prop.getProperty("username"));

        driver.findElement(By.name("password")).sendKeys(prop.getProperty("Password"));
        driver.findElement(By.name("confirmPassword")).sendKeys(prop.getProperty("CPassword"));

            driver.findElement(By.name("register")).submit();
        String actual = driver.findElement(By.xpath("//b")).getText();
        String expected = "Dear Sakshi Jain,";

        Assert.assertEquals(actual, expected);
        //String a = driver.getCurrentUrl();
            System.out.println("Register end ");

    }

        //************Login


    @BeforeMethod
    public void login() throws IOException, InterruptedException {

        WebDriver driver=driver();
        //  driver();
        Properties prop = new Properties();
        File f = new File("/home/ttn/Desktop/IP/QATest/src/test/java/testingqa/QA_Properties/ap.properties");
        FileInputStream fip = new FileInputStream(f);
        prop.load(fip);
        driver.findElement(By.name("userName")).sendKeys(prop.getProperty("username"));
        driver.findElement(By.name("password")).sendKeys(prop.getProperty("Password"));
        driver.findElement(By.name("login")).submit();

        System.out.println("login end ");
}



        //******Departure and arrival city not same
        @Test(description = "departure and arival city negative test case",priority = 2)
        public void city() throws InterruptedException {
        driver.findElements(By.name("tripType")).get(0).click();
        //Passengers
        WebElement passengers = driver.findElement(By.name("passCount"));
        Select selectpassenger = new Select(passengers);
        selectpassenger.selectByVisibleText("1");

        //Departing

        WebElement depart = driver.findElement(By.name("fromPort"));
        Select departdrop = new Select(depart);

        departdrop.selectByVisibleText("Acapulco");

        //departing(date)
        WebElement month = driver.findElement(By.name("fromMonth"));
        WebElement day = driver.findElement(By.name("fromDay"));
        new Select(month).selectByVisibleText("May");
        new Select(day).selectByVisibleText("2");


        // ARRIVING IN
        WebElement arrive = driver.findElement(By.name("toPort"));
        new Select(arrive).selectByVisibleText("Acapulco");

        //Returning date
        WebElement month1 = driver.findElement(By.name("toMonth"));
        WebElement day1 = driver.findElement(By.name("toDay"));
        new Select(month1).selectByVisibleText("May");
        new Select(day1).selectByVisibleText("10");

        //Service class
        driver.findElements(By.xpath("//input[@name='servClass']")).get(2).click();

        //Airline
        WebElement prefrence = driver.findElement(By.name("airline"));
        new Select(prefrence).selectByVisibleText("Unified Airlines");


        //continue button
        driver.findElement(By.name("findFlights")).submit();

        //Depart to
        driver.findElements(By.name("outFlight")).get(2).click();
        //Arrive to
        driver.findElements(By.name("outFlight")).get(2).click();

        //continue button clicked
        driver.findElement(By.name("reserveFlights")).submit();


        try {
            // Making the test fail
            Assert.assertEquals(depart.getAttribute("value"), arrive.getAttribute("value"));

        } catch (StaleElementReferenceException e) {

            depart = driver.findElement(By.name("fromPort"));
            arrive = driver.findElement(By.name("toPort"));
            System.out.println(depart.getAttribute("value"));
            System.out.println(arrive.getAttribute("value"));
            Assert.assertNotEquals(depart.getAttribute("value"), arrive.getAttribute("value"));


            // Following lines will be printed when the assert condition fails
            System.out.println("test case");
            System.out.println("Error message: " + e.toString());

            Thread.sleep(300);
            System.out.println("city end ");
        }
    }




    //*******Arrival and Departure date


    @Test(description = "Departure date should be less than arrival date ",priority = 3)
            public void date() throws InterruptedException {
        driver.findElement(By.xpath("//input[@value='roundtrip']")).click();
        //Passengers
        WebElement passengers = driver.findElement(By.name("passCount"));
        Select selectpassenger = new Select(passengers);
        selectpassenger.selectByVisibleText("1");

        //Departing

        WebElement depart = driver.findElement(By.name("fromPort"));
        Select departdrop = new Select(depart);

        departdrop.selectByVisibleText("Acapulco");

        //departing(date)
        WebElement month = driver.findElement(By.name("fromMonth"));
        WebElement day = driver.findElement(By.name("fromDay"));
        new Select(month).selectByVisibleText("May");
        new Select(day).selectByVisibleText("2");


        // ARRIVING IN
        WebElement arrive = driver.findElement(By.name("toPort"));
        new Select(arrive).selectByVisibleText("London");

        //Returning date
        WebElement month1 = driver.findElement(By.name("toMonth"));
        WebElement day1 = driver.findElement(By.name("toDay"));
        new Select(month1).selectByVisibleText("April");
        new Select(day1).selectByVisibleText("10");

        //Service class
        driver.findElements(By.xpath("//input[@name='servClass']")).get(2).click();

        //Airline
        WebElement prefrence = driver.findElement(By.name("airline"));
        new Select(prefrence).selectByVisibleText("Unified Airlines");


        //continue button
        driver.findElement(By.name("findFlights")).submit();

        //Depart to
        driver.findElements(By.name("outFlight")).get(2).click();
        //Arrive to
        driver.findElements(By.name("inFlight")).get(2).click();

        //continue button clicked
        driver.findElement(By.name("reserveFlights")).submit();
        String actual_url = driver.getCurrentUrl();
        String expected_url = "http://newtours.demoaut.com/mercuryreservation.php?osCsid=b7dd10f493813134cb2c66e437e63b0d";
        Assert.assertEquals(actual_url, expected_url);


    }


    @Test(description = "end to end",priority = 4)

    public void endtoend() throws IOException, InterruptedException {

        // ************//Register*************


        //***Find flight main content

//        driver.findElements(By.name("tripType")).get(0).click();
        //Passengers
        WebElement passengers = driver.findElement(By.name("passCount"));
        Select selectpassenger = new Select(passengers);
        selectpassenger.selectByVisibleText("1");

        //Departing

        WebElement depart = driver.findElement(By.name("fromPort"));
        Select departdrop = new Select(depart);

            departdrop.selectByVisibleText("Acapulco");

        //departing(date)
        WebElement month = driver.findElement(By.name("fromMonth"));
        WebElement day = driver.findElement(By.name("fromDay"));
        new Select(month).selectByVisibleText("May");
        new Select(day).selectByVisibleText("2");


        // ARRIVING IN
        WebElement arrive = driver.findElement(By.name("toPort"));
        new Select(arrive).selectByVisibleText("London");

        //Returning date
        WebElement month1 = driver.findElement(By.name("toMonth"));
        WebElement day1 = driver.findElement(By.name("toDay"));
        new Select(month1).selectByVisibleText("May");
        new Select(day1).selectByVisibleText("10");

        //Service class
        driver.findElements(By.xpath("//input[@name='servClass']")).get(2).click();

        //Airline
        WebElement prefrence = driver.findElement(By.name("airline"));
        new Select(prefrence).selectByVisibleText("Unified Airlines");


        //continue button
        driver.findElement(By.name("findFlights")).submit();

        //Depart to
        driver.findElements(By.name("outFlight")).get(2).click();
        //Arrive to
        driver.findElements(By.name("outFlight")).get(2).click();

        //continue button clicked
        driver.findElement(By.name("reserveFlights")).submit();

        try {
            // Making the test fail
            Assert.assertEquals(depart.getAttribute("value"), arrive.getAttribute("value"));

        } catch(StaleElementReferenceException e){

            depart = driver.findElement(By.name("fromPort"));
            arrive = driver.findElement(By.name("toPort"));
            System.out.println(depart.getAttribute("value"));
            System.out.println(arrive.getAttribute("value"));
            Assert.assertNotEquals(depart.getAttribute("value"), arrive.getAttribute("value"));


            // Following lines will be printed when the assert condition fails
            System.out.println("test case");
            System.out.println("Error message: " + e.toString());
        }


       // Book a fight
        //driver.findElement(By.xpath("//font"))
        driver.findElement(By.name("passFirst0")).sendKeys("Sakshi");
        driver.findElement(By.name("passLast0")).sendKeys("Jain");
        WebElement meal = driver.findElement(By.name("pass.0.meal"));
        new Select(meal).selectByVisibleText("Vegetarian");
        WebElement cardtype = driver.findElement(By.name("creditCard"));
        new Select(cardtype).selectByVisibleText("Visa");
        driver.findElement(By.name("creditnumber")).sendKeys("123456789");
        WebElement expmnth = driver.findElement(By.name("cc_exp_dt_mn"));
        new Select(expmnth).selectByVisibleText("02");
        WebElement expyear = driver.findElement(By.name("cc_exp_dt_yr"));
        new Select(expyear).selectByVisibleText("2010");
        driver.findElement(By.name("cc_frst_name")).sendKeys("sakshi");
        driver.findElement(By.name("cc_mid_name")).sendKeys("sj");
        driver.findElement(By.name("cc_last_name")).sendKeys("jain");
        driver.findElement(By.name("ticketLess")).click();
        driver.findElement(By.name("billAddress1")).sendKeys("Laxmi nagar");
        driver.findElement(By.name("billCity")).sendKeys("Delhi");
        driver.findElement(By.name("billState")).sendKeys("Delhi");
        driver.findElement(By.name("billZip")).sendKeys("110092");
        WebElement Billcountry=driver.findElement(By.name("billCountry"));
        new Select(Billcountry).selectByVisibleText("UNITED STATES");

        driver.findElement(By.name("delAddress1")).sendKeys("Laxmi nagar");
        driver.findElement(By.name("delCity")).sendKeys("Delhi");
        driver.findElement(By.name("delState")).sendKeys("Delhi");
        driver.findElement(By.name("delZip")).sendKeys("110092");
        WebElement delcountry=driver.findElement(By.name("delCountry"));
        new Select(delcountry).selectByVisibleText("UNITED STATES");
        try {
            driver.findElement(By.name("buyFlights")).click();
        }

        catch (StaleElementReferenceException e) {

            driver.findElement(By.name("buyFlights")).click();
        }
        driver.findElement(By.xpath("//img[@src='/images/forms/Logout.gif']")).click();


        System.out.println("end to end end ");
    }



    @Test(description = "empty passengers field",priority = 5)

    public void empty_passengers() throws IOException, InterruptedException {


        driver.findElements(By.name("tripType")).get(0).click();
        //Passengers
        WebElement passengers = driver.findElement(By.name("passCount"));
        Select selectpassenger = new Select(passengers);
        selectpassenger.selectByVisibleText("1");

        //Departing

        WebElement depart = driver.findElement(By.name("fromPort"));
        Select departdrop = new Select(depart);

        departdrop.selectByVisibleText("Acapulco");

        //departing(date)
        WebElement month = driver.findElement(By.name("fromMonth"));
        WebElement day = driver.findElement(By.name("fromDay"));
        new Select(month).selectByVisibleText("May");
        new Select(day).selectByVisibleText("2");


        // ARRIVING IN
        WebElement arrive = driver.findElement(By.name("toPort"));
        new Select(arrive).selectByVisibleText("London");

        //Returning date
        WebElement month1 = driver.findElement(By.name("toMonth"));
        WebElement day1 = driver.findElement(By.name("toDay"));
        new Select(month1).selectByVisibleText("May");
        new Select(day1).selectByVisibleText("10");

        //Service class
        driver.findElements(By.xpath("//input[@name='servClass']")).get(2).click();

        //Airline
        WebElement prefrence = driver.findElement(By.name("airline"));
        new Select(prefrence).selectByVisibleText("Unified Airlines");


        //continue button
        driver.findElement(By.name("findFlights")).submit();

        //Depart to
        driver.findElements(By.name("outFlight")).get(2).click();
        //Arrive to
        driver.findElements(By.name("outFlight")).get(2).click();

        //continue button clicked
        driver.findElement(By.name("reserveFlights")).submit();


        // Book a fight

        try {
            driver.findElement(By.name("buyFlights")).click();
        }

        catch (StaleElementReferenceException e) {

            driver.findElement(By.name("buyFlights")).click();
        }

        String expected_result=driver.getCurrentUrl();

        String actual_result = "http://newtours.demoaut.com/mercurypurchase.php";


                Assert.assertEquals(expected_result,actual_result);

        System.out.println("last end");

    }

    @AfterSuite
    public void closeTabs(){
        driver.quit();
    }

    }


