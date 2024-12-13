package Test;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AgileLoginPage;
import pages.InsuranceLoginPage;
import pages.NewToursLoginPage;
import pages.TelecomHomePage;
import utility.NavigationUtils;

public class GuruTest extends BaseTest {

    @Test
    public void testInsuranceLogin() {
        NavigationUtils.navigateTo(driver, "https://demo.guru99.com/insurance/v1/index.php");

        InsuranceLoginPage insuranceLoginPage = new InsuranceLoginPage(driver);
        insuranceLoginPage.login("testuser@guru99.com", "password123");

        Assert.assertTrue(driver.getTitle().contains("Insurance Broker System"),
                "Expected title to contain 'Insurance Broker System'");
    }

    @Test
    public void testAgileProjectLogin() {
        NavigationUtils.navigateTo(driver, "https://demo.guru99.com/Agile_Project/Agi_V1/");

        AgileLoginPage agileLoginPage = new AgileLoginPage(driver);
        agileLoginPage.login("mngr123", "password123");

        Assert.assertTrue(driver.getTitle().contains("Agile Project"),
                "Expected title to contain 'Agile Project'");
    }

    @Test
    public void testTelecomHomePage() {
        NavigationUtils.navigateTo(driver, "https://demo.guru99.com/telecom/index.html");

        TelecomHomePage telecomHomePage = new TelecomHomePage(driver);
        Assert.assertTrue(telecomHomePage.getTitle().contains("Telecom"),
                "Expected title to contain 'Telecom'");
    }

    @Test
    public void testNewToursLogin() {
        NavigationUtils.navigateTo(driver, "https://demo.guru99.com/test/newtours/");

        NewToursLoginPage newToursLoginPage = new NewToursLoginPage(driver);
        newToursLoginPage.login("mercury", "mercury");

        // Validate title
        Assert.assertTrue(driver.getTitle().contains("Find a Flight"),
                "Expected title to contain 'Find a Flight'");
    }
}
