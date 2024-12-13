package com.package1;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.utlity.Utility;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvideAssessment {

    @Test(dataProvider = "registrationData")
    public void registerUser(String email, String password) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("http://139.59.27.246:3000/register?redirect=/");
        driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.id("userNameOrEmail")).sendKeys(email);
        driver.findElement(By.id("password")).sendKeys(password);

        driver.findElement(By.xpath("//button[@type='submit']")).click();

        Thread.sleep(5000);

        driver.quit();

    }
    @DataProvider(name = "registrationData")
    public Iterator<Object[]> registrationData() throws IOException {
        Utility excel = new Utility("Book 1 (1).xlsx");
        int rowCount = excel.getRowCount();
        int columnCount = excel.getColumnCount();

        Set<Object[]> data = new HashSet<>();

        for (int i = 1; i < rowCount; i++) {
            Object[] rowData = new Object[columnCount];

            for (int j = 0; j < columnCount; j++) {
                rowData[j] = excel.getCellData(i, j);
            }

            data.add(rowData);
        }

        return data.iterator();
    }
}

