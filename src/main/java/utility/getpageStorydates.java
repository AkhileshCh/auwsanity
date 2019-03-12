/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 *
 * @author akhilesh
 */
public class getpageStorydates {

    public static WebDriver getpagestorydates(WebDriver driver , ExtentTest logger) throws InterruptedException, ParseException {
        int number_of_month=0;
        List<WebElement> elem = driver.findElements(By.xpath("//p[@class='time-clock']|//p[@class='time-clock ajax']"));
        List<Integer> homepagedatelist = new ArrayList();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        LocalDate localDate = LocalDate.now();
        String currentdate = DateTimeFormatter.ofPattern("dd/M/yyyy").format(localDate);
        Date Currentdate = formatter.parse(currentdate);
        Map<Integer,String> map = new HashMap();
        map.put(1,"जनवरी");
        map.put(2,"फरवरी");
        map.put(3,"मार्च");
        map.put(4,"अप्रैल");
        map.put(5,"मई");
        map.put(6,"जून");
        map.put(7,"जुलाई");
        map.put(8,"अगस्त");
        map.put(9,"सितंबर");
        map.put(10,"अक्टूबर");
        map.put(11,"नवंबर");
        map.put(12,"दिसंबर");
        
        System.out.println(currentdate);
        int count = 0;
        
        for (int i = 0; i < elem.size(); i++) {
            count++;
            String dateaname = elem.get(i).getAttribute("innerText");
            String[] explodstring = dateaname.split(" ", 3);
            for (Entry<Integer,String> entry : map.entrySet()) {
                    if (entry.getValue().equals(explodstring[1])) {
                        number_of_month = entry.getKey();
                    }
            }
            String formedate = explodstring[0] + "/"+number_of_month+"/" + explodstring[2];
            Date date1 = formatter.parse(formedate);
            //System.out.println("parsed date is now here" + formatter.format(date1));
            long diff = Currentdate.getTime() - date1.getTime();
            int diff_in_days = (int) (diff/86400000);
            System.out.println("diffrence of date in days is here ::"+diff/86400000);
            homepagedatelist.add(diff_in_days);
//            System.out.println(count + "::" + elem.get(i) + ":::::::::::::" + dateaname);

        
      }
        int samedatestorycount = 0;
        int oldatestorycount = 0;
        for (int str : homepagedatelist) {
            
            if (str == 0) {

                samedatestorycount++;
            } else {
                oldatestorycount++;
            }

         }
        logger.log(LogStatus.INFO,"Count of today Story is "+""+samedatestorycount);
        logger.log(LogStatus.INFO,"Count of older Story is "+""+oldatestorycount);
        return driver;
 } 
}