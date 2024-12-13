package com.QApitalkdd.testcase;


import com.QApitalkdd.keyengine.keyengine;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.apache.logging.log4j.LogManager;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.logging.Logger;

public class testcase {
    keyengine keyengine;
    ExtentReports extent=new ExtentReports();
    ExtentSparkReporter spark=new ExtentSparkReporter("src/test/Reports/Spark.html");
//    public final static Logger logger= (Logger) LogManager.getLogger(testcase.class);
   @BeforeTest
    public void setup(){
        spark.config().setTheme(Theme.DARK);
        spark.config().setDocumentTitle("Keyword driven framework");
        extent.attachReporter(spark);
        keyengine =new keyengine();
    }
    @Test
    public void Testcase() throws IOException {
        ExtentTest test= extent.createTest("Login instagram").assignAuthor("bheema").assignCategory("Automation").assignDevice("window");
        test.info("initilization functions");
        String filePath="./src/test/resources/Book (1).xlsx";
//        logger.debug("executed");
        test.info("executed login ");
        keyengine.service(filePath);
    }
    @AfterTest
    public void afterTest(){
        extent.flush();
        keyengine.tearDown();
    }

      }



