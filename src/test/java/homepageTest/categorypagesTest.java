/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homepageTest;

import amarujala_Web.categorypages;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import java.io.File;
import java.text.ParseException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.ScreenshotException;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import setup.drivers;
import utility.scrollfunctions;
import utility.waitfunction;

/**
 *
 * @author akhilesh
 */
public class categorypagesTest {
    
    private WebDriver driver;
    ExtentReports extent;
    ExtentTest logger;
    
    
    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        driver = drivers.Chromesetup();
    }
    
     @BeforeTest
    public void startReport() {
        extent = new ExtentReports(System.getProperty("user.dir") + "/test-output/amarujalaWeb_category_pages.html", true);
        extent
                .addSystemInfo("Host Name", "Amarujala Sanity Report")
                .addSystemInfo("Environment", "Automation Testing")
                .addSystemInfo("User Name", "Akhilesh");
        extent.loadConfig(new File(System.getProperty("user.dir") + "\\extent-config.xml"));
        
    }
    @Test
    public void categorypageTest() throws InterruptedException, ParseException {
        logger = extent.startTest("category page");
        try{
        driver.get("https://www.amarujala.com/");
        logger.log(LogStatus.INFO, "Navigated to Amarujala.com");
        Thread.sleep(2000);
        categorypages.cat_0(driver).click();
        categorypages.cat_1(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        utility.getpageStorydates.getpagestorydates(driver,logger);
        System.out.println("1 done");
         }catch(TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
            System.out.println(e);
        }
        
//        try{
//        driver.get("https://www.amarujala.com/");
//        Thread.sleep(2000);
//        categorypages.cat_0(driver).click();
//        categorypages.cat_2(driver).click();
//        waitfunction.WaitForAjax(driver);
//        scrollfunctions.scroll(driver);
//        utility.getpageStorydates.getpagestorydates(driver,logger);
//        System.out.println("2 done");
//         }catch(TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
//            System.out.println(e);
//        }
//        
//        try{
//            
//        driver.get("https://www.amarujala.com/");
//        Thread.sleep(2000);
//        categorypages.cat_0(driver).click();
//        categorypages.cat_3(driver).click();
//        waitfunction.WaitForAjax(driver);
//        scrollfunctions.scroll(driver);
//        utility.getpageStorydates.getpagestorydates(driver,logger);
//        System.out.println("3 done");
//         
//        }catch(TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
//            System.out.println(e);
//        }
//        
//        try{
//            
//        driver.get("https://www.amarujala.com/");
//        Thread.sleep(2000);
//        categorypages.cat_0(driver).click();
//        categorypages.cat_4(driver).click();
//        waitfunction.WaitForAjax(driver);
//        scrollfunctions.scroll(driver);
//        utility.getpageStorydates.getpagestorydates(driver,logger);
//        System.out.println("4 done");
//         }catch(TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
//            System.out.println(e);
//        }
//         
//        try{
//        driver.get("https://www.amarujala.com/");
//        Thread.sleep(2000);
//        categorypages.cat_0(driver).click();
//        categorypages.cat_5(driver).click();
//        waitfunction.WaitForAjax(driver);
//        scrollfunctions.scroll(driver);
//        utility.getpageStorydates.getpagestorydates(driver,logger);
//        System.out.println("5 done");
//         }catch(TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
//            System.out.println(e);
//        }
//        try{
//            
//        driver.get("https://www.amarujala.com/");
//        Thread.sleep(2000);
//        categorypages.cat_0(driver).click();
//        categorypages.cat_6(driver).click();
//        waitfunction.WaitForAjax(driver);
//        scrollfunctions.scroll(driver);
//        utility.getpageStorydates.getpagestorydates(driver,logger);
//        System.out.println("6 done");
//         }catch(TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
//            System.out.println(e);
//        }
//        try{
//        driver.get("https://www.amarujala.com/");
//        Thread.sleep(2000);
//        categorypages.cat_0(driver).click();
//        categorypages.cat_7(driver).click();
//        waitfunction.WaitForAjax(driver);
//        scrollfunctions.scroll(driver);
//        utility.getpageStorydates.getpagestorydates(driver,logger);
//        System.out.println("7 done");
//         }catch(TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
//            System.out.println(e);
//        }
//        try{
//        driver.get("https://www.amarujala.com/");
//        Thread.sleep(2000);
//        categorypages.cat_0(driver).click();
//        categorypages.cat_8(driver).click();
//        waitfunction.WaitForAjax(driver);
//        scrollfunctions.scroll(driver);
//        utility.getpageStorydates.getpagestorydates(driver,logger);
//        System.out.println("8 done");
//         }catch(TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
//            System.out.println(e);
//        }
//        try{
//        driver.get("https://www.amarujala.com/");
//        Thread.sleep(2000);
//        categorypages.cat_0(driver).click();
//        categorypages.cat_9(driver).click();
//        waitfunction.WaitForAjax(driver);
//        scrollfunctions.scroll(driver);
//        utility.getpageStorydates.getpagestorydates(driver,logger);
//        System.out.println("9 done");
//         }catch(TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
//            System.out.println(e);
//        }
//        try{
//        driver.get("https://www.amarujala.com/");
//        Thread.sleep(2000);
//        categorypages.cat_0(driver).click();
//        categorypages.cat_10(driver).click();
//        waitfunction.WaitForAjax(driver);
//        scrollfunctions.scroll(driver);
//        utility.getpageStorydates.getpagestorydates(driver,logger);
//        System.out.println("10 done");
//        }catch(TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
//            System.out.println(e);
//        }
//        try{
//        driver.get("https://www.amarujala.com/");
//        Thread.sleep(2000);
//        categorypages.cat_0(driver).click();
//        categorypages.cat_11(driver).click();
//        waitfunction.WaitForAjax(driver);
//        scrollfunctions.scroll(driver);
//        utility.getpageStorydates.getpagestorydates(driver,logger);
//        System.out.println("11 done");
//        }catch(TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
//            System.out.println(e);
//        }
//        try{
//        driver.get("https://www.amarujala.com/");
//        Thread.sleep(2000);
//        categorypages.cat_0(driver).click();
//        categorypages.cat_12(driver).click();
//        waitfunction.WaitForAjax(driver);
//        scrollfunctions.scroll(driver);
//        utility.getpageStorydates.getpagestorydates(driver,logger);
//        System.out.println("12 done");
//        }catch(TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
//            System.out.println(e);
//        }
//        try{
//        driver.get("https://www.amarujala.com/");
//        Thread.sleep(2000);
//        categorypages.cat_0(driver).click();
//        categorypages.cat_13(driver).click();
//        waitfunction.WaitForAjax(driver);
//        scrollfunctions.scroll(driver);
//        utility.getpageStorydates.getpagestorydates(driver,logger);
//        System.out.println("13 done");
//        }catch(TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
//            System.out.println(e);
//        }
//        try{
//        driver.get("https://www.amarujala.com/");
//        Thread.sleep(2000);
//        categorypages.cat_0(driver).click();
//        categorypages.cat_14(driver).click();
//        waitfunction.WaitForAjax(driver);
//        scrollfunctions.scroll(driver);
//        utility.getpageStorydates.getpagestorydates(driver,logger);
//        System.out.println("14 done");
//        }catch(TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
//            System.out.println(e);
//        }
//        try{
//        driver.get("https://www.amarujala.com/");
//        Thread.sleep(2000);
//        categorypages.cat_0(driver).click();
//        categorypages.cat_15(driver).click();
//        waitfunction.WaitForAjax(driver);
//        utility.getpageStorydates.getpagestorydates(driver,logger);
//        scrollfunctions.scroll(driver);
//        }catch(TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
//            System.out.println(e);
//        }
//        try{
//        driver.get("https://www.amarujala.com/");
//        Thread.sleep(2000);
//        categorypages.cat_0(driver).click();
//        categorypages.cat_16(driver).click();
//        waitfunction.WaitForAjax(driver);
//        utility.getpageStorydates.getpagestorydates(driver,logger);
//        scrollfunctions.scroll(driver);
//        }catch(TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
//            System.out.println(e);
//        }
//        try{
//        driver.get("https://www.amarujala.com/");
//        Thread.sleep(2000);
//        categorypages.cat_0(driver).click();
//        categorypages.cat_17(driver).click();
//        waitfunction.WaitForAjax(driver);
//        utility.getpageStorydates.getpagestorydates(driver,logger);
//        scrollfunctions.scroll(driver);
//        }catch(TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
//            System.out.println(e);
//        }
//        try{
//        driver.get("https://www.amarujala.com/");
//        Thread.sleep(2000);
//        categorypages.cat_0(driver).click();
//        categorypages.cat_18(driver).click();
//        waitfunction.WaitForAjax(driver);
//        utility.getpageStorydates.getpagestorydates(driver,logger);
//        scrollfunctions.scroll(driver);
//        }catch(TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
//            System.out.println(e);
//        }
//        try{
//        driver.get("https://www.amarujala.com/");
//        Thread.sleep(2000);
//        categorypages.cat_0(driver).click();
//        categorypages.cat_19(driver).click();
//        waitfunction.WaitForAjax(driver);
//        utility.getpageStorydates.getpagestorydates(driver,logger);
//        scrollfunctions.scroll(driver);
//        }catch(TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
//            System.out.println(e);
//        }
//        try{
//        driver.get("https://www.amarujala.com/");
//        Thread.sleep(2000);
//        categorypages.cat_0(driver).click();
//        categorypages.cat_20(driver).click();
//        waitfunction.WaitForAjax(driver);
//        utility.getpageStorydates.getpagestorydates(driver,logger);
//        scrollfunctions.scroll(driver);
//        }catch(TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
//            System.out.println(e);
//        }
//        try{
//        driver.get("https://www.amarujala.com/");
//        Thread.sleep(2000);
//        categorypages.cat_0(driver).click();
//        categorypages.cat_21(driver).click();
//        waitfunction.WaitForAjax(driver);
//        utility.getpageStorydates.getpagestorydates(driver,logger);
//        scrollfunctions.scroll(driver);
//        }catch(TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
//            System.out.println(e);
//        }
//        try{
//        driver.get("https://www.amarujala.com/");
//        Thread.sleep(2000);
//        categorypages.cat_0(driver).click();
//        categorypages.cat_22(driver).click();
//        waitfunction.WaitForAjax(driver);
//        utility.getpageStorydates.getpagestorydates(driver,logger);
//        scrollfunctions.scroll(driver);
//        }catch(TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
//            System.out.println(e);
//        }
//        try{
//        driver.get("https://www.amarujala.com/");
//        Thread.sleep(2000);
//        categorypages.cat_0(driver).click();
//        categorypages.cat_23(driver).click();
//        waitfunction.WaitForAjax(driver);
//        utility.getpageStorydates.getpagestorydates(driver,logger);
//        scrollfunctions.scroll(driver);
//        }catch(TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
//            System.out.println(e);
//        }
//        try{
//        driver.get("https://www.amarujala.com/");
//        Thread.sleep(2000);
//        categorypages.cat_0(driver).click();
//        categorypages.cat_24(driver).click();
//        waitfunction.WaitForAjax(driver);
//        utility.getpageStorydates.getpagestorydates(driver,logger);
//        scrollfunctions.scroll(driver);
//        }catch(TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
//            System.out.println(e);
//        }
//        try{
//        driver.get("https://www.amarujala.com/");
//        Thread.sleep(2000);
//        categorypages.cat_0(driver).click();
//        categorypages.cat_25(driver).click();
//        waitfunction.WaitForAjax(driver);
//        utility.getpageStorydates.getpagestorydates(driver,logger);
//        scrollfunctions.scroll(driver);
//        }catch(TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
//            System.out.println(e);
//        }
//        try{
//        driver.get("https://www.amarujala.com/");
//        Thread.sleep(2000);
//        categorypages.cat_0(driver).click();
//        categorypages.cat_26(driver).click();
//        waitfunction.WaitForAjax(driver);
//        utility.getpageStorydates.getpagestorydates(driver,logger);
//        scrollfunctions.scroll(driver);
//        }catch(TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
//            System.out.println(e);
//        }
//        try{
//        driver.get("https://www.amarujala.com/");
//        Thread.sleep(2000);
//        categorypages.cat_0(driver).click();
//        categorypages.cat_27(driver).click();
//        waitfunction.WaitForAjax(driver);
//        utility.getpageStorydates.getpagestorydates(driver,logger);
//        scrollfunctions.scroll(driver);
//        }catch(TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
//            System.out.println(e);
//        }
//        try{
//        driver.get("https://www.amarujala.com/");
//        Thread.sleep(2000);
//        categorypages.cat_0(driver).click();
//        categorypages.cat_28(driver).click();
//        waitfunction.WaitForAjax(driver);
//        utility.getpageStorydates.getpagestorydates(driver,logger);
//        scrollfunctions.scroll(driver);
//        }catch(TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
//            System.out.println(e);
//        }
//        
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
