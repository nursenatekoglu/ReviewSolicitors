package com.reviewSolicitors.utility;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Singleton Pattern
 */

public class Driver {

    private static WebDriver obj;

    private Driver() {}

    public static WebDriver getDriver(){

        if (obj==null){
            WebDriverManager.chromedriver().setup();
            obj = new ChromeDriver();
            obj.manage().window().maximize();
            return obj;
        }

        return obj;

    }

}
