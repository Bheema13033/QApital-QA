package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    // Locators for Home page elements
    private By logoutButton = By.xpath("//a[text()='Log out']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLogoutButton() {
        driver.findElement(logoutButton).click();
    }
}
