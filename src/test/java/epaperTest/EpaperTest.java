/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epaperTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import amarujala_epaper.*;
import com.relevantcodes.extentreports.LogStatus;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import setup.drivers;


/**
 *
 * @author akhilesh
 */
public class EpaperTest {
    
    private WebDriver driver;
    ExtentReports extent;
    ExtentTest logger;
    
    public EpaperTest() {
    }
    
    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        driver = drivers.Chromesetup();
    }

    @BeforeClass
    public void startReport() {
        
        extent = new ExtentReports(System.getProperty("user.dir") + "/test-output/amarujalaEpaper.html", true);
        extent
                .addSystemInfo("Host Name", "Amarujala Epaper Sanity Report")
                .addSystemInfo("Environment", "Automation Testing")
                .addSystemInfo("User Name", "Akhilesh");
     
        extent.loadConfig(new File(System.getProperty("user.dir") + "\\extent-config.xml"));
    }

    @Test(priority=2)
    public void checkPage200(){
       logger = extent.startTest("epaperPageAvailable"); 
       driver.get("https://epaper.amarujala.com/");
       String citycodes[]={ "ac",
                            "ad",
                            "ct",
                            "dt",
                            "ca",
                            "al",
                            "am",
                            "an",
                            "au",
                            "az",
                            "bn",
                            "bg",
                            "bh",
                            "bl",
                            "bd",
                            "bb",
                            "cb",
                            "db",
                            "bs",
                            "bo",
                            "bw",
                            "bj",
                            "bp",
                            "bu",
                            "ch",
                            "cd",
                            "cc",
                            "ci",
                            "dc",
                            "dl",
                            "do",
                            "et",
                            "ew",
                            "fz",
                            "fb",
                            "fd",
                            "ft",
                            "fp",
                            "fr",
                            "gp",
                            "gh",
                            "ga",
                            "gz",
                            "gb",
                            "gc",
                            "gd",
                            "gn",
                            "gr",
                            "ha",
                            "hm",
                            "hp",
                            "ho",
                            "hd",
                            "ht",
                            "hs",
                            "jl",
                            "ja",
                            "cj",
                            "dj",
                            "jj",
                            "jy",
                            "jd",
                            "jn",
                            "jr",
                            "jp",
                            "kt",
                            "kg",
                            "kj",
                            "kc",
                            "kd",
                            "gm",
                            "kn",
                            "ku",
                            "kh",
                            "lk",
                            "kw",
                            "kl",
                            "kk",
                            "ks",
                            "lt",
                            "lc",
                            "mp",
                            "ma",
                            "mt",
                            "mu",
                            "cm",
                            "dm",
                            "mh",
                            "mz",
                            "ml",
                            "mc",
                            "dh",
                            "mf",
                            "nn",
                            "nd",
                            "pk",
                            "pn",
                            "pb",
                            "pt",
                            "pg",
                            "na",
                            "rb",
                            "rj",
                            "rm",
                            "rp",
                            "rw",
                            "rk",
                            "rt",
                            "rr",
                            "sc",
                            "st",
                            "sa",
                            "sk",
                            "sp",
                            "md",
                            "sh",
                            "sn",
                            "sm",
                            "sr",
                            "si",
                            "sl",
                            "sb",
                            "so",
                            "su",
                            "th",
                            "um",
                            "us",
                            "un",
                            "uo",
                            "vc",
                            "vk",
                            "ym"};
       ArrayList elem = epaper.get_cityname_epaper(driver);
       for(int j=0 ;citycodes.length>=j;j++ ){
       for(int i=0 ;elem.size()>=i;i++){
           int year = Calendar.getInstance().get(Calendar.YEAR);
           int month = Calendar.getInstance().get(Calendar.MONTH);
           int day = Calendar.getInstance().get(Calendar.DATE);
           ++month;
           String url = " https://epaperwmimg.amarujala.com/"+year+"/0"+month+"/"+day+"/"+citycodes[i]+"/"+elem.get(i)+"/hdimage.jpg";
           System.out.println(url);
           logger.log(LogStatus.INFO, url);
           int Statuscode = epaper.httpResponseCodeViaGet(url);
           if(Statuscode == 200){
               System.out.println("Tested And Working Good");
               logger.log(LogStatus.PASS, "Tested And Working Good");
            }else{
             String stringtoprint = (i+":city" + elem.get(i) +"****"+ Statuscode); 
             System.out.println(i+":city" + elem.get(i) +"****"+ Statuscode); 
             logger.log(LogStatus.FAIL, stringtoprint);
           }
           
           
       }
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


    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
