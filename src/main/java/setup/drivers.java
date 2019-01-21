/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setup;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
/**
 *
 * @author akhilesh
 */
public class drivers {
    
    public  static WebDriver driver;
    
    public static WebDriver Chromesetup(){
        
    System.setProperty("webdriver.chrome.driver", "/home/akhilesh/Documents/lib/chromedriver");
    final ChromeOptions chromeOptions = new ChromeOptions(); 
    //chromeOptions.addArguments("--headless");
    chromeOptions.addArguments("window-size=1200x600");
//    final DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
//    desiredCapabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
//    driver = new ChromeDriver();
    driver = new ChromeDriver(chromeOptions);
//    driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//    driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
    return driver;   
    }
    
    
}
