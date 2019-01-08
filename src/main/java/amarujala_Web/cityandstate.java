/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amarujala_Web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 *
 * @author akhilesh
 */
public class cityandstate {
    
    private static WebElement element = null;
    
        public static WebElement city_UP(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("उत्तर प्रदेश")));
               
        return element;
    }
        public static WebElement city_UP_1(WebDriver driver){
        
        WebDriverWait wait = new WebDriverWait(driver, 10);
        element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(),'लखनऊ')]")));
        return element;
    }
        public static WebElement city_UP_2(WebDriver driver){
        
        WebDriverWait wait = new WebDriverWait(driver, 10);
        element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("मेरठ")));
        return element;
    }
        public static WebElement city_UP_3(WebDriver driver){
        
         WebDriverWait wait = new WebDriverWait(driver, 10);
        element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("कानपुर")));
        return element;
    }
        public static WebElement city_UP_4(WebDriver driver){
        
         WebDriverWait wait = new WebDriverWait(driver, 10);
        element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("आगरा")));
        return element;
    }
        public static WebElement city_UP_5(WebDriver driver){
        
         WebDriverWait wait = new WebDriverWait(driver, 10);
        element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("वाराणसी")));
        return element;
    }
        public static WebElement city_UP_6(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("अलीगढ़")));
        return element;
    }
        public static WebElement city_UP_7(WebDriver driver){
        element = driver.findElement(By.linkText("गोरखपुर"));
         WebDriverWait wait = new WebDriverWait(driver, 10);
        element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("गोरखपुर")));
        return element;
    }
        public static WebElement city_UP_8(WebDriver driver){
        element = driver.findElement(By.linkText("झांसी"));
        WebDriverWait wait = new WebDriverWait(driver, 10);
        element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("झांसी")));
        return element;
    }
        public static WebElement city_UP_9(WebDriver driver){
        driver.findElement(By.linkText("More •••")).click();
        
        WebDriverWait wait = new WebDriverWait(driver, 10);
        element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("बरेली")));
        return element;
    }
        public static WebElement city_UP_10(WebDriver driver){
        driver.findElement(By.linkText("More •••")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("मुरादाबाद")));
        
        return element;
    }
        public static WebElement city_UP_11(WebDriver driver){
        driver.findElement(By.linkText("More •••")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("प्रयागराज")));
        return element;
    }
        
        public static WebElement city_delhi(WebDriver driver){   
        WebDriverWait wait = new WebDriverWait(driver, 10);
        element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("दिल्ली")));
        return element;
    }
        public static WebElement city_delhi_1(WebDriver driver){   
        WebDriverWait wait = new WebDriverWait(driver, 10);
        element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("दिल्ली-एनसीआर")));
        return element;
    }
        public static WebElement city_delhi_2(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("गाजियाबाद")));
        return element;
    }
        public static WebElement city_delhi_3(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("गुरुग्राम")));
        return element;
    }
        public static WebElement city_delhi_4(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("नोएडा")));
        return element;
    }
        public static WebElement city_delhi_5(WebDriver driver){    
        WebDriverWait wait = new WebDriverWait(driver, 10);
        element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("फरीदाबाद")));   
        return element;
    }
        
        public static WebElement city_uttrakhand(WebDriver driver){    
        WebDriverWait wait = new WebDriverWait(driver, 10);
        element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("उत्तराखंड"))); 
        
        return element;
    }        
        public static WebElement city_uttrakhand_1(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("ऋषिकेश")));
        return element;
    }    
        public static WebElement city_uttrakhand_2(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("अल्मोड़ा")));
        return element;
    }
        public static WebElement city_uttrakhand_3(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("उत्तर काशी")));
        return element;
    }
        public static WebElement city_uttrakhand_4(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("ऊधम सिंह नगर")));
        return element;
    }
        public static WebElement city_uttrakhand_5(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("कोटद्वार")));
        return element;
    }
        public static WebElement city_uttrakhand_6(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("चमोली")));
        return element;
    }
        public static WebElement city_uttrakhand_7(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("चम्पावत")));
        return element;
    }
        public static WebElement city_uttrakhand_8(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("टिहरी")));
        return element;
    }
        public static WebElement city_uttrakhand_9(WebDriver driver){
        driver.findElement(By.linkText("More •••")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("देहरादून")));
        return element;
    }
        public static WebElement city_uttrakhand_10(WebDriver driver){
        driver.findElement(By.linkText("More •••")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("नैनीताल")));
        return element;
    }
        public static WebElement city_uttrakhand_11(WebDriver driver){
        driver.findElement(By.linkText("More •••")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("पिथौरागढ़")));
        return element;
    }
        public static WebElement city_uttrakhand_12(WebDriver driver){
        driver.findElement(By.linkText("More •••")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("पौड़ी")));
        return element;
    }
        public static WebElement city_uttrakhand_13(WebDriver driver){
        driver.findElement(By.linkText("More •••")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("बागेश्वर")));
        return element;
    }
        public static WebElement city_uttrakhand_14(WebDriver driver){
        driver.findElement(By.linkText("More •••")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("रुड़की")));
        return element;
    }
        public static WebElement city_uttrakhand_15(WebDriver driver){
        driver.findElement(By.linkText("More •••")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("रुद्र प्रयाग")));
        return element;
    }
        public static WebElement city_uttrakhand_16(WebDriver driver){
        driver.findElement(By.linkText("More •••")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("हरिद्वार")));
        return element;
    }
        
        public static WebElement city_hp(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("हिमाचल प्रदेश")));  
        return element;
    }
        public static WebElement city_hp_1(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("ऊना")));
        return element;
    }
        public static WebElement city_hp_2(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("कांगड़ा")));    
        return element;
    }
        public static WebElement city_hp_3(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("कुल्लू"))); 
        return element;
    }
        public static WebElement city_hp_4(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("चम्बा")));
        return element;
    }
