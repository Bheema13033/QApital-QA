//package Pages;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//public class OrganizationPage {
//    WebDriver driver;
//
//    @FindBy(id = "organization_name")
//    WebElement organizationNameField;
//
//    @FindBy(id = "organization_registrationNumber")
//    WebElement registrationNumberField;
//
//    @FindBy(id = "organization_taxId")
//    WebElement taxIdField;
//
//    @FindBy(id = "btnSave")
//    WebElement saveButton;
//
//    @FindBy(id = "btnCancel")
//    WebElement cancelButton;
//
//    @FindBy(id = "editModeToggle")
//    WebElement editModeToggle;
//
//    public OrganizationPage(WebDriver driver) {
//        this.driver = driver;
//        PageFactory.initElements(driver, this);
//    }
//
//    public void toggleEditMode() {
//        editModeToggle.click();
//    }
//
//    public void enterOrganizationName(String name) {
//        organizationNameField.clear();
//        organizationNameField.sendKeys(name);
//    }
//
//    public void enterRegistrationNumber(String regNumber) {
//        registrationNumberField.clear();
//        registrationNumberField.sendKeys(regNumber);
//    }
//
//    public void enterTaxId(String taxId) {
//        taxIdField.clear();
//        taxIdField.sendKeys(taxId);
//    }
//
//    public void save() {
//        saveButton.click();
//    }
//
//    public void cancel() {
//        cancelButton.click();
//    }
//}
