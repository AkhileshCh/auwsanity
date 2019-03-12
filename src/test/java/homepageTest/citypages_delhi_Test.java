/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homepageTest;

import amarujala_Web.cityandstate;
import amarujala_Web.homepage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import java.io.File;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.ScreenshotException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import setup.drivers;
import utility.scrollfunctions;
import utility.takescreenshot;
import utility.waitfunction;

/**
 *
 * @author akhilesh
 */
public class citypages_delhi_Test {
    
    private WebDriver driver;
    ExtentReports extent;
    ExtentTest logger;
    
    
    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        driver = drivers.Chromesetup();
    }
    
    @BeforeTest
    public void startReport() {
        extent = new ExtentReports(System.getProperty("user.dir") + "/test-output/amarujalaWeb_Delhi.html", true);
        extent
                .addSystemInfo("Host Name", "Amarujala Sanity Report")
                .addSystemInfo("Environment", "Automation Testing")
                .addSystemInfo("User Name", "Akhilesh");
        extent.loadConfig(new File(System.getProperty("user.dir") + "\\extent-config.xml"));
        
    }
    
    
    @Test
    public void stateDelhi() throws InterruptedException, Exception {

        try {

            logger = extent.startTest("stateDelhi");
            driver.get("https://www.amarujala.com/");
            logger.log(LogStatus.INFO, "Navigated to Amarujala.com");
            Thread.sleep(2000);

            homepage.h_main_city(driver).click();
            Assert.assertTrue(driver.getTitle().contains("City And States News In Hindi, Latest शहर और राज्य समाचार Headlines – Amar Ujala"));
            logger.log(LogStatus.PASS, "City Page Title verified");
            logger.log(LogStatus.INFO, "Navigated to Citypage");
            cityandstate.city_delhi(driver).click();
            Assert.assertTrue(driver.getTitle().contains("Delhi News: Latest Delhi News In Hindi Today, दिल्ली समाचार - Amar Ujala"));
            logger.log(LogStatus.PASS, "Delhi Page Title verified");
            if ("दिल्ली".equals(cityandstate.city_delhi(driver).getText())) {
                logger.log(LogStatus.PASS, "page दिल्ली-एनसीआर is good");
                takescreenshot.takeSnapShot(driver, "/home/akhilesh/Documents/sel_Scr/test10.png");
                logger.log(
                        LogStatus.INFO,
                        "Snapshot : "
                        + logger.addScreenCapture("/home/akhilesh/Documents/sel_Scr/test10.png"));
            }
            cityandstate.city_delhi_1(driver).click();
            Assert.assertTrue(driver.getTitle().contains("Delhi Ncr News In Hindi, Latest दिल्ली एनसीआर न्यूज़ Headlines - Amarujala.com"));
            logger.log(LogStatus.PASS, "Delhi NCR Page Title verified");
            if ("दिल्ली-एनसीआर".equals(cityandstate.city_delhi_1(driver).getText())) {
                logger.log(LogStatus.PASS, "page दिल्ली-एनसीआर is good");
                takescreenshot.takeSnapShot(driver, "/home/akhilesh/Documents/sel_Scr/test12.png");
                logger.log(
                        LogStatus.INFO,
                        "Snapshot : "
                        + logger.addScreenCapture("/home/akhilesh/Documents/sel_Scr/test10.png"));
            }
            waitfunction.WaitForAjax(driver);
            scrollfunctions.scroll(driver);
            System.out.println("L12");
        } catch (TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
            System.out.println("Exception for L12" + e);

        }

        try {

            cityandstate.city_delhi_2(driver).click();
            Assert.assertTrue(driver.getTitle().contains("Ghaziabad News In Hindi, Latest गाज़ियबाद न्यूज़ Headlines - Amarujala.com"));
            logger.log(LogStatus.PASS, "Ghaziabad Page Title verified");
            if ("गाजियाबाद".equals(cityandstate.city_delhi_2(driver).getText())) {
                logger.log(LogStatus.PASS, "page गाजियाबाद is good");
                takescreenshot.takeSnapShot(driver, "/home/akhilesh/Documents/sel_Scr/test13.png");
                logger.log(
                        LogStatus.INFO,
                        "Snapshot : "
                        + logger.addScreenCapture("/home/akhilesh/Documents/sel_Scr/test13.png"));
            }
            waitfunction.WaitForAjax(driver);
            scrollfunctions.scroll(driver);
            System.out.println("L13");
        } catch (TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
            System.out.println("Exception for L13" + e);
        }

        try {
            cityandstate.city_delhi_3(driver).click();
            Assert.assertTrue(driver.getTitle().contains("Gurgaon News In Hindi, Latest गुडगाँव न्यूज़ Headlines - Amarujala.com"));
            logger.log(LogStatus.PASS, "Gurgaon Page Title verified");
            System.out.println(cityandstate.city_delhi_3(driver).getText());
            if ("गुरुग्राम".equals(cityandstate.city_delhi_3(driver).getText())) {
                logger.log(LogStatus.PASS, "page गुरुग्राम is good");
                takescreenshot.takeSnapShot(driver, "/home/akhilesh/Documents/sel_Scr/test14.png");
                logger.log(
                        LogStatus.INFO,
                        "Snapshot : "
                        + logger.addScreenCapture("/home/akhilesh/Documents/sel_Scr/test14.png"));
            }
            waitfunction.WaitForAjax(driver);
            scrollfunctions.scroll(driver);
            System.out.println("L14");
        } catch (TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
            System.out.println("Exception for L14" + e);
        }

        try {

            cityandstate.city_delhi_4(driver).click();
            Assert.assertTrue(driver.getTitle().contains("Noida News In Hindi, Latest नॉएडा न्यूज़ Headlines - Amarujala.com"));
            logger.log(LogStatus.PASS, "Noida Page Title verified");
            if ("नोएडा".equals(cityandstate.city_delhi_4(driver).getText())) {
                logger.log(LogStatus.PASS, "page नोएडा is good");
                takescreenshot.takeSnapShot(driver, "/home/akhilesh/Documents/sel_Scr/test15.png");
                logger.log(
                        LogStatus.INFO,
                        "Snapshot : "
                        + logger.addScreenCapture("/home/akhilesh/Documents/sel_Scr/test15.png"));
            }
            waitfunction.WaitForAjax(driver);
            scrollfunctions.scroll(driver);
            System.out.println("L15");
        } catch (TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
            System.out.println("Exception for L15" + e);
        }

        try {
            cityandstate.city_delhi_5(driver).click();
            Assert.assertTrue(driver.getTitle().contains("Faridabad News In Hindi, Latest फरीदाबाद न्यूज़ Headlines - Amarujala.com"));
            logger.log(LogStatus.PASS, "Faridabad Page Title verified");
            if ("फरीदाबाद".equals(cityandstate.city_delhi_5(driver).getText())) {
                logger.log(LogStatus.PASS, "page फरीदाबाद is good");
                takescreenshot.takeSnapShot(driver, "/home/akhilesh/Documents/sel_Scr/test16.png");
                logger.log(
                        LogStatus.INFO,
                        "Snapshot : "
                        + logger.addScreenCapture("/home/akhilesh/Documents/sel_Scr/test16.png"));
            }
            waitfunction.WaitForAjax(driver);
            scrollfunctions.scroll(driver);
            System.out.println("L16");
        } catch (TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
            System.out.println("Exception for L16" + e);
        }

    }
    
    @AfterMethod
    public void getResult(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            logger.log(LogStatus.FAIL, "Test Case Failed is " + result.getName());
            logger.log(LogStatus.FAIL, "Test Case Failed is " + result.getThrowable());
        } else if (result.getStatus() == ITestResult.SKIP) {
            logger.log(LogStatus.SKIP, "Test Case Skipped is " + result.getName());
        }
        // ending test
        //endTest(logger) : It ends the current test and prepares to create HTML report
        extent.endTest(logger);
    }
    
     @AfterTest
    public void endReport() {
        extent.flush();
        extent.close();
    }

    
}
