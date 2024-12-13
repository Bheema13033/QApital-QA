package com.testcases;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class LoginPageTestCase {



    @Test(dataProvider = "loginData")
    public void testFacebookLogin(String username, String password) {
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://www.facebook.com/");
            WebElement emailField = driver.findElement(By.id("email"));
            WebElement passwordField = driver.findElement(By.id("pass"));
            WebElement loginButton = driver.findElement(By.name("login"));
            emailField.sendKeys(username);
            passwordField.sendKeys(password);
            loginButton.click();
            Thread.sleep(5000);
            WebElement profileIcon = driver.findElement(By.cssSelector("a[aria-label='Account']"));
            Assert.assertTrue(profileIcon.isDisplayed(), "Login failed for user: " + username);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            driver.quit();
        }
    }

    @DataProvider(name = "loginData")
    public Object[][] getLoginData() throws IOException {

        String filePath = "C:\\Users\\Qapitol\\Downloads\\Book 1 (3).xlsx";


        FileInputStream fis = new FileInputStream(new File(filePath));
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheetAt(0);


        int rowCount = sheet.getPhysicalNumberOfRows();
        int colCount = sheet.getRow(0).getPhysicalNumberOfCells();

        Object[][] loginData = new Object[rowCount - 1][colCount];


        for (int i = 1; i < rowCount; i++) {
            Row row = sheet.getRow(i);
            for (int j = 0; j < colCount; j++) {
                loginData[i - 1][j] = row.getCell(j).getStringCellValue();
            }
        }
        workbook.close();
        fis.close();

        return loginData;
    }
}
