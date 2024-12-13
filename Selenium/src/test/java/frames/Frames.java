package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
        Thread.sleep(3000);
        driver.findElement(By.id("name")).sendKeys("text1");
        driver.switchTo().frame("frm1");
        WebElement Element=driver.findElement(By.id("course"));
        Select CourseName=new Select(Element);
        CourseName.selectByVisibleText("Java");
        driver.switchTo().defaultContent();
        driver.findElement(By.id("name")).sendKeys("text2222");

        driver.switchTo().frame("frm2");
         driver.findElement(By.id("firstName")).sendKeys("bheema");

    }
}