/*   
        public static WebElement city_hp_5(WebDriver driver){
        element = driver.findElement(By.linkText("धर्मशाला"));
        return element;
   }
*/
        public static WebElement city_hp_6(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("बिलासपुर")));
        return element;
    }
        public static WebElement city_hp_7(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("मंडी")));
        return element;
    }
        public static WebElement city_hp_8(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("रामपुर बुशहर")));
        return element;
    }
        public static WebElement city_hp_9(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.findElement(By.linkText("धर्मशाला")).click();
        element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("शिमला")));
        return element;
    }
        public static WebElement city_hp_10(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(),'सिरमौर')]")));
        return element;
    }
        public static WebElement city_hp_11(WebDriver driver){   
        WebDriverWait wait = new WebDriverWait(driver, 10);
        element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(),'सोलन')]")));
        return element;
    }
        public static WebElement city_hp_12(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("हमीरपुर (हि. प्र.)")));
        return element;
    }
        
        public static WebElement city_j_k(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("जम्मू और कश्मीर")));
        return element;
    }
        public static WebElement city_j_k_1(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("उधमपुर")));
        return element;
    }
        public static WebElement city_j_k_2(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("कठुआ")));
        return element;
    }
        public static WebElement city_j_k_3(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("जम्मू")));
        return element;
    }
        public static WebElement city_j_k_4(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("पुंछ")));
        return element;
    }
        public static WebElement city_j_k_5(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("राजौरी")));
        return element;
    }
        public static WebElement city_j_k_6(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("श्रीनगर")));
        return element;
    }
        
        public static WebElement city_punjab(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("पंजाब")));
        return element;
    }
        public static WebElement city_punjab_1(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("अमृतसर")));
        return element;
    }
        public static WebElement city_punjab_2(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("जालंधर")));
        element = driver.findElement(By.linkText("जालंधर"));
        return element;
    }
        public static WebElement city_punjab_3(WebDriver driver){
        element = driver.findElement(By.linkText("पटियाला"));
        return element;
    }
        public static WebElement city_punjab_4(WebDriver driver){
        element = driver.findElement(By.linkText("लुधियाना"));
        return element;
    }
        
        public static WebElement city_hariyana(WebDriver driver){
        element = driver.findElement(By.linkText("हरियाणा"));
        return element;
    }
        public static WebElement city_hariyana_1(WebDriver driver){
        element = driver.findElement(By.linkText("अंबाला"));
        return element;
    }
        public static WebElement city_hariyana_2(WebDriver driver){
        element = driver.findElement(By.linkText("करनाल"));
        return element;
    }
        public static WebElement city_hariyana_3(WebDriver driver){
        element = driver.findElement(By.linkText("कुरुक्षेत्र"));
        return element;
    }
        public static WebElement city_hariyana_4(WebDriver driver){
        element = driver.findElement(By.linkText("कैथल"));
        return element;
    }
        public static WebElement city_hariyana_5(WebDriver driver){
        element = driver.findElement(By.linkText("जींद"));
        return element;
    }
        public static WebElement city_hariyana_6(WebDriver driver){
        element = driver.findElement(By.linkText("झज्जर/बहादुरगढ़"));
        return element;
    }
        public static WebElement city_hariyana_7(WebDriver driver){
        element = driver.findElement(By.linkText("पलवल"));
        return element;
    }
        public static WebElement city_hariyana_8(WebDriver driver){
        element = driver.findElement(By.linkText("पानीपत"));
        return element;
    }
        public static WebElement city_hariyana_9(WebDriver driver){
        driver.findElement(By.linkText("More •••")).click();
        element = driver.findElement(By.linkText("फतेहाबाद"));
        return element;
    }
        public static WebElement city_hariyana_10(WebDriver driver){
        driver.findElement(By.linkText("More •••")).click();
        element = driver.findElement(By.linkText("भिवानी"));
        return element;
    }
        public static WebElement city_hariyana_11(WebDriver driver){
        driver.findElement(By.linkText("More •••")).click();
        element = driver.findElement(By.linkText("महेंद्रगढ़/नारनौल"));
        return element;
    }
        public static WebElement city_hariyana_12(WebDriver driver){
        driver.findElement(By.linkText("More •••")).click();
        element = driver.findElement(By.linkText("यमुना नगर"));
        return element;
    }
        public static WebElement city_hariyana_13(WebDriver driver){
        driver.findElement(By.linkText("More •••")).click();
        element = driver.findElement(By.linkText("रेवाड़ी"));
        return element;
    }
        public static WebElement city_hariyana_14(WebDriver driver){
        driver.findElement(By.linkText("More •••")).click();
        element = driver.findElement(By.linkText("रोहतक"));
        return element;
    }
        public static WebElement city_hariyana_15(WebDriver driver){
        driver.findElement(By.linkText("More •••")).click();
        element = driver.findElement(By.linkText("सिरसा"));
        return element;
    }
        public static WebElement city_hariyana_16(WebDriver driver){
        driver.findElement(By.linkText("More •••")).click();
        element = driver.findElement(By.linkText("सोनीपत"));
        return element;
    }
        public static WebElement city_hariyana_17(WebDriver driver){
        driver.findElement(By.linkText("More •••")).click();
        element = driver.findElement(By.linkText("हिसार"));
        return element;
    }
        
        public static WebElement city_Rajasthan(WebDriver driver){
        element = driver.findElement(By.linkText("राजस्थान"));
        return element;
    }
        
        public static WebElement city_Bihar(WebDriver driver){
        driver.findElement(By.linkText("More •••")).click();
        element = driver.findElement(By.linkText("बिहार"));
        return element;
    }
        
        public static WebElement city_chhattisgarh(WebDriver driver){
        driver.findElement(By.linkText("More •••")).click();
        element = driver.findElement(By.linkText("छत्तीसगढ़"));
        return element;
    }
        
        public static WebElement city_jharkhand(WebDriver driver){
        driver.findElement(By.linkText("More •••")).click();
        element = driver.findElement(By.linkText("झारखण्ड"));
        return element;
    }
        
        public static WebElement city_mp(WebDriver driver){
        driver.findElement(By.linkText("More •••")).click();
        element = driver.findElement(By.linkText("मध्य प्रदेश"));
        return element;
    }
        public static WebElement city_mp_1(WebDriver driver){
        element = driver.findElement(By.linkText("भोपाल"));
        return element;
    }
        
        
        
        
     
        
    
    
    
        
    
}
