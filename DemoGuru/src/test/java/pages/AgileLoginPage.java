package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AgileLoginPage {
    WebDriver driver;

    @FindBy(name = "uid")
    private WebElement usernameField;

    @FindBy(name = "password")
    private WebElement passwordField;

    @FindBy(name = "btnLogin")
    private WebElement loginButton;

    public AgileLoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void login(String username, String password) {

        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();
    }
}
