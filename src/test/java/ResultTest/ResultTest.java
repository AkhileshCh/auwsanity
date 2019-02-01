/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ResultTest;

import amarujala_Firkee.menupages;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import java.io.File;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import setup.drivers;
import amarujala_Results.*;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.remote.ScreenshotException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

/**
 *
 * @author akhilesh
 */
public class ResultTest {

    private WebDriver driver;
    ExtentReports extent;
    ExtentTest logger;

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        driver = drivers.Chromesetup();
    }

    @BeforeTest
    public void startReport() {

        extent = new ExtentReports(System.getProperty("user.dir") + "/test-output/amarujalaResults.html", true);
        extent
                .addSystemInfo("Host Name", "Amarujala Epaper Sanity Report")
                .addSystemInfo("Environment", "Automation Testing")
                .addSystemInfo("User Name", "Akhilesh");

        extent.loadConfig(new File(System.getProperty("user.dir") + "\\extent-config.xml"));
    }

    @Test
    public void resultpageview() throws InterruptedException {
        logger = extent.startTest("ResultabCheck");
        driver.get("https://results.amarujala.com/");
        logger.log(LogStatus.INFO, "Navigated to results.amarujala");
        Thread.sleep(2000);

        try {
            resultsMenu.result_cat_1(driver).click();
            logger.log(LogStatus.INFO, "Navigated to homepage of Results");
            System.out.println(driver.getTitle());
            Assert.assertTrue(driver.getTitle().contains("Government Job | Upcoming Job Opportunities‎, Career Options In India - Results.amarujala.com"));
            utility.scrollfunctions.scroll(driver);
            logger.log(LogStatus.PASS, "Page title verified");
            utility.waitfunction.WaitForAjax(driver);

        } catch (TimeoutException | NoSuchElementException | AssertionError | ScreenshotException | ElementNotInteractableException e) {
            System.out.println("Exception for Home  " + e);
        }

        try {
            resultsMenu.result_cat_2(driver).click();
            logger.log(LogStatus.INFO, "Navigated to ResultsExamAlert");
            System.out.println(driver.getTitle());
            Assert.assertTrue(driver.getTitle().contains("Exam Alerts: Board Exam Results 2018, Online Board Exam Results, India Results 2018 - Results.amarujala.com"));
            utility.scrollfunctions.scroll(driver);
            logger.log(LogStatus.PASS, "Page title verified");
            utility.waitfunction.WaitForAjax(driver);

        } catch (TimeoutException | NoSuchElementException | AssertionError | ScreenshotException | ElementNotInteractableException e) {
            System.out.println("Exception for Home  " + e);
        }
        try {
            resultsMenu.result_cat_3(driver).click();
            logger.log(LogStatus.INFO, "Navigated to Resultpage of Results");
            System.out.println(driver.getTitle());
            Assert.assertTrue(driver.getTitle().contains("Result Alerts 2018, Board Result Alerts 2018, Online Board Result Alerts And Notification 2018 – Results.amarujala.com"));
            utility.scrollfunctions.scroll(driver);
            logger.log(LogStatus.PASS, "Page title verified");
            utility.waitfunction.WaitForAjax(driver);

        } catch (TimeoutException | NoSuchElementException | AssertionError | ScreenshotException | ElementNotInteractableException e) {
            System.out.println("Exception for Home  " + e);
        }
        try {
            resultsMenu.result_cat_4(driver).click();
            logger.log(LogStatus.INFO, "Navigated to latest results of Results");
            System.out.println(driver.getTitle());
            Assert.assertTrue(driver.getTitle().contains("Latest Results Recent Updates - Amar Ujala Results"));
            utility.scrollfunctions.scroll(driver);
            logger.log(LogStatus.PASS, "Page title verified");
            utility.waitfunction.WaitForAjax(driver);

        } catch (TimeoutException | NoSuchElementException | AssertionError | ScreenshotException | ElementNotInteractableException e) {
            System.out.println("Exception for Home  " + e);
        }

        try {
            resultsMenu.result_cat_5(driver).click();
            logger.log(LogStatus.INFO, "Navigated to jobpage of Results");
            System.out.println(driver.getTitle());
            Assert.assertTrue(driver.getTitle().contains("Latest Govt Jobs 2018-19 | Government Jobs Notification 2018 - Results.amarujala.com"));
            utility.scrollfunctions.scroll(driver);
            logger.log(LogStatus.PASS, "Page title verified");
            utility.waitfunction.WaitForAjax(driver);

        } catch (TimeoutException | NoSuchElementException | AssertionError | ScreenshotException | ElementNotInteractableException e) {
            System.out.println("Exception for Home  " + e);
        }
        try {
            resultsMenu.result_cat_6(driver).click();
            logger.log(LogStatus.INFO, "Navigated to boardpage of Results");
            System.out.println(driver.getTitle());
            Assert.assertTrue(driver.getTitle().contains("Check Live Board And University Exams 2019 Results In India"));
            utility.scrollfunctions.scroll(driver);
            logger.log(LogStatus.PASS, "Page title verified");
            utility.waitfunction.WaitForAjax(driver);

        } catch (TimeoutException | NoSuchElementException | AssertionError | ScreenshotException | ElementNotInteractableException e) {
            System.out.println("Exception for Home  " + e);
        }
    }

    @AfterMethod
    public void getResult(ITestResult result
    ) {
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
