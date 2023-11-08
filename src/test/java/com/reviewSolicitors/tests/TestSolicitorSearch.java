package com.reviewSolicitors.tests;

import com.reviewSolicitors.test_util.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;


public class TestSolicitorSearch extends TestBase {



    @Test
    public void testSolicitorSearch() {

        WebDriverWait wait = new WebDriverWait(driver, 10); // Set the maximum wait time to 10 seconds

        // Wait for the "Accept" button to be visible
        WebElement acceptButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='cookies__buttons-btn cookies__buttons-btn--green cookies__accept']")));

        acceptButton.click();

        // Handle any alerts if present
        try {
            driver.switchTo().alert().accept();
        } catch (Exception e) {
            // No alert present, continue with your code
        }

        WebElement firstInputBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ranking-area-of-law")));

        firstInputBox.sendKeys("family");

        WebElement secondInputBox = driver.findElement(By.id("ranking-location"));

        secondInputBox.sendKeys("sheffield");

        WebElement searchButton = driver.findElement(By.id("geo-aol-search-submit"));

        searchButton.click();



        WebElement firstCompany = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h2[@class='review__company-name' and text()='Poole Alcock LLP']")));
        firstCompany.click();

        String mainWindowHandle = driver.getWindowHandle();

        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(mainWindowHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement visitWebsiteLink = driver.findElement(By.xpath("//a[@class='profile-top__cta-btn websiteClick']"));
        visitWebsiteLink.click();

        //Company website opened in a new tab



    }

}
