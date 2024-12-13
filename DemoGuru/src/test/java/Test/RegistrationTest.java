package Test;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RegistrationPage;

public class RegistrationTest extends BaseTest {

    @Test(priority = 1)
    public void testRegistration() {
        driver.get("https://demo.guru99.com/test/register.php");

        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.register("John", "Doe", "john.doe@example.com", "1234567890", "123 Street", "New York");

        // Verify successful registration (This could be a confirmation message, URL, etc.)
        String successMessage = driver.findElement(By.xpath("//h3[contains(text(),'Your registration has been successfully completed!')]")).getText();
        Assert.assertTrue(successMessage.contains("Your registration has been successfully completed!"), "Registration failed.");
    }
}
