/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amarujala_Web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
/**
 *
 * @author akhilesh
 */
public class homepage {
    
    private static WebElement element = null;
    
    public static WebElement h_main_Country(WebDriver driver){
        element = driver.findElement(By.linkText("देश"));
        return element;
    }
    public static WebElement h_main_city(WebDriver driver){
        element = driver.findElement(By.linkText("शहर और राज्य"));
        return element;
    }
    public static WebElement h_sub_city_1(WebDriver driver){
        element = driver.findElement(By.linkText("दिल्ली"));
        return element;
    }
    public static WebElement h_sub_city_2(WebDriver driver){
        element = driver.findElement(By.linkText("उत्तराखंड"));
        return element;
    }
    public static WebElement h_sub_city_3(WebDriver driver){
        element = driver.findElement(By.linkText("हिमाचल प्रदेश"));
        return element;
    }
    public static WebElement h_sub_city_4(WebDriver driver){
        element = driver.findElement(By.linkText("जम्मू और कश्मीर"));
        return element;
    }
    public static WebElement h_main_astro(WebDriver driver){
        element = driver.findElement(By.linkText("ज्योतिष"));
        return element;
    }
    public static WebElement h_sub_astro_1(WebDriver driver){
        element = driver.findElement(By.linkText("बोले तारे"));
        return element;
    }
    public static WebElement h_sub_astro_2(WebDriver driver){
        element = driver.findElement(By.linkText("अंक ज्योतिष"));
        return element;
    }
    public static WebElement h_sub_astro_3(WebDriver driver){
        element = driver.findElement(By.linkText("वास्तु"));
        return element;
    }
    public static WebElement h_sub_astro_4(WebDriver driver){
        element = driver.findElement(By.linkText("ज्योतिष महाकुंभ"));
        return element;
    }
    public static WebElement h_sub_astro_5(WebDriver driver){
        element = driver.findElement(By.linkText("जन्म कुंडली"));
        return element;
    }
    public static WebElement h_main_election(WebDriver driver){
        element = driver.findElement(By.linkText("चुनाव"));
        return element;
    }
    public static WebElement h_main_video(WebDriver driver){
        element = driver.findElement(By.linkText("वीडियो"));
        return element;
        
    }
    public static WebElement h_main_photo(WebDriver driver){
        element = driver.findElement(By.linkText("फोटो"));
        return element;
    }
    public static WebElement h_sub_photo1(WebDriver driver){
        element = driver.findElement(By.linkText("बॉलीवुड"));
        return element;
    }
    public static WebElement h_sub_photo2(WebDriver driver){
        element = driver.findElement(By.linkText("मनोरंजन"));
        return element;
    }
    public static WebElement h_sub_photo3(WebDriver driver){
        element = driver.findElement(By.linkText("लाइफस्टाइल"));
        return element;
    }
    public static WebElement h_sub_photo4(WebDriver driver){
        element = driver.findElement(By.linkText("क्रिकेट"));
        return element;
    }
    public static WebElement h_sub_photo5(WebDriver driver){
        element = driver.findElement(By.linkText("देश"));
        return element;
    }
    public static WebElement h_sub_photo6(WebDriver driver){
        element = driver.findElement(By.linkText("दुनिया"));
        return element;
    }
    public static WebElement h_sub_photo7(WebDriver driver){
        element = driver.findElement(By.linkText("हटके खबर"));
        return element;
    }
    public static WebElement h_sub_photo8(WebDriver driver){
        element = driver.findElement(By.linkText("लखनऊ"));
        return element;
    }
    public static WebElement h_main_entertainment(WebDriver driver){
        element = driver.findElement(By.linkText("मनोरंजन"));
        return element;
    }
    public static WebElement h_sub_ent1(WebDriver driver){
        element = driver.findElement(By.linkText("बॉलीवुड"));
        return element;
    }
    public static WebElement h_sub_ent2(WebDriver driver){
        element = driver.findElement(By.linkText("हॉलीवुड"));
        return element;
    }
    public static WebElement h_sub_ent3(WebDriver driver){
        element = driver.findElement(By.linkText("छोटा पर्दा"));
        return element;
    }
    public static WebElement h_sub_ent4(WebDriver driver){
        element = driver.findElement(By.linkText("फिल्म समीक्षा"));
        return element;
    }
 
 
}
