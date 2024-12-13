package testcases;

import com.orangehrm.base.BaseTest;
import com.orangehrm.pages.AdminPage;
import com.orangehrm.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AdminTests extends BaseTest {

    private LoginPage loginPage;
    private AdminPage adminPage;

    @BeforeTest
    public void setUp() {
        initilizer();
        loginPage = new LoginPage(driver);
        adminPage = new AdminPage(driver);
    }

    @Test(priority = 1)
    public void verifyLogin() {
        loginPage.login();
       // Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"),
              //  "Login failed: Dashboard page did not load.");
    }

    @Test(priority = 2)
    public void verifyEditGeneralInfo() throws InterruptedException {
        adminPage.navigateToOrganization();
        adminPage.navigateToGeneralInfo();
        adminPage.editGeneralInfo("Qapitol", "747029", "8088981395", "8088981395", "bheema13033@gmail.com", "123 Koramangala", "New York");
    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
