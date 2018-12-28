/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
/**
 *
 * @author akhilesh
 */
public class waitfunction {
    
    public static WebDriver WaitForAjax(WebDriver driver) throws InterruptedException{
                                                                                                                                                                                                                                                                                                                                                                                                        
             while (true) // Handle timeout somewhere
                     {
                 JavascriptExecutor js = (JavascriptExecutor) driver; 
                   boolean ajaxIsComplete = (boolean) js.executeScript("return jQuery.active == 0");
                      if (ajaxIsComplete)
                           break;
                    Thread.sleep(100);
                    
                }
             return driver;
            }
    
}
