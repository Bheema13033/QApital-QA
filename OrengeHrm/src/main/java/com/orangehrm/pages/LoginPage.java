package com.orangehrm.pages;

import com.orangehrm.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseTest {


    private WebDriver driver;

    @FindBy(xpath = "//input[@placeholder='Username']")
    private WebElement userNameField;

    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginButton;

    // Constructor to initialize the page
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);  // Initialize the elements using PageFactory
    }

    public void login() {
        userNameField.sendKeys(prop.getProperty("username"));
        passwordField.sendKeys(prop.getProperty("password"));
        loginButton.click();
    }
}
