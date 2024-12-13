//package Pages;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//public class DashboardPage {
//    WebDriver driver;
//
//    @FindBy(id = "menu_admin_viewAdminModule")
//    WebElement adminMenu;
//
//    @FindBy(id = "menu_admin_Organization")
//    WebElement organizationMenu;
//
//    @FindBy(id = "menu_admin_viewOrganizationGeneralInformation")
//    WebElement generalInformationMenu;
//
//    public DashboardPage(WebDriver driver) {
//        this.driver = driver;
//        PageFactory.initElements(driver, this);
//    }
//
//    public void navigateToGeneralInformation() {
//        adminMenu.click();
//        organizationMenu.click();
//        generalInformationMenu.click();
//    }
//}
