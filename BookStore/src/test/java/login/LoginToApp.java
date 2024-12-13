package login;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

public class LoginToApp{
    @DataProvider(name = "LoginPage")
    public Object[][] getData() throws IOException {
        FileInputStream f=new FileInputStream("C:\\Users\\Qapitol\\IdeaProjects\\BookStore\\file\\Book 2.xlsx");
        Workbook w= WorkbookFactory.create(f);
        Sheet s= w.getSheet("Sheet1");

        int row = s.getPhysicalNumberOfRows();
        int col = s.getRow(0).getPhysicalNumberOfCells();
        Object[][] data = new Object[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                data[i][j]=s.getRow(i).getCell(j).toString();
            }

        }
        return data;
    }
    @Test(dataProvider = "LoginPage")
    public void Login(String email, String password)
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://139.59.27.246:3000/login");
        driver.findElement(By.id("userNameOrEmail")).sendKeys(email);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.close();
    }
}