/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firkeeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import java.io.File;
import org.openqa.selenium.WebDriver;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import setup.drivers;
import amarujala_Firkee.*;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.remote.ScreenshotException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import utility.*;

/**
 *
 * @author akhilesh
 */
public class firkeeTest {
    
    private WebDriver driver;
    ExtentReports extent;
    ExtentTest logger;
    
    public firkeeTest() {
        
    }
    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        driver = drivers.Chromesetup();
    }

    @BeforeTest
    public void startReport() {
        
        extent = new ExtentReports(System.getProperty("user.dir") + "/test-output/Firkee.html", true);
        extent
                .addSystemInfo("Host Name", "Amarujala Firkee Sanity Report")
                .addSystemInfo("Environment", "Automation Testing")
                .addSystemInfo("User Name", "Akhilesh");
     
        extent.loadConfig(new File(System.getProperty("user.dir") + "\\extent-config.xml"));
    }
    
    
    @Test(priority=1)
    public void firkeepageview() throws InterruptedException{
        logger = extent.startTest("Firkee page view"); 
        driver.get("https://firkee.in");
        logger.log(LogStatus.INFO, "Navigated to firkee.in");
        Thread.sleep(2000);
        
        try {
            
        menupages.firkee_cat_0(driver).click();
        logger.log(LogStatus.INFO, "Navigated to homepage of firkee");
            System.out.println(driver.getTitle());
        Assert.assertTrue(driver.getTitle().contains("Top Trending News, Hot News & Stories In Hindi - Firkee"));
        utility.scrollfunctions.scroll(driver);
        logger.log(LogStatus.PASS, "Page title verified");
        utility.waitfunction.WaitForAjax(driver);
         
        } catch (TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
            System.out.println("Exception for Home  " + e);
        }

        try{
            
        
        menupages.firkee_cat_1(driver).click();
        logger.log(LogStatus.INFO,"Navigated to Firkee Viral tab");
        System.out.println(driver.getTitle());
        Assert.assertTrue(driver.getTitle().contains("Omg News, Stories In Hindi - Firkee.in"));
        utility.scrollfunctions.scroll(driver);
        logger.log(LogStatus.PASS, "Page title verified");
        utility.waitfunction.WaitForAjax(driver);
        
        } catch (TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
            System.out.println("Exception for Viral" + e);
        }

        try{
            
  
        menupages.firkee_cat_2(driver).click();
        logger.log(LogStatus.INFO,"Navigated to Firkee Panchyat tab");
        System.out.println(driver.getTitle());
        Assert.assertTrue(driver.getTitle().contains("Political News & Most Controversial Society News In Hindi - Firkee.in"));
        utility.scrollfunctions.scroll(driver);
        logger.log(LogStatus.PASS, "Page title verified");
        utility.waitfunction.WaitForAjax(driver);
        
        } catch (TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
            System.out.println("Exception for Panchyat" + e);
        }

        
        try{
            
        menupages.firkee_cat_3(driver).click();
        logger.log(LogStatus.INFO,"Navigated to Firkee Photo tab");
        System.out.println(driver.getTitle());
        Assert.assertTrue(driver.getTitle().contains("Photo Gallery Breaking And Latest News In Hindi - Firkee.in"));
        utility.scrollfunctions.scroll(driver);
        logger.log(LogStatus.PASS, "Page title verified");
        utility.waitfunction.WaitForAjax(driver);
        
        } catch (TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
            System.out.println("Exception for Photo" + e);
        }

        try{
        menupages.firkee_cat_4(driver).click();
        logger.log(LogStatus.INFO,"Navigated to Firkee Videos tab");
        System.out.println(driver.getTitle());
        Assert.assertTrue(driver.getTitle().contains("Viral Videos, Funny Video Clips & Stories In Hindi - Firkee.in"));
        utility.scrollfunctions.scroll(driver);
        logger.log(LogStatus.PASS, "Page title verified");
        utility.waitfunction.WaitForAjax(driver);
         } catch (TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
            System.out.println("Exception for Videos" + e);
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
