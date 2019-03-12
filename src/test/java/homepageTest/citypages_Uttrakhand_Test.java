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
public class citypages_Uttrakhand_Test {
    
    private WebDriver driver;
    ExtentReports extent;
    ExtentTest logger;
    
    
    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        driver = drivers.Chromesetup();
    }
    
    @BeforeTest
    public void startReport() {
        extent = new ExtentReports(System.getProperty("user.dir") + "/test-output/amarujalaWeb_UK.html", true);
        extent
                .addSystemInfo("Host Name", "Amarujala Sanity Report")
                .addSystemInfo("Environment", "Automation Testing")
                .addSystemInfo("User Name", "Akhilesh");
        extent.loadConfig(new File(System.getProperty("user.dir") + "\\extent-config.xml"));
        
    }
    
    @Test
    public void stateUttrakhand(WebDriver driver) throws InterruptedException, Exception {

        try {

            logger = extent.startTest("stateUttrakhand");
            driver.get("https://www.amarujala.com/");
            logger.log(LogStatus.INFO, "Navigated to Amarujala.com");
            Thread.sleep(2000);
            homepage.h_main_city(driver).click();
            Assert.assertTrue(driver.getTitle().contains("City And States News In Hindi, Latest शहर और राज्य समाचार Headlines – Amar Ujala"));
            logger.log(LogStatus.PASS, "City Page Title verified");
            logger.log(LogStatus.INFO, "Navigated to Citypage");
            cityandstate.city_uttrakhand(driver).click();
            Assert.assertTrue(driver.getTitle().contains("Uttarakhand News: Latest Uttarakhand News In Hindi, उत्तराखंड समाचार - Amar Ujala"));
            logger.log(LogStatus.PASS,"Navigated to Uttrakhand Page ");
            cityandstate.city_uttrakhand_1(driver).click();
            Assert.assertTrue(driver.getTitle().contains("Rishikesh News In Hindi, Latest ऋषिकेश न्यूज़ Headlines - Amarujala.com"));
            logger.log(LogStatus.PASS, "Rishikesh Page Title verified");
            if ("ऋषिकेश".equals(cityandstate.city_uttrakhand_1(driver).getText())) {
                logger.log(LogStatus.PASS, "page ऋषिकेश is good");
                takescreenshot.takeSnapShot(driver, "/home/akhilesh/Documents/sel_Scr/test28.png");
                logger.log(
                        LogStatus.INFO,
                        "Snapshot : "
                        + logger.addScreenCapture("/home/akhilesh/Documents/sel_Scr/test28.png"));
            }
            waitfunction.WaitForAjax(driver);
            scrollfunctions.scroll(driver);
            System.out.println("L28");
        } catch (TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
            System.out.println("Exception for L28" + e);
        }

        try {
            cityandstate.city_uttrakhand_2(driver).click();
            Assert.assertTrue(driver.getTitle().contains("Almora News In Hindi, Latest अल्मोडा न्यूज़ Headlines - Amarujala.com"));
            logger.log(LogStatus.PASS, "Almora Page Title verified");
            if ("अल्मोडा".equals(cityandstate.city_uttrakhand_2(driver).getText())) {
                logger.log(LogStatus.PASS, "page अल्मोडा is good");
                takescreenshot.takeSnapShot(driver, "/home/akhilesh/Documents/sel_Scr/test29.png");
                logger.log(
                        LogStatus.INFO,
                        "Snapshot : "
                        + logger.addScreenCapture("/home/akhilesh/Documents/sel_Scr/test29.png"));
            }
            waitfunction.WaitForAjax(driver);
            scrollfunctions.scroll(driver);
            System.out.println("L29");
        } catch (TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
            System.out.println("Exception for L29" + e);
        }

        try {
            cityandstate.city_uttrakhand_3(driver).click();
            Assert.assertTrue(driver.getTitle().contains("Uttarkashi News In Hindi, Latest उत्तरकाशी न्यूज़ Headlines - Amarujala.com"));
            logger.log(LogStatus.PASS, "Uttarkashi Page Title verified");
            if ("उत्तरकाशी".equals(cityandstate.city_uttrakhand_3(driver).getText())) {
                logger.log(LogStatus.PASS, "page उत्तरकाशी is good");
                takescreenshot.takeSnapShot(driver, "/home/akhilesh/Documents/sel_Scr/test30.png");
                logger.log(
                        LogStatus.INFO,
                        "Snapshot : "
                        + logger.addScreenCapture("/home/akhilesh/Documents/sel_Scr/test30.png"));
            }
            waitfunction.WaitForAjax(driver);
            scrollfunctions.scroll(driver);
            System.out.println("L30");
        } catch (TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
            System.out.println("Exception for L30" + e);
        }

        try {
            cityandstate.city_uttrakhand_4(driver).click();
            Assert.assertTrue(driver.getTitle().contains("Udham-singh-nagar News In Hindi, Latest Udham-singh-nagar Headlines - Amarujala.com"));
            logger.log(LogStatus.PASS, "Udham-singh-nagar Page Title verified");
            if ("ऊधम सिंह नगर".equals(cityandstate.city_uttrakhand_4(driver).getText())) {
                logger.log(LogStatus.PASS, "page Udham-singh-nagar is good");
                takescreenshot.takeSnapShot(driver, "/home/akhilesh/Documents/sel_Scr/test31.png");
                logger.log(
                        LogStatus.INFO,
                        "Snapshot : "
                        + logger.addScreenCapture("/home/akhilesh/Documents/sel_Scr/test31.png"));
            }
            waitfunction.WaitForAjax(driver);
            scrollfunctions.scroll(driver);
            System.out.println("L31");
        } catch (TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
            System.out.println("Exception for L31" + e);
        }

        try {
            cityandstate.city_uttrakhand_5(driver).click();
            Assert.assertTrue(driver.getTitle().contains("Kotdwar News In Hindi, Latest कोटद्वार न्यूज़ Headlines - Amarujala.com"));
            logger.log(LogStatus.PASS, "Kotdwar Page Title verified");
            if ("कोटद्वार".equals(cityandstate.city_uttrakhand_5(driver).getText())) {
                logger.log(LogStatus.PASS, "page Kotdwar is good");
                takescreenshot.takeSnapShot(driver, "/home/akhilesh/Documents/sel_Scr/test32.png");
                logger.log(
                        LogStatus.INFO,
                        "Snapshot : "
                        + logger.addScreenCapture("/home/akhilesh/Documents/sel_Scr/test32.png"));
            }
            waitfunction.WaitForAjax(driver);
            scrollfunctions.scroll(driver);
            System.out.println("L32");
        } catch (TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
            System.out.println("Exception for L32" + e);
        }

        try {
            cityandstate.city_uttrakhand_6(driver).click();
            Assert.assertTrue(driver.getTitle().contains("Chamoli News In Hindi, Latest चमोली न्यूज़ Headlines - Amarujala.com"));
            logger.log(LogStatus.PASS, "Chamoli Page Title verified");
            if ("चमोली".equals(cityandstate.city_uttrakhand_6(driver).getText())) {
                logger.log(LogStatus.PASS, "page Chamoli is good");
                takescreenshot.takeSnapShot(driver, "/home/akhilesh/Documents/sel_Scr/test33.png");
                logger.log(
                        LogStatus.INFO,
                        "Snapshot : "
                        + logger.addScreenCapture("/home/akhilesh/Documents/sel_Scr/test33.png"));
            }
            waitfunction.WaitForAjax(driver);
            scrollfunctions.scroll(driver);
            System.out.println("L33");
        } catch (TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
            System.out.println("Exception for L33" + e);
        }

        try {
            cityandstate.city_uttrakhand_7(driver).click();
            Assert.assertTrue(driver.getTitle().contains("Champawat News In Hindi, Latest Champawat Headlines - Amarujala.com"));
            logger.log(LogStatus.PASS, "Champawat Page Title verified");
            if ("चम्पावत".equals(cityandstate.city_uttrakhand_7(driver).getText())) {
                logger.log(LogStatus.PASS, "page Champawat is good");
                takescreenshot.takeSnapShot(driver, "/home/akhilesh/Documents/sel_Scr/test34.png");
                logger.log(
                        LogStatus.INFO,
                        "Snapshot : "
                        + logger.addScreenCapture("/home/akhilesh/Documents/sel_Scr/test34.png"));
            }
            waitfunction.WaitForAjax(driver);
            scrollfunctions.scroll(driver);
            System.out.println("L34");
        } catch (TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
            System.out.println("Exception for L34" + e);
        }

        try {
            cityandstate.city_uttrakhand_8(driver).click();
            Assert.assertTrue(driver.getTitle().contains("Tehri News In Hindi, Latest Tehri Headlines - Amarujala.com"));
            logger.log(LogStatus.PASS, "Tehri Page Title verified");
            if ("टिहरी".equals(cityandstate.city_uttrakhand_7(driver).getText())) {
                logger.log(LogStatus.PASS, "page Tehri is good");
                takescreenshot.takeSnapShot(driver, "/home/akhilesh/Documents/sel_Scr/test35.png");
                logger.log(
                        LogStatus.INFO,
                        "Snapshot : "
                        + logger.addScreenCapture("/home/akhilesh/Documents/sel_Scr/test35.png"));
            }
            waitfunction.WaitForAjax(driver);
            scrollfunctions.scroll(driver);
            System.out.println("L35");
        } catch (TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
            System.out.println("Exception for L35" + e);
        }

        try {
            cityandstate.city_uttrakhand_9(driver).click();
            Assert.assertTrue(driver.getTitle().contains("Dehradun News In Hindi, Latest देहरादून न्यूज़ Headlines - Amarujala.com"));
            logger.log(LogStatus.PASS, "Dehradun Page Title verified");
            if ("देहरादून".equals(cityandstate.city_uttrakhand_9(driver).getText())) {
                logger.log(LogStatus.PASS, "page Dehradun is good");
                takescreenshot.takeSnapShot(driver, "/home/akhilesh/Documents/sel_Scr/test36.png");
                logger.log(
                        LogStatus.INFO,
                        "Snapshot : "
                        + logger.addScreenCapture("/home/akhilesh/Documents/sel_Scr/test36.png"));
            }
            waitfunction.WaitForAjax(driver);
            scrollfunctions.scroll(driver);
            System.out.println("L36");
        } catch (TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
            System.out.println("Exception for L36" + e);
        }
        
        try {
            cityandstate.city_uttrakhand_10(driver).click();
            Assert.assertTrue(driver.getTitle().contains("Nainital News In Hindi, Latest नैनीताल न्यूज़ Headlines - Amarujala.com"));
            logger.log(LogStatus.PASS, "Nainital Page Title verified");
            if ("नैनीताल".equals(cityandstate.city_uttrakhand_10(driver).getText())) {
                logger.log(LogStatus.PASS, "page Nainital is good");
                takescreenshot.takeSnapShot(driver, "/home/akhilesh/Documents/sel_Scr/test37.png");
                logger.log(
                        LogStatus.INFO,
                        "Snapshot : "
                        + logger.addScreenCapture("/home/akhilesh/Documents/sel_Scr/test37.png"));
            }
            waitfunction.WaitForAjax(driver);
            scrollfunctions.scroll(driver);
            System.out.println("L37");
        } catch (TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
            System.out.println("Exception for L37" + e);
        }
        try {
            cityandstate.city_uttrakhand_11(driver).click();
            Assert.assertTrue(driver.getTitle().contains("Pithoragarh News In Hindi, Latest Pithoragarh Headlines - Amarujala.com"));
            logger.log(LogStatus.PASS, "Pithoragarh Page Title verified");
            if ("पिथौरागढ़".equals(cityandstate.city_uttrakhand_11(driver).getText())) {
                logger.log(LogStatus.PASS, "page Pithoragarh is good");
                takescreenshot.takeSnapShot(driver, "/home/akhilesh/Documents/sel_Scr/test38.png");
                logger.log(
                        LogStatus.INFO,
                        "Snapshot : "
                        + logger.addScreenCapture("/home/akhilesh/Documents/sel_Scr/test38.png"));
            }
            waitfunction.WaitForAjax(driver);
            scrollfunctions.scroll(driver);
            System.out.println("L38");
        } catch (TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
            System.out.println("Exception for L38" + e);
        }
        try {
            cityandstate.city_uttrakhand_12(driver).click();
            Assert.assertTrue(driver.getTitle().contains("Breaking And Latest Pauri News In Hindi - Amarujala.com"));
            logger.log(LogStatus.PASS, "Pauri Page Title verified");
            if ("पौड़ी".equals(cityandstate.city_uttrakhand_12(driver).getText())) {
                logger.log(LogStatus.PASS, "page Pauri is good");
                takescreenshot.takeSnapShot(driver, "/home/akhilesh/Documents/sel_Scr/test39.png");
                logger.log(
                        LogStatus.INFO,
                        "Snapshot : "
                        + logger.addScreenCapture("/home/akhilesh/Documents/sel_Scr/test39.png"));
            }
            waitfunction.WaitForAjax(driver);
            scrollfunctions.scroll(driver);
            System.out.println("L39");
        } catch (TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
            System.out.println("Exception for L39" + e);
        }
        try {
            cityandstate.city_uttrakhand_13(driver).click();
            Assert.assertTrue(driver.getTitle().contains("Bageshwar News In Hindi, Latest Bageshwar Headlines - Amarujala.com"));
            logger.log(LogStatus.PASS, "Pauri Page Title verified");
            if ("बागेश्वर".equals(cityandstate.city_uttrakhand_13(driver).getText())) {
                logger.log(LogStatus.PASS, "page Bageshwar is good");
                takescreenshot.takeSnapShot(driver, "/home/akhilesh/Documents/sel_Scr/test40.png");
                logger.log(
                        LogStatus.INFO,
                        "Snapshot : "
                        + logger.addScreenCapture("/home/akhilesh/Documents/sel_Scr/test40.png"));
            }
            waitfunction.WaitForAjax(driver);
            scrollfunctions.scroll(driver);
            System.out.println("L40");
        } catch (TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
            System.out.println("Exception for L40" + e);
        }
        try {
            cityandstate.city_uttrakhand_14(driver).click();
            Assert.assertTrue(driver.getTitle().contains("Roorkee News In Hindi, Latest रुड़की न्यूज़ Headlines - Amarujala.com"));
            logger.log(LogStatus.PASS, "Roorkee Page Title verified");
            if ("रुड़की".equals(cityandstate.city_uttrakhand_13(driver).getText())) {
                logger.log(LogStatus.PASS, "page Roorkee is good");
                takescreenshot.takeSnapShot(driver, "/home/akhilesh/Documents/sel_Scr/test41.png");
                logger.log(
                        LogStatus.INFO,
                        "Snapshot : "
                        + logger.addScreenCapture("/home/akhilesh/Documents/sel_Scr/test41.png"));
            }
            waitfunction.WaitForAjax(driver);
            scrollfunctions.scroll(driver);
            System.out.println("L41");
        } catch (TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
            System.out.println("Exception for L41" + e);
        }
//        cityandstate.city_uttrakhand_15(driver).click();
//        waitfunction.WaitForAjax(driver);
//        scrollfunctions.scroll(driver);
//        System.out.println("L42");
//
//        cityandstate.city_uttrakhand_16(driver).click();
//        waitfunction.WaitForAjax(driver);
//        scrollfunctions.scroll(driver);
//        System.out.println("L43");
        try {
            cityandstate.city_uttrakhand(driver).click();
            waitfunction.WaitForAjax(driver);
            scrollfunctions.scroll(driver);
            System.out.println("L44");
        } catch (TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
            System.out.println("Exception for L44" + e);

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
