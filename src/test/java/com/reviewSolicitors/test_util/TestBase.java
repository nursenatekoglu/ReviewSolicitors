package com.reviewSolicitors.test_util;

import com.reviewSolicitors.utility.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

    public WebDriver driver;

    @BeforeEach
    public void init(){

        driver = Driver.getDriver();
        driver.get("https://www.reviewsolicitors.co.uk/");
    }

//    @AfterEach
//    public void closeBrowser(){
//        driver.quit();
//    }

}
