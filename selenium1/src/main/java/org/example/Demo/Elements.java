package org.example.Demo;

import org.example.facebook.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Elements extends Baseclass {
     WebDriver driver;
     public Elements(WebDriver driver){
         driver.findElement(By.xpath(""))
         driver.findElement(By.xpath("//input[@id=\"userName\"]")).sendKeys("bheema13033");
         driver.findElement(By.xpath("//input[@id=\"userEmail\"]")).sendKeys("bheema13033@gmail.com");
         driver.findElement(By.xpath("//input[@id=\"currentAddress\"]")).sendKeys("Ballari");
         driver.findElement(By.xpath("//input[@id=\"permanentAddress\"]")).sendKeys();
     }
}
