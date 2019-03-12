/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homepageTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import amarujala_Web.*;
import utility.*;
import setup.*;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import java.io.File;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.remote.ScreenshotException;
import org.openqa.selenium.ElementNotInteractableException;

//import org.apache.commons.io.FileUtils;

/**
 *
 * @author akhilesh
 */
public class HomepageTest {

    private WebDriver driver;
    ExtentReports extent;
    ExtentTest logger;

    public HomepageTest() {
    }

    @BeforeTest
    public void startReport() {
        //ExtentReports(String filePath,Boolean replaceExisting) 
        //filepath - path of the file, in .htm or .html format - path where your report needs to generate. 
        //replaceExisting - Setting to overwrite (TRUE) the existing file or append to it
        //True (default): the file will be replaced with brand new markup, and all existing data will be lost. Use this option to create a brand new report
        //False: existing data will remain, new tests will be appended to the existing report. If the the supplied path does not exist, a new file will be created.
        extent = new ExtentReports(System.getProperty("user.dir") + "/test-output/amarujalaWeb.html", true);
        //extent.addSystemInfo("Environment","Environment Name")
        extent
                .addSystemInfo("Host Name", "Amarujala Sanity Report")
                .addSystemInfo("Environment", "Automation Testing")
                .addSystemInfo("User Name", "Akhilesh");
        //loading the external xml file (i.e., extent-config.xml) which was placed under the base directory
        //You could find the xml file below. Create xml file in your project and copy past the code mentioned below
        extent.loadConfig(new File(System.getProperty("user.dir") + "\\extent-config.xml"));
    }

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        driver = drivers.Chromesetup();
        driver.get("https://www.amarujala.com/");
    }

    public void mustfunction(WebDriver driver) throws InterruptedException{
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
    }
    
    @Test
    public void hompepageTest() throws Exception {
        try{
        logger = extent.startTest("Homepage Test");
        driver.get("https://www.amarujala.com/india-news");
        mustfunction(driver);
        utility.getpageStorydates.getpagestorydates(driver,logger);
        utility.GeturlStatus.getStatus(driver);
        mustfunction(driver);
        homepage.h_main_Country(driver).click();
        mustfunction(driver);
        homepage.h_main_astro(driver).click();
        mustfunction(driver);
        homepage.h_sub_astro_1(driver).click();
        mustfunction(driver);
        homepage.h_sub_astro_2(driver).click();
        mustfunction(driver);
        homepage.h_sub_astro_3(driver).click();
        mustfunction(driver);
        homepage.h_sub_astro_4(driver).click();
        mustfunction(driver);
        homepage.h_sub_astro_5(driver).click();
        mustfunction(driver);
        homepage.h_main_city(driver).click();
        mustfunction(driver);
        homepage.h_sub_city_1(driver).click();
        mustfunction(driver);
        homepage.h_sub_city_2(driver).click();
        mustfunction(driver);
        homepage.h_sub_city_3(driver).click();
        mustfunction(driver);
        homepage.h_sub_city_4(driver).click();
        mustfunction(driver);
        homepage.h_main_election(driver).click();
        mustfunction(driver);
        homepage.h_main_entertainment(driver).click();
        mustfunction(driver);
        homepage.h_sub_ent1(driver).click();
        mustfunction(driver);
        homepage.h_sub_ent2(driver).click();
        mustfunction(driver);
        homepage.h_sub_ent3(driver).click();
        mustfunction(driver);
        homepage.h_sub_ent4(driver).click();
        mustfunction(driver);
        homepage.h_main_photo(driver).click();
        mustfunction(driver);
        homepage.h_sub_photo1(driver).click();
        mustfunction(driver);
        homepage.h_sub_photo2(driver).click();
        mustfunction(driver);
        homepage.h_sub_photo3(driver).click();
        mustfunction(driver);
        homepage.h_sub_photo4(driver).click();
        mustfunction(driver);
        homepage.h_sub_photo5(driver).click();
        mustfunction(driver);
        homepage.h_sub_photo6(driver).click();
        mustfunction(driver);
        homepage.h_sub_photo7(driver).click();
        mustfunction(driver);
        homepage.h_sub_photo8(driver).click();
        mustfunction(driver);
        homepage.h_main_video(driver).click();
        mustfunction(driver);
        }catch(TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
            System.out.println("Exception for HomapageTest" + e);

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
        // writing everything to document
        //flush() - to write or update test information to your report. 
        extent.flush();
        //Call close() at the very end of your session to clear all resources. 
        //If any of your test ended abruptly causing any side-affects (not all logs sent to ExtentReports, information missing), this method will ensure that the test is still appended to the report with a warning message.
        //You should call close() only once, at the very end (in @AfterSuite for example) as it closes the underlying stream. 
        //Once this method is called, calling any Extent method will throw an error.
        //close() - To close all the operation
        extent.close();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        driver.quit();

    }

}
