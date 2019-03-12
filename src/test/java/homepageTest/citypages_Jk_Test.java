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
public class citypages_Jk_Test {
    
    private WebDriver driver;
    ExtentReports extent;
    ExtentTest logger;
    
    
    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        driver = drivers.Chromesetup();
    }
    
    @BeforeTest
    public void startReport() {
        extent = new ExtentReports(System.getProperty("user.dir") + "/test-output/amarujalaWeb_j&K.html", true);
        extent
                .addSystemInfo("Host Name", "Amarujala Sanity Report")
                .addSystemInfo("Environment", "Automation Testing")
                .addSystemInfo("User Name", "Akhilesh");
        extent.loadConfig(new File(System.getProperty("user.dir") + "\\extent-config.xml"));
        
    }
    
    @Test
    public void stateJammu_Kasmeer() throws InterruptedException, Exception {
        
        try{
            
        logger = extent.startTest("stateJammu_Kasmeer");
        driver.get("https://www.amarujala.com/");
        logger.log(LogStatus.INFO, "Navigated to Amarujala.com");
        homepage.h_main_city(driver).click();
        Assert.assertTrue(driver.getTitle().contains("City And States News In Hindi, Latest शहर और राज्य समाचार Headlines – Amar Ujala"));
        logger.log(LogStatus.PASS, "City Page Title verified");
        logger.log(LogStatus.INFO, "Navigated to Citypage");
        cityandstate.city_j_k(driver).click();
        logger.log(LogStatus.INFO,"Navigated to JammuandKasmir");
        Assert.assertTrue(driver.getTitle().contains("Jammu And Kashmir News In Hindi, Jk News Today, जम्मू और कश्मीर समाचार - Amar Ujala"));
        logger.log(LogStatus.PASS,"J&K page Title verified");
        String name = cityandstate.city_j_k_1(driver).getText();
        cityandstate.city_j_k_1(driver).click();
        Assert.assertTrue(driver.getTitle().contains("Udhampur News In Hindi, Latest उधमपुर न्यूज़ Headlines - Amarujala.com"));
            logger.log(LogStatus.PASS, "Udhampur Title verified");
            if ("उधमपुर".equals(name)) {
                logger.log(LogStatus.PASS, "page Udhampur is good");
                takescreenshot.takeSnapShot(driver, "/home/akhilesh/Documents/sel_Scr/test47.png");
                logger.log(
                        LogStatus.INFO,
                        "Snapshot : "
                        + logger.addScreenCapture("/home/akhilesh/Documents/sel_Scr/test47.png"));
            }
        
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println("JK1");
        }catch(TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
            System.out.println("Exception for Udhampur" + e);
            
        }    
        
        try{
            
        String name = cityandstate.city_j_k_2(driver).getText();
        cityandstate.city_j_k_2(driver).click();
        Assert.assertTrue(driver.getTitle().contains("Kathua News In Hindi, Latest कठुआ न्यूज़ Headlines - Amarujala.com"));
            logger.log(LogStatus.PASS, "Kathua Title verified");
            if ("कठुआ".equals(name)) {
                logger.log(LogStatus.PASS, "page Kathua is good");
                takescreenshot.takeSnapShot(driver, "/home/akhilesh/Documents/sel_Scr/test48.png");
                logger.log(
                        LogStatus.INFO,
                        "Snapshot : "
                        + logger.addScreenCapture("/home/akhilesh/Documents/sel_Scr/test48.png"));
            }
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println("JK2");
        }catch(TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
            System.out.println("Exception for Kathua" + e);
        }
        
        
        try{
        String name =  cityandstate.city_j_k_3(driver).getText();
        cityandstate.city_j_k_3(driver).click();
        Assert.assertTrue(driver.getTitle().contains("Jammu News In Hindi, Latest जम्मू न्यूज़ Headlines - Amarujala.com"));
            logger.log(LogStatus.PASS, "Jammu Title verified");
            if ("जम्मू".equals(name)) {
                logger.log(LogStatus.PASS, "page Jammu is good");
                takescreenshot.takeSnapShot(driver, "/home/akhilesh/Documents/sel_Scr/test49.png");
                logger.log(
                        LogStatus.INFO,
                        "Snapshot : "
                        + logger.addScreenCapture("/home/akhilesh/Documents/sel_Scr/test49.png"));
            }
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println("JK3");
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
         }catch(TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
            System.out.println("Exception for Jammu" + e);
        }
        
        try{
        String name = cityandstate.city_j_k_4(driver).getText();
        cityandstate.city_j_k_4(driver).click();
        Assert.assertTrue(driver.getTitle().contains("Breaking And Latest Poonch News In Hindi - Amarujala.com"));
            logger.log(LogStatus.PASS, "Poonch Title verified");
            if ("पुंछ".equals(name)) {
                logger.log(LogStatus.PASS, "page Poonch is good");
                takescreenshot.takeSnapShot(driver, "/home/akhilesh/Documents/sel_Scr/test50.png");
                logger.log(
                        LogStatus.INFO,
                        "Snapshot : "
                        + logger.addScreenCapture("/home/akhilesh/Documents/sel_Scr/test50.png"));
            }
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println("JK5");
        }catch(TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
            System.out.println("Exception for Poonch" + e);
        }
        
        try{
        String name = cityandstate.city_j_k_5(driver).getText();
        cityandstate.city_j_k_5(driver).click();
        Assert.assertTrue(driver.getTitle().contains("Rajouri News In Hindi, Latest राजौरी न्यूज़ Headlines - Amarujala.com"));
            logger.log(LogStatus.PASS, "Rajouri Title verified");
            if ("राजौरी".equals(name)) {
                logger.log(LogStatus.PASS, "page Rajouri is good");
                takescreenshot.takeSnapShot(driver, "/home/akhilesh/Documents/sel_Scr/test51.png");
                logger.log(
                        LogStatus.INFO,
                        "Snapshot : "
                        + logger.addScreenCapture("/home/akhilesh/Documents/sel_Scr/test51.png"));
            }
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println("JK6");
        }catch(TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
            System.out.println("Exception for Rajouri" + e);
        }
             
        try{
        String name = cityandstate.city_j_k_6(driver).getText();
        cityandstate.city_j_k_6(driver).click();
        Assert.assertTrue(driver.getTitle().contains("Breaking And Latest Srinagar News In Hindi - Amarujala.com"));
            logger.log(LogStatus.PASS, "Srinagar Title verified");
            if ("श्रीनगर".equals(name)) {
                logger.log(LogStatus.PASS, "page Srinagar is good");
                takescreenshot.takeSnapShot(driver, "/home/akhilesh/Documents/sel_Scr/test52.png");
                logger.log(
                        LogStatus.INFO,
                        "Snapshot : "
                        + logger.addScreenCapture("/home/akhilesh/Documents/sel_Scr/test52.png"));
            }
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println("JK6");
        }catch(TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
            System.out.println("Exception for Srinagar" + e);
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
