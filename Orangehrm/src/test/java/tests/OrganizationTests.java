package tests;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;
//import Pages.DashboardPage;
import Pages.LoginPage;
//import Pages.OrganizationPage;
import utils.TestBase;

import java.io.File;
import java.io.IOException;

public class OrganizationTests extends TestBase {


    @Test
    public void verifyGeneralInformationPageLoads() throws IOException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("Admin", "admin123");
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destinationFile = new File("screenshot.png");
        FileUtils.copyFile(screenshot, destinationFile);

//
//        DashboardPage dashboardPage = new DashboardPage(driver);
//        dashboardPage.navigateToGeneralInformation();
//
//        OrganizationPage organizationPage = new OrganizationPage(driver);
//        Assert.assertTrue(organizationPage != null, "General Information page did not load!");
    }
//
//    @Test
//    public void verifyMandatoryFields() {
//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.login("Admin", "admin123");
//
//        DashboardPage dashboardPage = new DashboardPage(driver);
//        dashboardPage.navigateToGeneralInformation();
//
//        OrganizationPage organizationPage = new OrganizationPage(driver);
//        organizationPage.toggleEditMode();
//        organizationPage.enterOrganizationName("");
//        organizationPage.save();
//
//        Assert.assertTrue(driver.getPageSource().contains("Required"), "Validation error not displayed!");
//    }
//
//    @Test
//    public void verifyOrganizationNameAcceptsValidInput() {
//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.login("Admin", "admin123");
//
//        DashboardPage dashboardPage = new DashboardPage(driver);
//        dashboardPage.navigateToGeneralInformation();
//
//        OrganizationPage organizationPage = new OrganizationPage(driver);
//        organizationPage.toggleEditMode();
//        organizationPage.enterOrganizationName("QApitol");
//        organizationPage.save();
//
//        Assert.assertTrue(driver.getPageSource().contains("Successfully Saved"), "Data was not saved!");
//    }
//
//    // Repeat similar structure for other test cases
}
