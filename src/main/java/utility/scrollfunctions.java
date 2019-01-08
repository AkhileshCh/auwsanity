/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/**
 *
 * @author akhilesh
 */
public class scrollfunctions {
    
    
        public static WebDriver scroll(WebDriver driver) throws InterruptedException{
        Thread.sleep(5000);
        JavascriptExecutor js = (JavascriptExecutor) driver;      
        int count=0;
        while (count!=10){
              js.executeScript("window.scrollBy(0,700)");
              Thread.sleep(5000);
              count++;
          }
//        js.executeScript("window.scrollBy(0,-200)", "");
         WebElement element = driver.findElement(By.tagName("header"));
         js.executeScript("arguments[0].scrollIntoView();", element); 
        
        //js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        return driver;
    }
        
}
