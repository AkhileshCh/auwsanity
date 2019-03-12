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
import org.testng.annotations.AfterClass;
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
public class citypages_MP_Test {

    private WebDriver driver;
    ExtentReports extent;
    ExtentTest logger;

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        driver = drivers.Chromesetup();
    }

    @BeforeTest
    public void startReport() {
        extent = new ExtentReports(System.getProperty("user.dir") + "/test-output/amarujalaWeb_MP.html", true);
        extent
                .addSystemInfo("Host Name", "Amarujala Sanity Report")
                .addSystemInfo("Environment", "Automation Testing")
                .addSystemInfo("User Name", "Akhilesh");
        extent.loadConfig(new File(System.getProperty("user.dir") + "\\extent-config.xml"));

    }

    @Test
    public void stateMadhyapradesh() throws InterruptedException, Exception {

        try {
            logger = extent.startTest("stateJharkhand");
            driver.get("https://www.amarujala.com/");
            logger.log(LogStatus.INFO, "Navigated to Amarujala.com");
            homepage.h_main_city(driver).click();
            Assert.assertTrue(driver.getTitle().contains("City And States News In Hindi, Latest शहर और राज्य समाचार Headlines – Amar Ujala"));
            logger.log(LogStatus.INFO, "Navigated to Citypage");
            logger.log(LogStatus.PASS, "City Page Title verified");
            String name = cityandstate.city_mp(driver).getText();
            cityandstate.city_mp(driver).click();
            Assert.assertTrue(driver.getTitle().contains("Madhya Pradesh News In Hindi, Latest मध्य प्रदेश न्यूज़ Headlines - Amarujala.com"));
            logger.log(LogStatus.PASS, "Madhya Pradesh Title verified");
            if ("मध्य प्रदेश".equals(name)) {
                logger.log(LogStatus.PASS, "page Madhya Pradesh is good");
                takescreenshot.takeSnapShot(driver, "/home/akhilesh/Documents/sel_Scr/test46.png");
                logger.log(
                        LogStatus.INFO,
                        "Snapshot : "
                        + logger.addScreenCapture("/home/akhilesh/Documents/sel_Scr/test46.png"));
            }
//      cityandstate.city_mp_1(driver).click();
            waitfunction.WaitForAjax(driver);
            scrollfunctions.scroll(driver);
            System.out.println("MP");
        } catch (TimeoutException | NoSuchElementException | AssertionError | ScreenshotException | ElementNotInteractableException e) {
            System.out.println("Exception for Jharkhand" + e);
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

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        driver.quit();

    }
}
