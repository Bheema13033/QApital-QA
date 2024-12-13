package com.orangehrm.pages;

import com.orangehrm.base.BaseTest;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.concurrent.TimeUnit;

public class AdminPage extends BaseTest {
    public WebDriver driver;

    @FindBy(xpath = "//span[text()='Organization ']")
    private WebElement organizationMenu;

    @FindBy(xpath = "//a[text()='General Information']")
    private WebElement generalInfoOption;

    @FindBy(xpath = "//label[text()='Edit']")
    private WebElement editButton;

    @FindBy(xpath = "//div[@class='oxd-grid-item oxd-grid-item--gutters organization-name-container']//input[@class='oxd-input oxd-input--active']")
    private WebElement organizationNameField;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[3]")
    private WebElement registrationNumberField;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[4]")
    private WebElement phoneField;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[6]")
    private WebElement emailField;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[8]")
    private WebElement addressField;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[10]")
    private WebElement cityField;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement saveButton;



    public AdminPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void navigateToOrganization() {
        organizationMenu.click();
    }

    public void navigateToGeneralInfo() {
        generalInfoOption.click();
    }

    public void editGeneralInfo(String orgName, String regNum, String taxId, String phone, String email, String address, String city) throws InterruptedException {
        editButton.click();

        Thread.sleep(5000);
        organizationNameField.sendKeys(Keys.CONTROL + "a");
        organizationNameField.sendKeys(Keys.BACK_SPACE);
        organizationNameField.sendKeys(orgName);

        Thread.sleep(5000);

        registrationNumberField.sendKeys(Keys.CONTROL + "a");
        registrationNumberField.sendKeys(Keys.BACK_SPACE);
        registrationNumberField.sendKeys(regNum);
        Thread.sleep(5000);

        WebElement taxField = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
        taxField.clear();
        taxField.sendKeys(taxId);

        Thread.sleep(5000);
        phoneField.clear();
        phoneField.sendKeys(phone);

        Thread.sleep(5000);
        emailField.clear();
        emailField.sendKeys(email);

        Thread.sleep(5000);
        addressField.clear();
        addressField.sendKeys(address);

        Thread.sleep(5000);
        cityField.clear();
        cityField.sendKeys(city);

        Thread.sleep(5000);
        saveButton.click();

        Thread.sleep(3000);
        editButton.click();
        Thread.sleep(3000);
        editButton.click();




        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
