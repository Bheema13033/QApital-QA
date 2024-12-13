package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
   public WebDriver driver;

    @FindBy(xpath = "//input[@name='username']")
    WebElement usernameField;

    @FindBy(xpath = "//input[@name='password']")
    WebElement passwordField;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }





    public void login(String username,String password) {
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();

        }
    }
