package extentreport2;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Extentreports2 {
    public WebDriver driver;


    @BeforeTest
    public void setup(){
    ExtentSparkReporter sparkReporter=new ExtentSparkReporter("extent.spark");
    extent=new ExtentReports();
    extent.attachReporter(sparkReporter);



    }
    @BeforeTest
    public void setupTest(){
        WebDriver driver=new ChromeDriver();

    }
    @Test
    public void test(){

        ExtentTest test1=extent.createTest("google search test one","this is test to valiadte google functinlaity");
        driver.get("https://www.google.co.in/");

        test1.info("lunching browser");
        test1.log(Status.INFO,"lunching beowser");
        test1.pass("navigated to google page");
        driver.findElement(By.name("q")).sendKeys("jsw steel");
        test1.pass("enter text in searchbox");


    }
    @AfterTest
    public void teardown(){
    driver.close();


    }
}
