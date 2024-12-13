package com.PageFactory.pages;

import com.PageFactory.baseclass.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends BaseTest {

    // Initialize the elements using PageFactory
    public SearchPage() {
        PageFactory.initElements(driver, this);
    }

    // Search bar element
    @FindBy(name = "q")
    private WebElement searchBox;

    // Search button element
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement searchButton;

    // Method to perform search
    public void searchForProduct(String productName) {
        searchBox.sendKeys(productName);
        searchButton.click();
    }
}
