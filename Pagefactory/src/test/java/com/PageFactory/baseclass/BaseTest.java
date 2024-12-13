package com.PageFactory.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseTest {
    protected WebDriver driver;

    // Setup WebDriver
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://www.flipkart.com");
        driver.manage().window().maximize();
    }

    // Cleanup
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
