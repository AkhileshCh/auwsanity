/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amarujala_Firkee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 *
 * @author akhilesh
 */
public class menupages {
    
    private static WebElement element = null;
    
    
    public static WebElement firkee_cat_0(WebDriver driver){
        element = driver.findElement(By.linkText("होम"));
        return element;
    }
     
    public static WebElement firkee_cat_1(WebDriver driver){
        element = driver.findElement(By.linkText("वायरल"));
        return element;
    }
    
    public static WebElement firkee_cat_2(WebDriver driver){
        element = driver.findElement(By.linkText("पंचायत"));
        return element;
    }
    
    public static WebElement firkee_cat_3(WebDriver driver){
        element = driver.findElement(By.linkText("फोटो"));
        return element;
    }
    
    public static WebElement firkee_cat_4(WebDriver driver){
        element = driver.findElement(By.linkText("वीडियो"));
        return element;
    }
}
