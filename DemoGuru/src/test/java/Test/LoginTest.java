package Test;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void testValidLogin() {
        // Instantiate Login Page
        LoginPage loginPage = new LoginPage(driver);

        // Login with valid credentials
        loginPage.enterUsername("mngr");
        loginPage.enterPassword("12345");
        loginPage.clickLogin();

        // Validate Home Page
        HomePage homePage = new HomePage(driver);
        String welcomeText = homePage.getWelcomeMessage();
        Assert.assertTrue(welcomeText.contains("Welcome To Manager's Page of Guru99 Bank"), "Login failed!");
    }
}
