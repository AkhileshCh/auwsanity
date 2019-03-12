/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import java.io.IOException;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.apache.http.conn.ConnectTimeoutException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 *
 * @author akhilesh
 */
public class GeturlStatus {

    public static WebDriver getStatus(WebDriver driver) throws MalformedURLException, IOException {

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        int count = 0;
        for (WebElement Link : allLinks) {

            String linksofpage = Link.getAttribute("href");

            if (("javascript:void(0);".equals(linksofpage)) || ("null".equals(linksofpage) || ("javascript:void(0)".equals(linksofpage) || (" ".equals(linksofpage))))) {
                System.out.println(linksofpage);
            } else {
                try {
                    URL url = new URL(linksofpage);
                    HttpURLConnection http = (HttpURLConnection) url.openConnection();
                    http.setRequestMethod("GET");
                    http.setRequestProperty("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.119 Safari/537.36");
                    System.out.println(linksofpage);
                    int statusCode = http.getResponseCode();
                    System.out.println(statusCode);
                    count++;
                } catch (MalformedURLException | ConnectTimeoutException|ConnectException e) {
                    System.out.println(e);
                    

                }

            }
            System.out.println(count);

        }
        return (driver);
    }
}
