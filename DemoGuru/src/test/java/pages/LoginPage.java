package pages;

import Base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseTest {
    WebDriver driver;

    @FindBy(id = "email")
    private WebElement unTB;

    @FindBy(id = "password")
    private WebElement pwTB;

    @FindBy(xpath = "//button[@id='SubmitLogin']")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterUsername(String username) {
        unTB.sendKeys();
    }

    public void enterPassword(String password) {
        pwTB.sendKeys(password);
    }

    public void clickLogin() {
        loginButton.click();
    }
}
