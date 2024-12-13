package test;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.HomePage;

public class LoginTest extends BaseTest {

    @Test(priority = 1)
    public void testValidLogin() {
     //   driver.get("https://demo.guru99.com");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("valid_username", "valid_password");

        // After login, check if the home page is displayed or if logout button exists
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(driver.findElement(By.xpath("//a[text()='Log out']")).isDisplayed(), "Logout button not found.");
    }

    @Test(priority = 2)
    public void testInvalidLogin() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("invalid_username", "invalid_password");

        // Validate error message
        String errorMessage = loginPage.getErrorMessage();
        Assert.assertTrue(errorMessage.contains("Invalid credentials"), "Error message not found.");
    }
}
