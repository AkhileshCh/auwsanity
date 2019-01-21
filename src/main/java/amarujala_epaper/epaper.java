/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amarujala_epaper;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import io.restassured.RestAssured;
/**
 *
 * @author akhilesh
 */
public class epaper {
    
    private static WebElement element = null;
    
    public static ArrayList get_cityname_epaper(WebDriver driver){
        ArrayList<Integer> countofpages = new ArrayList<Integer>();
        String [] dropdowncity = {  "agra-city",
                                    "agra-dehat",
                                    "aligarh-city",
                                    "aligarh-dehat",
                                    "allahabad-city",
                                    "almora",
                                    "ambala",
                                    "ambedkar-nagar",
                                    "auraiya",
                                    "azamgarh",
                                    "badaun",
                                    "baghpat",
                                    "bahraich",
                                    "balia",
                                    "banda",
                                    "barabanki",
                                    "bareilly-city",
                                    "bareilly-dehat",
                                    "basti",
                                    "bhadohi",
                                    "bhiwani",
                                    "bijnor",
                                    "bilaspur",
                                    "bulandsahar",
                                    "chamba",
                                    "chandauli",
                                    "chandigarh-city",
                                    "charkhi-dadri",
                                    "dehradun-city",
                                    "delhi-city",
                                    "deoria",
                                    "etah",
                                    "etawa",
                                    "faizabad",
                                    "faridabad",
                                    "farrukhabad",
                                    "fatehabad",
                                    "fatehpur",
                                    "firozabad",
                                    "gangapar",
                                    "garhwal",
                                    "ghaziabad",
                                    "ghazipur",
                                    "gonda-balrampur",
                                    "gorakhpur-city",
                                    "gorakhpur-dehat",
                                    "greater-noida",
                                    "gurgaon",
                                    "hamirpur-dharamshala",
                                    "hamirpur",
                                    "hapur",
                                    "hardoi",
                                    "haridwar",
                                    "hathras",
                                    "hisar",
                                    "jalandhar",
                                    "jalaun",
                                    "jammu-city",
                                    "jammu-dehat",
                                    "jhajjar",
                                    "jhansi-city",
                                    "jhansi-dehat",
                                    "jind",
                                    "jounpur",
                                    "jpnagar",
                                    "kaithal",
                                    "kangra",
                                    "kannauj",
                                    "kanpur-city",
                                    "kanpur-dehat",
                                    "kanpur-ghatampur",
                                    "karnal",
                                    "kathua",
                                    "kaushambi",
                                    "khiri",
                                    "kotdwar",
                                    "kullu",
                                    "kurukshetra",
                                    "kushinagar",
                                    "lalitpur",
                                    "lucknow-city",
                                    "mainpuri",
                                    "mandi",
                                    "mathura",
                                    "mau",
                                    "meerut-city",
                                    "meerut-dehat",
                                    "mharajgunj",
                                    "mirzapur",
                                    "mohali",
                                    "moradabad-city",
                                    "moradabad-dehat",
                                    "muzaffarnagar",
                                    "narnaul",
                                    "noida",
                                    "panchkula",
                                    "panipat",
                                    "pilibhit",
                                    "pithoragarh",
                                    "pratapgarh",
                                    "prayagraj-naini",
                                    "raebareli",
                                    "rajasthan",
                                    "rampur-dharamshala",
                                    "rampur",
                                    "rewari",
                                    "rishikesh",
                                    "rohtak-city",
                                    "roorkee",
                                    "saharanpur-city",
                                    "saharanpur-dehat",
                                    "sambhal",
                                    "santkabirnagar",
                                    "shahjahanpur",
                                    "shamli-muzaffarnagar-dehat",
                                    "shimla",
                                    "siddharthnagar",
                                    "sirmaur",
                                    "sirsa",
                                    "sitapur",
                                    "solan",
                                    "sonbhadra",
                                    "sonipat",
                                    "sultanpur",
                                    "trans-hindon-area",
                                    "udhampur",
                                    "udhamsingh-nagar",
                                    "una",
                                    "unnao",
                                    "varanasi-city",
                                    "vikas-nagar",
                                    "yamuna-nagar"};
        
        for(int i=0 ; i<dropdowncity.length ; i++){
        driver.get("https://epaper.amarujala.com/"+dropdowncity[i]+"?format=img&p=today&ed_code="+dropdowncity[i]);
        WebElement citypagenumber = driver.findElement(By.id("select-pageno"));
        List<WebElement> elemcount = citypagenumber.findElements(By.tagName("option"));
        int pagecount = elemcount.size();
        countofpages.add(pagecount);
        }
        
        return (ArrayList) countofpages;
        
    }
    
     public static int httpResponseCodeViaGet(String url) {
            return RestAssured.get(url).statusCode();
    }
    
}
