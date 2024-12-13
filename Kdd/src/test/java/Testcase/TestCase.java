package Testcase;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.keyEngine.KeyEngine;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestCase {
    KeyEngine keyEngine;

    ExtentReports extent = new ExtentReports();
    ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");

    public final static Logger logger = LogManager.getLogger(TestCase.class);
    @BeforeTest
    public void setUp() {

        spark.config().setTheme(Theme.DARK);
        spark.config().setDocumentTitle("Keyword Driven Framework");
        extent.attachReporter(spark);


        keyEngine = new KeyEngine();
    }

    @Test
    public void loginTest() throws IOException, InterruptedException {
        ExtentTest test = extent.createTest("Login facebook").assignAuthor("Bheema")
                .assignCategory("Automation Test").assignDevice("Window");

        test.info("Initilization Login Functionality");

        String filePath = "src/test/resources/Book (2).xlsx";
        logger.debug("Executed login test");
        test.info("Executed login test");
        keyEngine.service(filePath);
        Thread.sleep(3000);
    }

    @AfterTest
    public void afterTest() throws IOException {

        extent.flush();
        keyEngine.tearDown();
    }
}
