package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

public class NavigationTests {
    public static void NavigationTests(String browserType) throws InterruptedException {
        WebDriver driver = BrowserFactory.getDriver(browserType);
        driver.get("https://google.com");
        String firstGoogleTitle = driver.getTitle();
        driver.get("https://etsy.com");
        String firstEtsyTitle = driver.getTitle();
        driver.navigate().back();
        String secondGoogleTitle = driver.getTitle();
        driver.navigate().forward();
        String secondEtsyTitle = driver.getTitle();
        System.out.println("firstGoogleTitle  = " + firstGoogleTitle);
        System.out.println("secondGoogleTitle = " + secondGoogleTitle);
        StringUtility.verifyEquals(firstGoogleTitle, secondGoogleTitle);
        System.out.println("firstEtsyTitle  = " + firstEtsyTitle);
        System.out.println("secondEtsyTitle = " + secondEtsyTitle);
        StringUtility.verifyEquals(firstEtsyTitle, secondEtsyTitle);
        Thread.sleep(5000);
        driver.quit();

    }
}
