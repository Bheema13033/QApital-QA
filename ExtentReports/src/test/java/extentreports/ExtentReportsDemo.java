package extentreports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.poi.xslf.usermodel.XSLFTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExtentReportsDemo {
    public static void main(String[] args) {
        ExtentSparkReporter sparkReporter=new ExtentSparkReporter("extent.spark");
        ExtentReports extent=new ExtentReports();
        extent.attachReporter(sparkReporter);
        ExtentTest test1=extent.createTest("google search test one","this is test to valiadte google functinlaity");
        WebDriver driver=new ChromeDriver();
        test1.info("lunching browser");
        test1.log(Status.INFO,"lunching beowser");
        driver.get("https://www.google.co.in/");
        test1.pass("navigated to google page");
        driver.findElement(By.name("q")).sendKeys("jsw steel");
        test1.pass("enter text in searchbox");
        driver.findElement(By.name("btnK")).click();
        driver.close();
        extent.flush();
    }
}