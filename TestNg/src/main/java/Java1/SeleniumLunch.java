package Java1;

import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class SeleniumLunch {
    @Test
    public void Lunch(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.jsw.in/");
        driver.navigate().to("https://www.jswsteel.in/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.close();


    }
}
