package searchpage;

import Baseclass.Baseclass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;
import java.util.Locale;

public class searchPage extends Baseclass {
    WebDriver driver;

    public searchPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(name="q")
    WebElement searchText;
    @FindBy(xpath = "//button[contains(@title,'Search for Products')]")
    WebElement searchButton;
    @FindBy(css=".KzDlHZ")
    List<WebElement> products;


    public void searchContext(){
        searchText.clear();
        searchText.sendKeys("iphone");
        searchButton.click();



    }

    public void validateProduct(){

        for(WebElement eachProduct: products){

            String expected = eachProduct.getText().toLowerCase();

            String actual = "iphone";

            System.out.println(expected);
            Assert.assertTrue(expected.contains(actual),"No product is matching with: "+actual);

        }
    }

}
