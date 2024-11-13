package com.Qapitol.base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class baseclass {
    public WebDriver driver;
    @BeforeMethod
    public void initilization(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollBy(133,488)"," ");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        driver.findElement(By.xpath("//h5[normalize-space()='Elements']")).click();

    }
   /* @AfterMethod
    public void termination(){
        driver.manage().window().minimize();
        driver.quit();
    }*/
}
