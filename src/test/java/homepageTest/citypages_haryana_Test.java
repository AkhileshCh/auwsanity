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
import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import setup.drivers;
import utility.scrollfunctions;
import utility.waitfunction;

/**
 *
 * @author akhilesh
 */
public class citypages_haryana_Test {
    
    private WebDriver driver;
    ExtentReports extent;
    ExtentTest logger;
    
    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        driver = drivers.Chromesetup();
        driver.get("https://amarujala.com");
    }
    
    public void mustfunction(WebDriver driver) throws InterruptedException, ParseException, IOException{
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        utility.getpageStorydates.getpagestorydates(driver,logger);
        //utility.GeturlStatus.getStatus(driver);
    }
    
    //Get haryana city and pages
    @Test
    public void cityHariyana() throws InterruptedException, ParseException, IOException {
        
        homepage.h_main_city(driver).click(); 
        
    //    cityandstate.city_hariyana(driver).click();
//        Map<Integer,WebElement> citymaplinks = new HashMap();
//       // citymaplinks.put(1,cityandstate.city_hariyana(driver));
//        citymaplinks.put(2,cityandstate.city_hariyana_1(driver));
//        citymaplinks.put(3,cityandstate.city_hariyana_2(driver));
//        citymaplinks.put(4,cityandstate.city_hariyana_3(driver));
//        citymaplinks.put(5,cityandstate.city_hariyana_4(driver));
//        citymaplinks.put(6,cityandstate.city_hariyana_5(driver));
//        citymaplinks.put(7,cityandstate.city_hariyana_6(driver));
//        citymaplinks.put(8,cityandstate.city_hariyana_7(driver));
//        citymaplinks.put(9,cityandstate.city_hariyana_8(driver));
//        citymaplinks.put(10,cityandstate.city_hariyana_9(driver));
//        citymaplinks.put(11,cityandstate.city_hariyana_10(driver));
//        citymaplinks.put(12,cityandstate.city_hariyana_11(driver));
//        citymaplinks.put(13,cityandstate.city_hariyana_12(driver));
//        citymaplinks.put(14,cityandstate.city_hariyana_13(driver));
//        citymaplinks.put(15,cityandstate.city_hariyana_14(driver));
//        citymaplinks.put(16,cityandstate.city_hariyana_15(driver));
//        citymaplinks.put(17,cityandstate.city_hariyana_16(driver));
//        citymaplinks.put(18,cityandstate.city_hariyana_17(driver));
//                
//                for(Entry<Integer,WebElement> entry : citymaplinks.entrySet()){
//                    
//                     
//                     entry.getValue().click();
//                     mustfunction(driver);
//                     driver.navigate().refresh();
////                     homepage.h_main_city(driver).click();
////                     cityandstate.city_hariyana(driver).click();
//                     Thread.sleep(5000);
//                    // System.out.println(entry.getValue().getText());
//                }



           
      
        cityandstate.city_hariyana(driver).click();
        mustfunction(driver);
        System.out.println(cityandstate.city_hariyana(driver).getText());
        
        
        cityandstate.city_hariyana_1(driver).click();
        mustfunction(driver);
        System.out.println(cityandstate.city_hariyana_1(driver).getText());

        cityandstate.city_hariyana_2(driver).click();
        mustfunction(driver);
        System.out.println(cityandstate.city_hariyana_2(driver).getText());

        cityandstate.city_hariyana_3(driver).click();
        mustfunction(driver);
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
    
}
