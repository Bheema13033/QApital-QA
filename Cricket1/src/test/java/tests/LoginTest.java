package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import loginpage.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
   public  WebDriver driver;
    LoginPage loginpage;

    @BeforeMethod
    public void setup() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(3000);
        loginpage=new LoginPage(driver);
    }
    @Test
    public void test() throws InterruptedException {
        loginpage.enterdetails("tbheema102@gmail.com","Auc@16109");
        loginpage.button();
        Thread.sleep(5000);
    }
//    @AfterMethod
//    public void teardown() {
//        driver.close();
//    }

}
