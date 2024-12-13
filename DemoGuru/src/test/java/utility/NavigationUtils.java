package utility;

import org.openqa.selenium.WebDriver;
public class NavigationUtils {

    public static void navigateTo(WebDriver driver, String url) {
        driver.get(url); // Navigate to the provided URL
    }
}
