/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amarujala_Results;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 *
 * @author akhilesh
 */
public class resultsMenu {

    private static WebElement element = null;
    
    

    public static WebElement result_cat_1(WebDriver driver) {

        element = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/ul/li[2]/a"));
        return element;
    }

    public static WebElement result_cat_2(WebDriver driver) {
        element = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/ul/li[3]/a"));
        return element;
    }

    public static WebElement result_cat_3(WebDriver driver) {
        element = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/ul/li[4]/a"));
        return element;
    }

    public static WebElement result_cat_4(WebDriver driver) {

        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/ul/li[5]/a"));
        return element;
    }

    public static WebElement result_cat_5(WebDriver driver) {
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/ul/li[6]/a"));
        return element;
    }
    
    public static WebElement result_cat_6(WebDriver driver) {

        element = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/ul/li[7]/a"));
        return element;
    }
}
