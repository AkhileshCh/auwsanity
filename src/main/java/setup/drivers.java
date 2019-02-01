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
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.RemoteWebDriver;
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
    
    public static WebDriver remotebrowser() throws MalformedURLException {
         String nodeURL;
         nodeURL = "http://10.59.98.107:4444/wd/hub";
         DesiredCapabilities capability = DesiredCapabilities.chrome();
         capability.setBrowserName("chrome");
         capability.setPlatform(Platform.WIN10);
         driver = new RemoteWebDriver(new URL(nodeURL), capability);
         return driver; 
     }
    
    
}
