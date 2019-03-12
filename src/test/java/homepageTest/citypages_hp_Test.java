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
public class citypages_hp_Test {
    
    private WebDriver driver;
    ExtentReports extent;
    ExtentTest logger;
    
    
    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        driver = drivers.Chromesetup();
    }
    
    @BeforeTest
    public void startReport() {
        extent = new ExtentReports(System.getProperty("user.dir") + "/test-output/amarujalaWeb_hp.html", true);
        extent
                .addSystemInfo("Host Name", "Amarujala Sanity Report")
                .addSystemInfo("Environment", "Automation Testing")
                .addSystemInfo("User Name", "Akhilesh");
        extent.loadConfig(new File(System.getProperty("user.dir") + "\\extent-config.xml"));
        
    }
    
    
     @Test
    public void stateHP(WebDriver driver) throws InterruptedException, Exception {

        try {

            logger = extent.startTest("stateHP");
            driver.get("https://www.amarujala.com/");
            logger.log(LogStatus.INFO, "Navigated to Amarujala.com");
            Thread.sleep(2000);
            homepage.h_main_city(driver).click();
            Assert.assertTrue(driver.getTitle().contains("City And States News In Hindi, Latest शहर और राज्य समाचार Headlines – Amar Ujala"));
            logger.log(LogStatus.PASS, "City Page Title verified");
            logger.log(LogStatus.INFO, "Navigated to Citypage");
            cityandstate.city_hp(driver).click();
            Assert.assertTrue(driver.getTitle().contains("Himachal Pradesh News In Hindi, Latest हिमाचल प्रदेश न्यूज़ Headlines - Amarujala.com"));
            logger.log(LogStatus.PASS, "Himachal Pradesh Page Title verified");
            String name = cityandstate.city_hp_1(driver).getText();
            cityandstate.city_hp_1(driver).click();
            Assert.assertTrue(driver.getTitle().contains("Una News In Hindi, Latest उना न्यूज़ Headlines - Amaraujla.com"));
            logger.log(LogStatus.PASS, "Una Page Title verified");
            if ("उना".equals(name)) {
                logger.log(LogStatus.PASS, "page उना is good");
                takescreenshot.takeSnapShot(driver, "/home/akhilesh/Documents/sel_Scr/test17.png");
                logger.log(
                        LogStatus.INFO,
                        "Snapshot : "
                        + logger.addScreenCapture("/home/akhilesh/Documents/sel_Scr/test17.png"));
            }
            waitfunction.WaitForAjax(driver);
            scrollfunctions.scroll(driver);
            System.out.println("L17");
        } catch (TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
            System.out.println("Exception for L17" + e);
        }

        try {
            String name = cityandstate.city_hp_2(driver).getText();
            cityandstate.city_hp_2(driver).click();
            Assert.assertTrue(driver.getTitle().contains("Breaking And Latest Kangra News In Hindi - Amarujala.com"));
            logger.log(LogStatus.PASS, "Kangra Page Title verified");
            if ("कांगड़ा".equals(name)) {
                logger.log(LogStatus.PASS, "page कांगड़ा is good");
                takescreenshot.takeSnapShot(driver, "/home/akhilesh/Documents/sel_Scr/test18.png");
                logger.log(
                        LogStatus.INFO,
                        "Snapshot : "
                        + logger.addScreenCapture("/home/akhilesh/Documents/sel_Scr/test18.png"));
            }
            waitfunction.WaitForAjax(driver);
            scrollfunctions.scroll(driver);
            System.out.println("L18");
        } catch (TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
            System.out.println("Exception for L18" + e);
        }

        try {
            cityandstate.city_hp_3(driver).click();
            Assert.assertTrue(driver.getTitle().contains("Kullu News In Hindi, Latest कुल्लू न्यूज़ Headlines - Amarujala.com"));
            logger.log(LogStatus.PASS, "Kullu Page Title verified");
            if ("कुल्लू".equals(cityandstate.city_hp_3(driver).getText())) {
                logger.log(LogStatus.PASS, "page कुल्लू is good");
                takescreenshot.takeSnapShot(driver, "/home/akhilesh/Documents/sel_Scr/test19.png");
                logger.log(
                        LogStatus.INFO,
                        "Snapshot : "
                        + logger.addScreenCapture("/home/akhilesh/Documents/sel_Scr/test19.png"));
            }
            waitfunction.WaitForAjax(driver);
            scrollfunctions.scroll(driver);
            System.out.println("L19");
        } catch (TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
            System.out.println("Exception for L19" + e);
        }

        try {
            cityandstate.city_hp_4(driver).click();
            Assert.assertTrue(driver.getTitle().contains("Chamba News In Hindi, Latest चम्बा न्यूज़ Headlines - Amarujala.com"));
            logger.log(LogStatus.PASS, "Chamba Page Title verified");
            if ("चम्बा".equals(cityandstate.city_hp_4(driver).getText())) {
                logger.log(LogStatus.PASS, "page चम्बा is good");
                takescreenshot.takeSnapShot(driver, "/home/akhilesh/Documents/sel_Scr/test20.png");
                logger.log(
                        LogStatus.INFO,
                        "Snapshot : "
                        + logger.addScreenCapture("/home/akhilesh/Documents/sel_Scr/test20.png"));
            }
            waitfunction.WaitForAjax(driver);
            scrollfunctions.scroll(driver);
            System.out.println("L20");
        } catch (TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
            System.out.println("Exception for L20" + e);
        }

        /* city redirect is there so  
        
        cityandstate.city_hp_5(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_hp_5(driver).getText());
         */
        try {
            cityandstate.city_hp_6(driver).click();
            Assert.assertTrue(driver.getTitle().contains("Bilaspur News In Hindi, Latest बिलासपुर न्यूज़ Headlines - Amarujala.com"));
            logger.log(LogStatus.PASS, "Bilaspur Page Title verified");
            if ("बिलासपुर".equals(cityandstate.city_hp_6(driver).getText())) {
                logger.log(LogStatus.PASS, "page बिलासपुर is good");
                takescreenshot.takeSnapShot(driver, "/home/akhilesh/Documents/sel_Scr/test21.png");
                logger.log(
                        LogStatus.INFO,
                        "Snapshot : "
                        + logger.addScreenCapture("/home/akhilesh/Documents/sel_Scr/test21.png"));
            }
            waitfunction.WaitForAjax(driver);
            scrollfunctions.scroll(driver);
            System.out.println("L21");
        } catch (TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
            System.out.println("Exception for L21" + e);
        }

        try {
            cityandstate.city_hp_7(driver).click();
            Assert.assertTrue(driver.getTitle().contains("Mandi News In Hindi, Latest मंडी न्यूज़ Headlines - Amarujala.com"));
            logger.log(LogStatus.PASS, "Mandi Page Title verified");
            if ("मंडी".equals(cityandstate.city_hp_7(driver).getText())) {
                logger.log(LogStatus.PASS, "page मंडी is good");
                takescreenshot.takeSnapShot(driver, "/home/akhilesh/Documents/sel_Scr/test22.png");
                logger.log(
                        LogStatus.INFO,
                        "Snapshot : "
                        + logger.addScreenCapture("/home/akhilesh/Documents/sel_Scr/test22.png"));
            }
            waitfunction.WaitForAjax(driver);
            scrollfunctions.scroll(driver);
            System.out.println("L22");
        } catch (TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
            System.out.println("Exception for L22" + e);
        }

        try {
            cityandstate.city_hp_8(driver).click();
            Assert.assertTrue(driver.getTitle().contains("Breaking And Latest Rampur Bushahar News In Hindi - Amarujala.com"));
            logger.log(LogStatus.PASS, "Rampur Bushahar Page Title verified");
            if ("रामपुर बुशहर".equals(cityandstate.city_hp_7(driver).getText())) {
                logger.log(LogStatus.PASS, "page रामपुर बुशहर is good");
                takescreenshot.takeSnapShot(driver, "/home/akhilesh/Documents/sel_Scr/test23.png");
                logger.log(
                        LogStatus.INFO,
                        "Snapshot : "
                        + logger.addScreenCapture("/home/akhilesh/Documents/sel_Scr/test23.png"));
            }
            waitfunction.WaitForAjax(driver);
            scrollfunctions.scroll(driver);
            System.out.println("L23");
        } catch (TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
            System.out.println("Exception for L23" + e);
        }

        try {
            cityandstate.city_hp_9(driver).click();
            Assert.assertTrue(driver.getTitle().contains("Shimla News In Hindi, Latest शिमला न्यूज़ Headlines - Amarujala.com"));
            logger.log(LogStatus.PASS, "Shimla Page Title verified");
            if ("शिमला".equals(cityandstate.city_hp_7(driver).getText())) {
                logger.log(LogStatus.PASS, "page शिमला is good");
                takescreenshot.takeSnapShot(driver, "/home/akhilesh/Documents/sel_Scr/test24.png");
                logger.log(
                        LogStatus.INFO,
                        "Snapshot : "
                        + logger.addScreenCapture("/home/akhilesh/Documents/sel_Scr/test24.png"));
            }
            waitfunction.WaitForAjax(driver);
            scrollfunctions.scroll(driver);
            System.out.println("L24");
        } catch (TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
            System.out.println("Exception for L24" + e);
        }
//        cityandstate.city_hp_10(driver).click();
//        waitfunction.WaitForAjax(driver);
//        scrollfunctions.scroll(driver);
//        System.out.println("L25");
// 
//        cityandstate.city_hp_11(driver).click();
//        waitfunction.WaitForAjax(driver);
//        scrollfunctions.scroll(driver);
//        System.out.println("L26");
//        
//        cityandstate.city_hp_12(driver).click();
//        waitfunction.WaitForAjax(driver);
//        scrollfunctions.scroll(driver);
//        System.out.println("L27");
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
