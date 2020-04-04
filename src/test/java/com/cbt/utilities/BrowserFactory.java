package com.cbt.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

        public static WebDriver getDriver(String browserType) {
            WebDriver driver = null;
            switch (browserType.toLowerCase()) {
                case "chrome":
                    System.setProperty("webdriver.chrome.driver", "C:\\Users\\mksim\\IdeaProjects\\EU2TestNGProject\\drivers\\chromedriver.exe");
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    System.setProperty("webdriver.gecko.driver", "C:\\Users\\mksim\\IdeaProjects\\EU2TestNGProject\\drivers\\geckodriver.exe");
                    driver = new FirefoxDriver();
                    break;
                case"edge":
                    System.setProperty("webdriver.edge.driver","C:\\Users\\mksim\\IdeaProjects\\EU2TestNGProject\\drivers\\msedgedriver.exe");
                    driver = new EdgeDriver();
                    break;
                case"safari":
                    System.out.println("This is WINDOWS not MAC");
                    break;
            }
            return driver;
        }
    }