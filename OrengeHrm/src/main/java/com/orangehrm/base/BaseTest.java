package com.orangehrm.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    public static WebDriver driver;
    public static Properties prop;

    public BaseTest() {
        try {
            // Load configuration properties
            prop = new Properties();
            FileInputStream fis = new FileInputStream("C:\\Users\\Qapitol\\IdeaProjects\\OrengeHrm\\src\\main\\resources\\config.properties");
            prop.load(fis);
        } catch (Exception e) {
            System.err.println("Error loading configuration file: " + e.getMessage());
        }
    }

    public void initilizer() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");
    }

    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
