/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amarujala;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import amarujala_Web.*;
import utility.*;
import setup.*;

/**
 *
 * @author akhilesh
 */
public class HomepageNGTest {
  private WebDriver driver;
    
    public HomepageNGTest() {
    }

   
    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        driver = drivers.Chromesetup();
  }
    
//    public void mustfunction(WebDriver driver) throws InterruptedException{
//        waitfunction.WaitForAjax(driver);
//        scrollfunctions.scroll(driver);
//    }
    
    
    public void hompepageTest() throws Exception {
        driver.get("https://www.amarujala.com/");
//        mustfunction(driver);
        homepage.h_main_Country(driver).click();
//        mustfunction(driver);
        homepage.h_main_astro(driver).click();
//        mustfunction(driver);
        homepage.h_sub_astro_1(driver).click();
//        mustfunction(driver);
        homepage.h_sub_astro_2(driver).click();
//        mustfunction(driver);
        homepage.h_sub_astro_3(driver).click();
//        mustfunction(driver);
        homepage.h_sub_astro_4(driver).click();
//        mustfunction(driver);
        homepage.h_sub_astro_5(driver).click();
//        mustfunction(driver);
        homepage.h_main_city(driver).click();
//        mustfunction(driver);
        homepage.h_sub_city_1(driver).click();
//        mustfunction(driver);
        homepage.h_sub_city_2(driver).click();
//        mustfunction(driver);
        homepage.h_sub_city_3(driver).click();
//        mustfunction(driver);
        homepage.h_sub_city_4(driver).click();
//        mustfunction(driver);
        homepage.h_main_election(driver).click();
//        mustfunction(driver);
        homepage.h_main_entertainment(driver).click();
//        mustfunction(driver);
        homepage.h_sub_ent1(driver).click();
//        mustfunction(driver);
        homepage.h_sub_ent2(driver).click();
//        mustfunction(driver);
        homepage.h_sub_ent3(driver).click();
//        mustfunction(driver);
        homepage.h_sub_ent4(driver).click();
//        mustfunction(driver);
        homepage.h_main_photo(driver).click();
//        mustfunction(driver);
        homepage.h_sub_photo1(driver).click();
//        mustfunction(driver);
        homepage.h_sub_photo2(driver).click();
//        mustfunction(driver);
        homepage.h_sub_photo3(driver).click();
//        mustfunction(driver);
        homepage.h_sub_photo4(driver).click();
//        mustfunction(driver);
        homepage.h_sub_photo5(driver).click();
//        mustfunction(driver);
        homepage.h_sub_photo6(driver).click();
//        mustfunction(driver);
        homepage.h_sub_photo7(driver).click();
//        mustfunction(driver);
        homepage.h_sub_photo8(driver).click();
//        mustfunction(driver);
        homepage.h_main_video(driver).click();
//        mustfunction(driver);
    //homepage
    
  }
   
    @Test()
    public void categorypageTest() throws InterruptedException{
        driver.get("https://www.amarujala.com/");
        Thread.sleep(2000);
        categorypages.cat_0(driver).click();
        categorypages.cat_1(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println("1 done");
        
        driver.get("https://www.amarujala.com/");
        Thread.sleep(2000);
        categorypages.cat_0(driver).click();
        categorypages.cat_2(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println("2 done");
        
        driver.get("https://www.amarujala.com/");
        Thread.sleep(2000);
        categorypages.cat_0(driver).click();
        categorypages.cat_3(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println("3 done");
        
        driver.get("https://www.amarujala.com/");
        Thread.sleep(2000);
        categorypages.cat_0(driver).click();
        categorypages.cat_4(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println("4 done");
        
        driver.get("https://www.amarujala.com/");
        Thread.sleep(2000);
        categorypages.cat_0(driver).click();
        categorypages.cat_5(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println("5 done");
        
        driver.get("https://www.amarujala.com/");
        Thread.sleep(2000);
        categorypages.cat_0(driver).click();
        categorypages.cat_6(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println("6 done");
        
        driver.get("https://www.amarujala.com/");
        Thread.sleep(2000);
        categorypages.cat_0(driver).click();
        categorypages.cat_7(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println("7 done");
        
        driver.get("https://www.amarujala.com/");
        Thread.sleep(2000);
        categorypages.cat_0(driver).click();
        categorypages.cat_8(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println("8 done");
        
        driver.get("https://www.amarujala.com/");
        Thread.sleep(2000);
        categorypages.cat_0(driver).click();
        categorypages.cat_9(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println("9 done");
        
        driver.get("https://www.amarujala.com/");
        Thread.sleep(2000);
        categorypages.cat_0(driver).click();
        categorypages.cat_10(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println("10 done");
        
        driver.get("https://www.amarujala.com/");
       Thread.sleep(2000);
        categorypages.cat_0(driver).click();
        categorypages.cat_11(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println("11 done");
        
        driver.get("https://www.amarujala.com/");
        Thread.sleep(2000);
        categorypages.cat_0(driver).click();
        categorypages.cat_12(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println("12 done");
        
        driver.get("https://www.amarujala.com/");
        Thread.sleep(2000);
        categorypages.cat_0(driver).click();
        categorypages.cat_13(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println("13 done");
        
        driver.get("https://www.amarujala.com/");
        Thread.sleep(2000);
        categorypages.cat_0(driver).click();
        categorypages.cat_14(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println("14 done");
        
        driver.get("https://www.amarujala.com/");
        Thread.sleep(2000);
        categorypages.cat_0(driver).click();
        categorypages.cat_15(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        
        driver.get("https://www.amarujala.com/");
        Thread.sleep(2000);
        categorypages.cat_0(driver).click();
        categorypages.cat_16(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        
        driver.get("https://www.amarujala.com/");
        Thread.sleep(2000);
        categorypages.cat_0(driver).click();
        categorypages.cat_17(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        
        driver.get("https://www.amarujala.com/");
       Thread.sleep(2000);
        categorypages.cat_0(driver).click();
        categorypages.cat_18(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        
        driver.get("https://www.amarujala.com/");
        Thread.sleep(2000);
        categorypages.cat_0(driver).click();
        categorypages.cat_19(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        
        driver.get("https://www.amarujala.com/");
        Thread.sleep(2000);
        categorypages.cat_0(driver).click();
        categorypages.cat_20(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        
        driver.get("https://www.amarujala.com/");
        Thread.sleep(2000);
        categorypages.cat_0(driver).click();
        categorypages.cat_21(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        
        driver.get("https://www.amarujala.com/");
        Thread.sleep(2000);
        categorypages.cat_0(driver).click();
        categorypages.cat_22(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        
        driver.get("https://www.amarujala.com/");
        Thread.sleep(2000);
        categorypages.cat_0(driver).click();
        categorypages.cat_23(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        
        driver.get("https://www.amarujala.com/");
        Thread.sleep(2000);
        categorypages.cat_0(driver).click();
        categorypages.cat_24(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        
        driver.get("https://www.amarujala.com/");
        Thread.sleep(2000);
        categorypages.cat_0(driver).click();
        categorypages.cat_25(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        
        driver.get("https://www.amarujala.com/");
        Thread.sleep(2000);
        categorypages.cat_0(driver).click();
        categorypages.cat_26(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        
        driver.get("https://www.amarujala.com/");
        Thread.sleep(2000);
        categorypages.cat_0(driver).click();
        categorypages.cat_27(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        
        driver.get("https://www.amarujala.com/");
        Thread.sleep(2000);
        categorypages.cat_0(driver).click();
        categorypages.cat_28(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
      
        
    }

    
    public void cityandstateTest() throws InterruptedException{
        
        driver.get("https://www.amarujala.com/");
        Thread.sleep(2000);
        
// Get up city and state page.

        homepage.h_main_city(driver).click();
        cityandstate.city_UP(driver).click();
        cityandstate.city_UP_1(driver).click(); 
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_UP_1(driver).getText());
        
        cityandstate.city_UP_2(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_UP_2(driver).getText());
        
        cityandstate.city_UP_3(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_UP_3(driver).getText());
        
        cityandstate.city_UP_4(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_UP_4(driver).getText());

        cityandstate.city_UP_5(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_UP_5(driver).getText());
        
        cityandstate.city_UP_6(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_UP_5(driver).getText());
        
        cityandstate.city_UP_7(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_UP_5(driver).getText());
        
        cityandstate.city_UP_8(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_UP_5(driver).getText());
        
        cityandstate.city_UP_9(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_UP_9(driver).getText());
        
        cityandstate.city_UP_10(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_UP_10(driver).getText());
        
        cityandstate.city_UP_11(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_UP_11(driver).getText());
       
        
// get Delhi city and pages

        homepage.h_main_city(driver).click();
        cityandstate.city_delhi(driver).click();
        cityandstate.city_delhi_1(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println( cityandstate.city_delhi_1(driver).getText());
        
        cityandstate.city_delhi_2(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println( cityandstate.city_delhi_2(driver).getText());
        
        cityandstate.city_delhi_3(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_delhi_3(driver).getText());
        
        cityandstate.city_delhi_4(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println( cityandstate.city_delhi_4(driver).getText());
        
        cityandstate.city_delhi_5(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_delhi_5(driver).getText());
        
    
//get himachal city and pages

        homepage.h_main_city(driver).click();
        cityandstate.city_hp(driver).click();
        cityandstate.city_hp_1(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_hp_1(driver).getText());
        
        cityandstate.city_hp_2(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_hp_2(driver).getText());
        
        cityandstate.city_hp_3(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_hp_3(driver).getText());
       
        cityandstate.city_hp_4(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_hp_4(driver).getText());
        
        cityandstate.city_hp_5(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_hp_5(driver).getText());
        
        cityandstate.city_hp_6(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_hp_6(driver).getText());

        cityandstate.city_hp_7(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_hp_7(driver).getText());

        cityandstate.city_hp_8(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_hp_8(driver).getText());

        cityandstate.city_hp_9(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_hp_9(driver).getText());
       
        cityandstate.city_hp_10(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_hp_10(driver).getText());
 
        cityandstate.city_hp_11(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_hp_11(driver).getText());
        
        cityandstate.city_hp_12(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_hp_12(driver).getText());
        
// get uttrakhand city and pages
        homepage.h_main_city(driver).click();
        cityandstate.city_uttrakhand(driver).click();
        cityandstate.city_uttrakhand_1(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_uttrakhand_1(driver).getText());
        
        cityandstate.city_uttrakhand_2(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_uttrakhand_2(driver).getText());

        cityandstate.city_uttrakhand_3(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_uttrakhand_3(driver).getText());
        
        cityandstate.city_uttrakhand_4(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_uttrakhand_4(driver).getText());
        
        cityandstate.city_uttrakhand_5(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_uttrakhand_5(driver).getText());
        
        cityandstate.city_uttrakhand_6(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_uttrakhand_6(driver).getText());
        
        cityandstate.city_uttrakhand_7(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_uttrakhand_7(driver).getText());
        
        cityandstate.city_uttrakhand_8(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_uttrakhand_8(driver).getText());
        
        cityandstate.city_uttrakhand_9(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_uttrakhand_9(driver).getText());
        
        cityandstate.city_uttrakhand_10(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_uttrakhand_10(driver).getText());

        cityandstate.city_uttrakhand_11(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_uttrakhand_11(driver).getText());
        
        cityandstate.city_uttrakhand_12(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_uttrakhand_12(driver).getText());
        
        cityandstate.city_uttrakhand_13(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_uttrakhand_13(driver).getText());

        cityandstate.city_uttrakhand_14(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_uttrakhand_14(driver).getText());

        cityandstate.city_uttrakhand_15(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_uttrakhand_15(driver).getText());

        cityandstate.city_uttrakhand_16(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_uttrakhand_16(driver).getText());
        
        cityandstate.city_uttrakhand(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_uttrakhand(driver).getText());
        
//Get haryana city and pages

         

        homepage.h_main_city(driver).click();
        cityandstate.city_hariyana(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_hariyana(driver).getText());
        
        cityandstate.city_hariyana_1(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_hariyana_1(driver).getText());
        
        cityandstate.city_hariyana_2(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_hariyana_2(driver).getText());

        cityandstate.city_hariyana_3(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_hariyana_3(driver).getText());
        
        cityandstate.city_hariyana_4(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_hariyana_4(driver).getText());
        
        cityandstate.city_hariyana_5(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_hariyana_5(driver).getText());
        
        cityandstate.city_hariyana_6(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_hariyana_6(driver).getText());
        
        cityandstate.city_hariyana_7(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_hariyana_7(driver).getText());

        cityandstate.city_hariyana_8(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_hariyana_8(driver).getText());
        
        cityandstate.city_hariyana_9(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_hariyana_9(driver).getText());
        
        cityandstate.city_hariyana_10(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_hariyana_10(driver).getText());
        
        cityandstate.city_hariyana_11(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_hariyana_11(driver).getText());
        
        cityandstate.city_hariyana_12(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_hariyana_12(driver).getText());
        
        cityandstate.city_hariyana_13(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_hariyana_13(driver).getText());
        
        cityandstate.city_hariyana_14(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_hariyana_14(driver).getText());
        
        cityandstate.city_hariyana_15(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_hariyana_15(driver).getText());
        
        cityandstate.city_hariyana_16(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_hariyana_16(driver).getText());
        
        cityandstate.city_hariyana_17(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_hariyana_17(driver).getText());
        
// get rajasthan city and pages
        homepage.h_main_city(driver).click();
        cityandstate.city_Rajasthan(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_Rajasthan(driver).getText());
        
// Get bihar city 
        homepage.h_main_city(driver).click();
        cityandstate.city_Bihar(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_Bihar(driver).getText());
        
// Get chhattisgarh city
        homepage.h_main_city(driver).click();
        cityandstate.city_chhattisgarh(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_chhattisgarh(driver).getText());
        
// Get jharkhand city
        homepage.h_main_city(driver).click();
        cityandstate.city_jharkhand(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_jharkhand(driver).getText());
        
// Get mp city
        homepage.h_main_city(driver).click();
        cityandstate.city_mp_1(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_mp_1(driver).getText());
        
// Get j&K city and pages

        homepage.h_main_city(driver).click();
        cityandstate.city_j_k(driver).click();
        cityandstate.city_j_k_1(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_j_k_1(driver).getText());
        
        cityandstate.city_j_k(driver).click();
        cityandstate.city_j_k_2(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_j_k_2(driver).getText());
        
        cityandstate.city_j_k(driver).click();
        cityandstate.city_j_k_3(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_j_k_3(driver).getText());

        cityandstate.city_j_k(driver).click();
        cityandstate.city_j_k_4(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_j_k_4(driver).getText());

        cityandstate.city_j_k(driver).click();
        cityandstate.city_j_k_5(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_j_k_5(driver).getText());
        
        cityandstate.city_j_k(driver).click();
        cityandstate.city_j_k_6(driver).click();
        waitfunction.WaitForAjax(driver);
        scrollfunctions.scroll(driver);
        System.out.println(cityandstate.city_j_k_6(driver).getText());
        
        
       
  }
    

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    
  }
    
}
