package com.qapitol.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverManager {
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    // Set up WebDriver based on browser type and environment
    public static void setDriver(String browser) throws MalformedURLException {
        String executionEnv = "local" ;// Assume TestData holds the execution environment

        if ("remote".equalsIgnoreCase(executionEnv)) {
            // Remote WebDriver setup for Selenium Grid
            DesiredCapabilities capabilities = new DesiredCapabilities();
            switch (browser.toLowerCase()) {
                case "chrome":
                    capabilities.setBrowserName("chrome");
                    break;
                case "firefox":
                    capabilities.setBrowserName("firefox");
                    break;
                case "edge":
                    capabilities.setBrowserName("MicrosoftEdge");
                    break;
                default:
                    throw new IllegalArgumentException("Browser " + browser + " not supported for remote execution");
            }

            // URL of the Selenium Grid Hub
            String gridUrl = "http://192.168.2.103:4444";
            driver.set(new RemoteWebDriver(new URL(gridUrl), capabilities));

        } else {
            // Local WebDriver setup
            switch (browser.toLowerCase()) {
                case "chrome":
                    driver.set(new ChromeDriver());
                    break;
                case "firefox":
                    driver.set(new FirefoxDriver());
                    break;
                case "edge":
                    driver.set(new EdgeDriver());
                    break;
                default:
                    throw new IllegalArgumentException("Browser " + browser + " not supported for local execution");
            }
        }

        // Common WebDriver settings for both local and remote
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        getDriver().manage().window().maximize();
    }

    // Get the WebDriver instance for the current thread
    public static WebDriver getDriver() {
        return driver.get();
    }

    // Clean up WebDriver instance for the current thread
    public static void removeDriver() {
        if (driver.get() != null) {
            driver.get().quit();
            driver.remove();
        }
    }
}
