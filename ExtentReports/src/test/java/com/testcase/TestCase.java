package com.testcase;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.extentreports.ExtentReports1;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestCase {
    ExtentReports1 ExtentReports1;

    ExtentReports extent = new ExtentReports();
    ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");

    public final static Logger logger = LogManager.getLogger(TestCase.class);
    @BeforeTest
    public void setUp() {

        spark.config().setTheme(Theme.DARK);
        spark.config().setDocumentTitle("Extent reports");
        extent.attachReporter(spark);


        ExtentReports1 = new ExtentReports1();
    }

    @Test
    public void loginTest() throws IOException, InterruptedException {
        ExtentTest test = extent.createTest("Login facebook").assignAuthor("Bheema")
                .assignCategory("Automation Test").assignDevice("Window");

        test.info("Initilization Login Functionality");

        String filePath = "src/test/resources/Book (7).xlsx";
        logger.debug("Executed login test");
        test.info("Executed login test");
        ExtentReports1.service(filePath);
        Thread.sleep(3000);
    }

    @AfterTest
    public void afterTest() throws IOException {

        extent.flush();
        ExtentReports1.tearDown();
    }
}
