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
import java.io.IOException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.remote.ScreenshotException;
import org.openqa.selenium.ElementNotInteractableException;
import org.testng.Assert;

//import org.apache.commons.io.FileUtils;

/**
 *
 * @author akhilesh
 */
public class HomepageNGTest {

    private WebDriver driver;
    ExtentReports extent;
    ExtentTest logger;

    public HomepageNGTest() {
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
    }

    public void mustfunction(WebDriver driver) throws InterruptedException{
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
    }
    
    @Test
    public void hompepageTest() throws Exception {
        try{
        driver.get("https://www.amarujala.com/");
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

    public void categorypageTest() throws InterruptedException {
        driver.get("https://www.amarujala.com/");
        Thread.sleep(2000);
        categorypages.cat_0(driver).click();
        categorypages.cat_1(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println("1 done");

        driver.get("https://www.amarujala.com/");
        Thread.sleep(2000);
        categorypages.cat_0(driver).click();
        categorypages.cat_2(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println("2 done");

        driver.get("https://www.amarujala.com/");
        Thread.sleep(2000);
        categorypages.cat_0(driver).click();
        categorypages.cat_3(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println("3 done");

        driver.get("https://www.amarujala.com/");
        Thread.sleep(2000);
        categorypages.cat_0(driver).click();
        categorypages.cat_4(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println("4 done");

        driver.get("https://www.amarujala.com/");
        Thread.sleep(2000);
        categorypages.cat_0(driver).click();
        categorypages.cat_5(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println("5 done");

        driver.get("https://www.amarujala.com/");
        Thread.sleep(2000);
        categorypages.cat_0(driver).click();
        categorypages.cat_6(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println("6 done");

        driver.get("https://www.amarujala.com/");
        Thread.sleep(2000);
        categorypages.cat_0(driver).click();
        categorypages.cat_7(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println("7 done");

        driver.get("https://www.amarujala.com/");
        Thread.sleep(2000);
        categorypages.cat_0(driver).click();
        categorypages.cat_8(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println("8 done");

        driver.get("https://www.amarujala.com/");
        Thread.sleep(2000);
        categorypages.cat_0(driver).click();
        categorypages.cat_9(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println("9 done");

        driver.get("https://www.amarujala.com/");
        Thread.sleep(2000);
        categorypages.cat_0(driver).click();
        categorypages.cat_10(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println("10 done");

        driver.get("https://www.amarujala.com/");
        Thread.sleep(2000);
        categorypages.cat_0(driver).click();
        categorypages.cat_11(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println("11 done");

        driver.get("https://www.amarujala.com/");
        Thread.sleep(2000);
        categorypages.cat_0(driver).click();
        categorypages.cat_12(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println("12 done");

        driver.get("https://www.amarujala.com/");
        Thread.sleep(2000);
        categorypages.cat_0(driver).click();
        categorypages.cat_13(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println("13 done");

        driver.get("https://www.amarujala.com/");
        Thread.sleep(2000);
        categorypages.cat_0(driver).click();
        categorypages.cat_14(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println("14 done");

        driver.get("https://www.amarujala.com/");
        Thread.sleep(2000);
        categorypages.cat_0(driver).click();
        categorypages.cat_15(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);

        driver.get("https://www.amarujala.com/");
        Thread.sleep(2000);
        categorypages.cat_0(driver).click();
        categorypages.cat_16(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);

        driver.get("https://www.amarujala.com/");
        Thread.sleep(2000);
        categorypages.cat_0(driver).click();
        categorypages.cat_17(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);

        driver.get("https://www.amarujala.com/");
        Thread.sleep(2000);
        categorypages.cat_0(driver).click();
        categorypages.cat_18(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);

        driver.get("https://www.amarujala.com/");
        Thread.sleep(2000);
        categorypages.cat_0(driver).click();
        categorypages.cat_19(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);

        driver.get("https://www.amarujala.com/");
        Thread.sleep(2000);
        categorypages.cat_0(driver).click();
        categorypages.cat_20(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);

        driver.get("https://www.amarujala.com/");
        Thread.sleep(2000);
        categorypages.cat_0(driver).click();
        categorypages.cat_21(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);

        driver.get("https://www.amarujala.com/");
        Thread.sleep(2000);
        categorypages.cat_0(driver).click();
        categorypages.cat_22(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);

        driver.get("https://www.amarujala.com/");
        Thread.sleep(2000);
        categorypages.cat_0(driver).click();
        categorypages.cat_23(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);

        driver.get("https://www.amarujala.com/");
        Thread.sleep(2000);
        categorypages.cat_0(driver).click();
        categorypages.cat_24(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);

        driver.get("https://www.amarujala.com/");
        Thread.sleep(2000);
        categorypages.cat_0(driver).click();
        categorypages.cat_25(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);

        driver.get("https://www.amarujala.com/");
        Thread.sleep(2000);
        categorypages.cat_0(driver).click();
        categorypages.cat_26(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);

        driver.get("https://www.amarujala.com/");
        Thread.sleep(2000);
        categorypages.cat_0(driver).click();
        categorypages.cat_27(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);

        driver.get("https://www.amarujala.com/");
        Thread.sleep(2000);
        categorypages.cat_0(driver).click();
        categorypages.cat_28(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);

    }

    @Test
    // Get up city and state page.
    public void stateUP() throws InterruptedException, IOException, Exception {

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
            System.out.println("L11");
        } catch (TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
            System.out.println("Exception for L11" + e);
        }
    }

    // get Delhi city and pages
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

    //get himachal city and pages
    @Test
    public void stateHP() throws InterruptedException, Exception {

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

    // get uttrakhand city and pages
    @Test
    public void stateUttrakhand() throws InterruptedException, Exception {

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

    //Get haryana city and pages
    public void cityHariyana() throws InterruptedException {

        homepage.h_main_city(driver).click();
        cityandstate.city_hariyana(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_hariyana(driver).getText());

        cityandstate.city_hariyana_1(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_hariyana_1(driver).getText());

        cityandstate.city_hariyana_2(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_hariyana_2(driver).getText());

        cityandstate.city_hariyana_3(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_hariyana_3(driver).getText());

        cityandstate.city_hariyana_4(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_hariyana_4(driver).getText());

        cityandstate.city_hariyana_5(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_hariyana_5(driver).getText());

        cityandstate.city_hariyana_6(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_hariyana_6(driver).getText());

        cityandstate.city_hariyana_7(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_hariyana_7(driver).getText());

        cityandstate.city_hariyana_8(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_hariyana_8(driver).getText());

        cityandstate.city_hariyana_9(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_hariyana_9(driver).getText());

        cityandstate.city_hariyana_10(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_hariyana_10(driver).getText());

        cityandstate.city_hariyana_11(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_hariyana_11(driver).getText());

        cityandstate.city_hariyana_12(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_hariyana_12(driver).getText());

        cityandstate.city_hariyana_13(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_hariyana_13(driver).getText());

        cityandstate.city_hariyana_14(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_hariyana_14(driver).getText());

        cityandstate.city_hariyana_15(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_hariyana_15(driver).getText());

        cityandstate.city_hariyana_16(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_hariyana_16(driver).getText());

        cityandstate.city_hariyana_17(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_hariyana_17(driver).getText());
    }

    // get rajasthan city and pages
    @Test
    public void stateRajasthan() throws InterruptedException, Exception {
        
        
        try{
        logger = extent.startTest("stateRajasthan");
        driver.get("https://www.amarujala.com/");
        logger.log(LogStatus.INFO, "Navigated to Amarujala.com");
        Thread.sleep(2000);
        homepage.h_main_city(driver).click();
        Assert.assertTrue(driver.getTitle().contains("City And States News In Hindi, Latest शहर और राज्य समाचार Headlines – Amar Ujala"));
        logger.log(LogStatus.PASS, "City Page Title verified");
        logger.log(LogStatus.INFO, "Navigated to Citypage");
        String name = cityandstate.city_Rajasthan(driver).getText();
        cityandstate.city_Rajasthan(driver).click();
        Assert.assertTrue(driver.getTitle().contains("Rajasthan News In Hindi, Latest राजस्थान न्यूज़ Headlines - Amarujala.com"));
            logger.log(LogStatus.PASS, "Rajasthan Page Title verified");
            if ("राजस्थान".equals(name)) {
                logger.log(LogStatus.PASS, "page Rajasthan is good");
                takescreenshot.takeSnapShot(driver, "/home/akhilesh/Documents/sel_Scr/test42.png");
                logger.log(
                        LogStatus.INFO,
                        "Snapshot : "
                        + logger.addScreenCapture("/home/akhilesh/Documents/sel_Scr/test42.png"));
            }
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println("rajsthan");
        }catch(TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
            System.out.println("Exception for Rajasthan" + e);
    }
    }

    // Get bihar city 
    @Test
    public void stateBihar() throws InterruptedException, Exception {
        
        try{
        logger = extent.startTest("stateBihar");
        driver.get("https://www.amarujala.com/");
        logger.log(LogStatus.INFO, "Navigated to Amarujala.com");
        Thread.sleep(2000);
        homepage.h_main_city(driver).click();
        Assert.assertTrue(driver.getTitle().contains("City And States News In Hindi, Latest शहर और राज्य समाचार Headlines – Amar Ujala"));
        logger.log(LogStatus.PASS, "City Page Title verified");
        logger.log(LogStatus.INFO, "Navigated to Citypage");
        String name = cityandstate.city_Bihar(driver).getText();
        cityandstate.city_Bihar(driver).click();
        Assert.assertTrue(driver.getTitle().contains("Bihar News: Bihar News In Hindi, Bihar Latest News, बिहार न्यूज़ - Amar Ujala"));
            logger.log(LogStatus.PASS, "Bihar Page Title verified");
            if ("बिहार".equals(name)) {
                logger.log(LogStatus.PASS, "page Bihar is good");
                takescreenshot.takeSnapShot(driver, "/home/akhilesh/Documents/sel_Scr/test43.png");
                logger.log(
                        LogStatus.INFO,
                        "Snapshot : "
                        + logger.addScreenCapture("/home/akhilesh/Documents/sel_Scr/test43.png"));
            }
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println("Bihar");
        }catch(TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
            System.out.println("Exception for Bihar" + e);
         }
    }

    // Get chhattisgarh city
    @Test
    public void stateChhattisgarh() throws InterruptedException, Exception {
         
        try{
        logger = extent.startTest("stateChhattisgarh");
        driver.get("https://www.amarujala.com/");
        logger.log(LogStatus.INFO, "Navigated to Amarujala.com");
        homepage.h_main_city(driver).click();
        Assert.assertTrue(driver.getTitle().contains("City And States News In Hindi, Latest शहर और राज्य समाचार Headlines – Amar Ujala"));
        logger.log(LogStatus.PASS, "City Page Title verified");
        logger.log(LogStatus.INFO, "Navigated to Citypage");
        String name = cityandstate.city_chhattisgarh(driver).getText();
        cityandstate.city_chhattisgarh(driver).click();
        Assert.assertTrue(driver.getTitle().contains("Chattishgarh News In Hindi, Latest छत्तीसगढ़ न्यूज़ Headlines - Amarujala.com"));
            logger.log(LogStatus.PASS, "Chattishgarh Page Title verified");
            if ("छत्तीसगढ़".equals(name)) {
                logger.log(LogStatus.PASS, "page Chattishgarh is good");
                takescreenshot.takeSnapShot(driver, "/home/akhilesh/Documents/sel_Scr/test44.png");
                logger.log(
                        LogStatus.INFO,
                        "Snapshot : "
                        + logger.addScreenCapture("/home/akhilesh/Documents/sel_Scr/test44.png"));
            }
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println("chhattisgarh");
        }catch(TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
            System.out.println("Exception for Chattishgarh" + e);
     }
    }
    // Get jharkhand city
    @Test
    public void stateJharkhand() throws InterruptedException, Exception {
        
        try{
        logger = extent.startTest("stateJharkhand");
        driver.get("https://www.amarujala.com/");
        logger.log(LogStatus.INFO, "Navigated to Amarujala.com");
        homepage.h_main_city(driver).click();
        Assert.assertTrue(driver.getTitle().contains("City And States News In Hindi, Latest शहर और राज्य समाचार Headlines – Amar Ujala"));
        logger.log(LogStatus.PASS, "City Page Title verified");
        logger.log(LogStatus.INFO, "Navigated to Citypage");
        String name = cityandstate.city_jharkhand(driver).getText();
        cityandstate.city_jharkhand(driver).click();
        Assert.assertTrue(driver.getTitle().contains("Jharkhand News In Hindi, Latest झारखण्ड न्यूज़ Headlines - Amarujala.com"));
            logger.log(LogStatus.PASS, "Jharkhand Page Title verified");
            if ("झारखण्ड".equals(name)) {
                logger.log(LogStatus.PASS, "page Jharkhand is good");
                takescreenshot.takeSnapShot(driver, "/home/akhilesh/Documents/sel_Scr/test45.png");
                logger.log(
                        LogStatus.INFO,
                        "Snapshot : "
                        + logger.addScreenCapture("/home/akhilesh/Documents/sel_Scr/test45.png"));
            }
        
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println("jharkhand");
        }catch(TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
            System.out.println("Exception for Jharkhand" + e);
     }
    }
    // Get mp city
    @Test
    public void stateMadhyapradesh() throws InterruptedException, Exception {
        
        try{
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
    }catch(TimeoutException | NoSuchElementException | AssertionError | ScreenshotException|ElementNotInteractableException e) {
            System.out.println("Exception for Jharkhand" + e);
    }
    }

    // Get j&K city and pages
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
