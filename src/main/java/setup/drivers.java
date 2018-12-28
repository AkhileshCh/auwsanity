/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setup;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
/**
 *
 * @author akhilesh
 */
public class drivers {
    
    public  static WebDriver driver;
    
    public static WebDriver Chromesetup(){
        
    System.setProperty("webdriver.chrome.driver", "/home/akhilesh/Documents/lib/chromedriver");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    return driver;   
    }
    
    
}
