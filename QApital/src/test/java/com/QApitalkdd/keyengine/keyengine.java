package com.QApitalkdd.keyengine;

import com.QApitalkdd.utility.utility;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class keyengine {
    public static WebDriver driver;
    public void service(String filePath) throws IOException {
        XSSFSheet sheet= utility.readExcel(filePath);
        for (Row row: sheet){
            String keyword=row.getCell(0).getStringCellValue();
            String locatorType=row.getCell(1).getStringCellValue();
            String locatorVal=row.getCell(2).getStringCellValue();
            String data=row.getCell(3).getStringCellValue();

            switch (keyword){
                case "OpenBrowser":
                    if(data.equalsIgnoreCase("edge")){
                        driver=new EdgeDriver();
                    }else {
                        driver=new ChromeDriver();
                    }
                    break;
                case "navigate":
                    System.out.println("Navigate to" +data);
                    driver.get(data);
                    driver.manage().window().maximize();
                    break;
                case "EnterText":
                    getElement(locatorType,locatorVal).sendKeys(data);
                    break;
                case "click":
                    getElement(locatorType,locatorVal).click();
                    break;
                case "NA":
                    break;
                default:
                    System.out.println("Invalid keyword:" +keyword);
            }
        }
    }

    private WebElement getElement(String locatorType, String locatorVal) {
        WebElement element=null;
        switch (locatorType){
            case "xpath":
                element=driver.findElement(By.xpath(locatorVal));
                break;
            case "id":
                element=driver.findElement(By.id(locatorVal));
                break;
            case "name":
                element=driver.findElement(By.name(locatorVal));
                break;
            case "NA":
                break;
            default:
                System.out.println("Invalid locator Type"+ locatorType);

        }
        return element;

    }
    public void tearDown(){
        driver.quit();
    }

}
