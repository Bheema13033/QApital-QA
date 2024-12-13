package org.example.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login extends Baseclass {
    WebDriver driver;
    public Login(WebDriver driver){
        this.driver=driver;

    }
    public void login(){
        driver.findElement(By.xpath("////input[@id=\"email\"]"));
        driver.findElement(By.xpath("//input[@id=\"pass\"]"));
        driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
    }

}
