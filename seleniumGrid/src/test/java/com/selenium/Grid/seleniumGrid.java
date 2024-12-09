package com.selenium.Grid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class seleniumGrid {
    //Setup Extent Reports
    @BeforeClass
    @Parameters({"browser"})
    public void startingSession(@Optional("chrome")String browser) throws MalformedURLException, MalformedURLException {
        com.qapitol.base.DriverManager.setDriver(browser);
    }


        @Test
        public void Test1() {

            try {
                System.out.println("Test1 started...");
                com.qapitol.base.DriverManager.getDriver().get("https://www.facebook.com/");
                com.qapitol.base.DriverManager.getDriver().manage().window().maximize();


            } catch (Exception e) {
                System.out.println("Exception is:" + e);
            }
        }
        @Test
    public void Test2() {

        try {
            System.out.println("Test2 started...");
            com.qapitol.base.DriverManager.getDriver().get("https://www.google.com/");
            com.qapitol.base.DriverManager.getDriver().manage().window().maximize();



        } catch (Exception e) {
            System.out.println("Exception is:"+e);
        }
    }


    @Test
    public void Test3() {

        try {
            System.out.println("Test3 started...");
            com.qapitol.base.DriverManager.getDriver().get("https://www.youtube.com/");
            com.qapitol.base.DriverManager.getDriver().manage().window().maximize();
            System.out.println("Test3 ended...");
        } catch (Exception e) {
            System.out.println("Exception is:"+e);
        }
    }

}

