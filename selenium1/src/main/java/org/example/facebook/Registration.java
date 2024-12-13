package org.example.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Registration extends Baseclass {
    WebDriver driver;
    public Registration(WebDriver driver){
        this.driver=driver;
    }

    public void registraion(){
        driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
        driver.findElement(By.xpath("//input[@name=\"lastname\"]"));
        WebElement Elementday=driver.findElement(By.xpath("//select[@name=\"birthday_day\"]"));
        Select s1=new Select(Elementday);
        s1.selectByValue("18");
        WebElement Elementmonth=driver.findElement(By.xpath("//select[@name=\"birthday_month\"]"));
        Select s2=new Select(Elementmonth);
        s2.selectByVisibleText("Feb");
        WebElement Elementyear=driver.findElement(By.xpath("//select[@name=\"birthday_year\"]"));
        Select s3=new Select(Elementyear);
        s3.selectByValue("1996");



    }

}
