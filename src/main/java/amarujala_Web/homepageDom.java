/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amarujala_Web;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import setup.drivers;

/**
 *
 * @author akhilesh
 */
public class homepageDom {
    
    private static WebDriver driver;
    ExtentReports extent;
    ExtentTest logger;
    
    @BeforeClass(alwaysRun = true)
    public static void setUp() throws Exception {
        driver = drivers.Chromesetup();
        driver.get("https://amarujala.com");
    }
    
    public static void getHeaderMenu(WebDriver driver)
    {
        List<WebElement> obj=driver.findElements(By.xpath("/html/body/div[4]/div"));
        for(WebElement value:obj){
           
        }
    }
    
    public static void main(String[] args) throws Exception {
        setUp();
        getHeaderMenu(driver);
    }
}
