package com.reviewSolicitors.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DryRun {


    public static void main(String[] args) {

        //1.Setup Chrome Driver so selenium can use it to automate chrome
        WebDriverManager.chromedriver().setup();

        //2.Create Chrome Driver object to open browser
        WebDriver driver = new ChromeDriver();

        //navigate to https://google.com
       // driver.navigate().to("https://google.com");

        //maximize the browser size
        driver.manage().window().maximize();

        //driver.get(url) -shorter way to navigate
        driver.get("https://www.reviewsolicitors.co.uk/");

        System.out.println(driver.getCurrentUrl());

        String currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        //verify title
        String expectedTitle =  "Rate and Review any UK Solicitor with ReviewSolicitors";
        
        driver.navigate().back();

        driver.navigate().forward();

        driver.navigate().refresh();

        driver.close();
        driver.quit();



    }


}
