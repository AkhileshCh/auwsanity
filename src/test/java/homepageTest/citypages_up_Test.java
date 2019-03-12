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
import java.io.IOException;
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
,logger */
public class citypages_up_Test {
    
    
    private WebDriver driver;
    ExtentReports extent;
    ExtentTest logger;
    
    
    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        driver = drivers.Chromesetup();
    }
    
    @BeforeTest
    public void startReport() {
        extent = new ExtentReports(System.getProperty("user.dir") + "/test-output/amarujalaWeb_up.html", true);
        extent
                .addSystemInfo("Host Name", "Amarujala Sanity Report")
                .addSystemInfo("Environment", "Automation Testing")
                .addSystemInfo("User Name", "Akhilesh");
        extent.loadConfig(new File(System.getProperty("user.dir") + "\\extent-config.xml"));
        
    }
    
    
    @Test
    // Get up city and state page.
    public void stateUP(WebDriver driver) throws InterruptedException, IOException, Exception {

        try {
            logger = extent.startTest("stateUP");
            driver.get("https://www.amarujala.com/");
            logger.log(LogStatus.INFO, "Navigated to Amarujala.com");
            Thread.sleep(2000);
            homepage.h_main_city(driver).click();
            Assert.assertTrue(driver.getTitle().contains("City And States News In Hindi, Latest शहर और राज्य समाचार Headlines – Amar Ujala"));
            logger.log(LogStatus.PASS, "City Page Title verified");
            logger.log(LogStatus.INFO, "Navigated to Citypage");
            cityandstate.city_UP(driver).click();
            Assert.assertTrue(driver.getTitle().contains("Up News: Uttar Pradesh News In Hindi, Latest उत्तर प्रदेश समाचार – Amar Ujala"));
            logger.log(LogStatus.PASS, "UP Page Title verified");
            cityandstate.city_UP_1(driver).click();
            Assert.assertTrue(driver.getTitle().contains("Lucknow News In Hindi, Latest लखनऊ न्यूज़ Headlines - Amarujala.com"));
            logger.log(LogStatus.PASS, "Lucknow Page Title verified");
            if ("लखनऊ".equals(cityandstate.city_UP_1(driver).getText())) {
                logger.log(LogStatus.PASS, "page लखनऊ is good");
                takescreenshot.takeSnapShot(driver, "/home/akhilesh/Documents/sel_Scr/test.png");
                logger.log(
                        LogStatus.INFO,
                        "Snapshot : "
                        + logger.addScreenCapture("/home/akhilesh/Documents/sel_Scr/test.png"));
            }
            waitfunction.WaitForAjax(driver);
            scrollfunctions.scroll(driver);
            utility.getpageStorydates.getpagestorydates(driver,logger);
            System.out.println("L1");
        } catch (TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
            System.out.println("Exception for L1" + e);
        }

        try {

            cityandstate.city_UP_2(driver).click();
            logger.log(LogStatus.INFO, "Navigating to page मेरठ");
            Assert.assertTrue(driver.getTitle().contains("Meerut News In Hindi, Latest मेरठ न्यूज़ Headlines - Amarujala.com"));
            logger.log(LogStatus.PASS, "Meerut page Title verified");
            if ("मेरठ".equals(cityandstate.city_UP_2(driver).getText())) {
                logger.log(LogStatus.PASS, "page मेरठ is good");
                takescreenshot.takeSnapShot(driver, "/home/akhilesh/Documents/sel_Scr/test1.png");
                logger.log(
                        LogStatus.INFO,
                        "Snapshot : "
                        + logger.addScreenCapture("/home/akhilesh/Documents/sel_Scr/test1.png"));
            }
            waitfunction.WaitForAjax(driver);
            scrollfunctions.scroll(driver);
            utility.getpageStorydates.getpagestorydates(driver,logger);
            System.out.println("L2");
        } catch (TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
            System.out.println("Exception for L2" + e);
        }

        try {

            cityandstate.city_UP_3(driver).click();
            logger.log(LogStatus.INFO, "Navigating to page कानपुर");
            Assert.assertTrue(driver.getTitle().contains("Kanpur News In Hindi, Latest कानपुर न्यूज़ Headlines - Amarujala.com"));
            logger.log(LogStatus.PASS, "Kanpur page Title verified");
            if ("कानपुर".equals(cityandstate.city_UP_3(driver).getText())) {
                logger.log(LogStatus.PASS, "page कानपुर is good");
                takescreenshot.takeSnapShot(driver, "/home/akhilesh/Documents/sel_Scr/test2.png");
                logger.log(
                        LogStatus.INFO,
                        "Snapshot : "
                        + logger.addScreenCapture("/home/akhilesh/Documents/sel_Scr/test2.png"));
            }
            waitfunction.WaitForAjax(driver);
            scrollfunctions.scroll(driver);
            utility.getpageStorydates.getpagestorydates(driver,logger);
            System.out.println("L3");
        } catch (TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
            System.out.println("Exception for L3" + e);
        }

        try {

            cityandstate.city_UP_4(driver).click();
            logger.log(LogStatus.INFO, "Navigating to page आगरा");
            Assert.assertTrue(driver.getTitle().contains("Agra News In Hindi, Latest आगरा न्यूज़ Headlines - Amarujala.com"));
            logger.log(LogStatus.PASS, "Agra page Title verified");
            if ("आगरा".equals(cityandstate.city_UP_4(driver).getText())) {
                logger.log(LogStatus.PASS, "page आगरा is good");
                takescreenshot.takeSnapShot(driver, "/home/akhilesh/Documents/sel_Scr/test3.png");
                logger.log(
                        LogStatus.INFO,
                        "Snapshot : "
                        + logger.addScreenCapture("/home/akhilesh/Documents/sel_Scr/test3.png"));
            }
            waitfunction.WaitForAjax(driver);
            scrollfunctions.scroll(driver);
            utility.getpageStorydates.getpagestorydates(driver,logger);
            System.out.println("L4");
        } catch (TimeoutException | NoSuchElementException | AssertionError|ElementNotInteractableException e) {
            System.out.println("Exception for L4" + e);
        }

        try {

            cityandstate.city_UP_5(driver).click();
            logger.log(LogStatus.INFO, "Navigating to page वाराणसी");
            Assert.assertTrue(driver.getTitle().contains("Varanasi News In Hindi, Latest Varanasi Headlines - Amarujala.com"));
            logger.log(LogStatus.PASS, "varanasi page Title verified");
            if ("वाराणसी".equals(cityandstate.city_UP_5(driver).getText())) {
                logger.log(LogStatus.PASS, "page वाराणसी is good");
                takescreenshot.takeSnapShot(driver, "/home/akhilesh/Documents/sel_Scr/test4.png");
                logger.log(
                        LogStatus.INFO,
                        "Snapshot : "
                        + logger.addScreenCapture("/home/akhilesh/Documents/sel_Scr/test4.png"));
            }
            waitfunction.WaitForAjax(driver);
            scrollfunctions.scroll(driver);
            utility.getpageStorydates.getpagestorydates(driver,logger);
            System.out.println("L5");
        } catch (TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
            System.out.println("Exception for L5" + e);
        }

        try {

            String name = cityandstate.city_UP_6(driver).getText();
            cityandstate.city_UP_6(driver).click();
            logger.log(LogStatus.PASS, "Navigating to page अलीगढ़");
            Assert.assertTrue(driver.getTitle().contains("Aligarh News In Hindi, Latest अलीगढ न्यूज़ Headlines - Amarujala.com"));
            logger.log(LogStatus.INFO, "aligarh page Title verified");
            if (!"अलीगढ़".equals(name)) {
                System.out.println("text not found");
            } else {
                logger.log(LogStatus.PASS, "page अलीगढ़ is good");
                takescreenshot.takeSnapShot(driver, "/home/akhilesh/Documents/sel_Scr/test5.png");
                logger.log(
                        LogStatus.INFO,
                        "Snapshot : "
                        + logger.addScreenCapture("/home/akhilesh/Documents/sel_Scr/test5.png"));
            }
            waitfunction.WaitForAjax(driver);
            scrollfunctions.scroll(driver);
            utility.getpageStorydates.getpagestorydates(driver,logger);
            System.out.println("L6");
        } catch (TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
            System.out.println("Exception for L6" + e);

        }

        try {

            cityandstate.city_UP_7(driver).click();
            logger.log(LogStatus.PASS, "Navigating to page गोरखपुर");
            Assert.assertTrue(driver.getTitle().contains("Gorakhpur News In Hindi, Latest गोरखपुर न्यूज़ Headlines - Amarujala.com"));
            logger.log(LogStatus.INFO, "gorakhpur page Title verified");
            if ("गोरखपुर".equals(cityandstate.city_UP_7(driver).getText())) {
                logger.log(LogStatus.PASS, "page गोरखपुर is good");
                takescreenshot.takeSnapShot(driver, "/home/akhilesh/Documents/sel_Scr/test6.png");
                logger.log(
                        LogStatus.INFO,
                        "Snapshot : "
                        + logger.addScreenCapture("/home/akhilesh/Documents/sel_Scr/test6.png"));
            }
            waitfunction.WaitForAjax(driver);
            scrollfunctions.scroll(driver);
            utility.getpageStorydates.getpagestorydates(driver,logger);
            System.out.println("L7");

            cityandstate.city_UP_8(driver).click();
            logger.log(LogStatus.INFO, "Navigating to page झांसी");
            Assert.assertTrue(driver.getTitle().contains("Jhansi News In Hindi, Latest झाँसी न्यूज़ Headlines - Amarujala.com"));
            logger.log(LogStatus.PASS, "Jhansi page Title verified");
            if ("झांसी".equals(cityandstate.city_UP_8(driver).getText())) {
                logger.log(LogStatus.PASS, "page झांसी is good");
                takescreenshot.takeSnapShot(driver, "/home/akhilesh/Documents/sel_Scr/test7.png");
                logger.log(
                        LogStatus.INFO,
                        "Snapshot : "
                        + logger.addScreenCapture("/home/akhilesh/Documents/sel_Scr/test7.png"));
            }
            waitfunction.WaitForAjax(driver);
            scrollfunctions.scroll(driver);
            utility.getpageStorydates.getpagestorydates(driver,logger);
            System.out.println("L8");
        } catch (TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
            System.out.println("Exception for L8" + e);
        }

        try {

            cityandstate.city_UP_9(driver).click();
            logger.log(LogStatus.INFO, "Navigating to page बरेली");
            Assert.assertTrue(driver.getTitle().contains("Bareilly News In Hindi, Latest बरेली न्यूज़ Headlines - Amarujala.com"));
            logger.log(LogStatus.PASS, "Bareilly page Title verified");
            if ("बरेली".equals(cityandstate.city_UP_9(driver).getText())) {
                logger.log(LogStatus.PASS, "page बरेली is good");
                takescreenshot.takeSnapShot(driver, "/home/akhilesh/Documents/sel_Scr/test8.png");
                logger.log(
                        LogStatus.INFO,
                        "Snapshot : "
                        + logger.addScreenCapture("/home/akhilesh/Documents/sel_Scr/test8.png"));
            }
            waitfunction.WaitForAjax(driver);
            scrollfunctions.scroll(driver);
            utility.getpageStorydates.getpagestorydates(driver,logger);
            System.out.println("L9");
        } catch (TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
            System.out.println("Exception for L9" + e);
        }

        try {

            cityandstate.city_UP_10(driver).click();
            logger.log(LogStatus.INFO, "Navigating to page मुरादाबाद");
            Assert.assertTrue(driver.getTitle().contains("Moradabad News In Hindi, Latest मुरादाबाद न्यूज़ Headlines - Amarujala.com"));
            logger.log(LogStatus.PASS, "Moradabad page Title verified");
            if ("मुरादाबाद".equals(cityandstate.city_UP_10(driver).getText())) {
                logger.log(LogStatus.PASS, "page मुरादाबाद is good");
                takescreenshot.takeSnapShot(driver, "/home/akhilesh/Documents/sel_Scr/test9.png");
                logger.log(
                        LogStatus.INFO,
                        "Snapshot : "
                        + logger.addScreenCapture("/home/akhilesh/Documents/sel_Scr/test9.png"));
            }
            waitfunction.WaitForAjax(driver);
            scrollfunctions.scroll(driver);
            utility.getpageStorydates.getpagestorydates(driver,logger);
            System.out.println("L10");
        } catch (TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
            System.out.println("Exception in L10" + e);
        }

        try {

            cityandstate.city_UP_11(driver).click();
            logger.log(LogStatus.INFO, "Navigating to page प्रयागराज");
            Assert.assertTrue(driver.getTitle().contains("Allahabad News In Hindi, Prayagraj Hindi News, Latest इलाहाबाद प्रयागराज न्यूज़ Headlines - Amarujala.com"));
            logger.log(LogStatus.INFO, "Allahabad page Title verified");
            if ("प्रयागराज".equals(cityandstate.city_UP_11(driver).getText())) {
                logger.log(LogStatus.PASS, "page प्रयागराज is good");
                takescreenshot.takeSnapShot(driver, "/home/akhilesh/Documents/sel_Scr/test9.png");
                logger.log(
                        LogStatus.INFO,
                        "Snapshot : "
                        + logger.addScreenCapture("/home/akhilesh/Documents/sel_Scr/test9.png"));
            }
            waitfunction.WaitForAjax(driver);
            scrollfunctions.scroll(driver);
            utility.getpageStorydates.getpagestorydates(driver,logger);
            System.out.println("L11");
        } catch (TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
            System.out.println("Exception for L11" + e);
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
