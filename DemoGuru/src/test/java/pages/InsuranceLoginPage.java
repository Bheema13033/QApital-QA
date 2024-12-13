package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsuranceLoginPage {
    WebDriver driver;

    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(name = "submit")
    private WebElement loginButton;

    public InsuranceLoginPage(WebDriver driver) {

        this.driver = driver;

        PageFactory.initElements(driver, this);

    }

    public void login(String email, String password) {

        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        loginButton.click();
    }
}
