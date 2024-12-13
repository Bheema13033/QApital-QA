package Baseclass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class Baseclass {
public WebDriver driver;



@BeforeClass
    public void base() throws IOException {
        FileReader file = new FileReader("C:\\Users\\Qapitol\\IdeaProjects\\Pagefactory\\src\\test\\resources\\testdata.properties");
        Properties p = new Properties();
        p.load(file);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get(p.getProperty("url"));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        /*JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollBy(133,488)", " ");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));*/


    }
}
