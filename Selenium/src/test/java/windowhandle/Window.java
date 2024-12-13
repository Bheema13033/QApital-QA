package windowhandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Window {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        Thread.sleep(3000);
        String parentWindwoHandle= driver.getWindowHandle();
        System.out.println(parentWindwoHandle+driver.getTitle());
        driver.findElement(By.id("newWindowBtn")).click();
        Thread.sleep(3000);
        Set<String> WindowHAndles=driver.getWindowHandles();
        for (String windowHandle : WindowHAndles){
            if (!windowHandle.equals(parentWindwoHandle)){
                driver.switchTo().window(windowHandle);
                driver.manage().window().maximize();
driver.findElement(By.id("firstName")).sendKeys("bheema");
Thread.sleep(3000);
driver.close();

            }
           // System.out.println(windowHandle+driver.getTitle());


        }
        driver.switchTo().window(parentWindwoHandle);
        driver.findElement(By.id("name")).sendKeys("bheema");
        Thread.sleep(3000);
driver.quit();

    }
}
