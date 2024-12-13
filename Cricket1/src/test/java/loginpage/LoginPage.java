package loginpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    @FindBy(id="email")
    WebElement username;

    @FindBy(id="pass")
    WebElement password;

    @FindBy(name="login")
    WebElement loginButton;

    public LoginPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void enterdetails(String email,String pass) {
        username.sendKeys(email);
        password.sendKeys(pass);
    }
    public void button() {
        loginButton.click();
    }



}
