package com.reviewSolicitors.tests;

import com.reviewSolicitors.test_util.TestBase;
import com.reviewSolicitors.utility.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestPageTitles extends TestBase {


    @Test
    public void testHomePage() {

        String expectedTitle = "Rate and Review any UK Solicitor with ReviewSolicitors";
        String actualTitle = driver.getTitle();

        assertEquals(expectedTitle, actualTitle);

    }


    @Test
    public void testTopLinks() {


        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement acceptButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='cookies__buttons-btn cookies__buttons-btn--green cookies__accept']")));
        acceptButton.click();

        try {
            driver.switchTo().alert().accept();
        } catch (Exception e) {

        }


        driver.findElement(By.linkText("Write a review")).click();

        String expectedTitle = "Write a review of UK Solicitors";
        String actualTitle = driver.getTitle();

        assertEquals(expectedTitle, actualTitle);

    }



}
