package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {
    private WebDriver driver;

    // Locators for Registration form elements
    private By firstNameField = By.id("fname");
    private By lastNameField = By.id("lname");
    private By emailField = By.id("email");
    private By phoneField = By.id("phone");
    private By addressField = By.id("address");
    private By cityField = By.id("city");
    private By submitButton = By.id("submit");

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterFirstName(String firstName) {
        driver.findElement(firstNameField).sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void enterPhone(String phone) {
        driver.findElement(phoneField).sendKeys(phone);
    }

    public void enterAddress(String address) {
        driver.findElement(addressField).sendKeys(address);
    }

    public void enterCity(String city) {
        driver.findElement(cityField).sendKeys(city);
    }

    public void submitForm() {
        driver.findElement(submitButton).click();
    }

    public void register(String firstName, String lastName, String email, String phone, String address, String city) {
        enterFirstName(firstName);
        enterLastName(lastName);
        enterEmail(email);
        enterPhone(phone);
        enterAddress(address);
        enterCity(city);
        submitForm();
    }
}
