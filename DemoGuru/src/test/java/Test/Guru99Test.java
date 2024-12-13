package Test;
import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.NavigationUtils;

public class Guru99Test extends BaseTest {

    @Test
    public void testFlashTestingPage() {
        NavigationUtils.navigateTo(driver, "https://demo.guru99.com/test/flash-testing.html");
        Assert.assertTrue(driver.getTitle().contains("Flash Movie Demo"),
                "Expected title to contain 'Flash Movie Demo'");
    }

    @Test
    public void testRadioButtons() {
        NavigationUtils.navigateTo(driver, "https://demo.guru99.com/test/radio.html");
        driver.findElement(By.id("vfb-7-1")).click(); // Select radio button 1
        driver.findElement(By.id("vfb-7-2")).click(); // Select radio button 2
        Assert.assertTrue(driver.findElement(By.id("vfb-7-2")).isSelected(),
                "Radio Button 2 should be selected");
    }

    @Test
    public void testTableContent() {
        NavigationUtils.navigateTo(driver, "https://demo.guru99.com/test/table.html");
        String cellValue = driver.findElement(By.xpath("//table/tbody/tr[2]/td[3]")).getText();
        Assert.assertEquals(cellValue, "Third Row / Third Column",
                "Unexpected value in the table cell");
    }

    @Test
    public void testAjaxForm() {
        NavigationUtils.navigateTo(driver, "https://demo.guru99.com/test/ajax.html");
        driver.findElement(By.id("yes")).click(); // Select 'Yes' radio button
        driver.findElement(By.name("buttoncheck")).click(); // Click Check button
        String response = driver.findElement(By.className("radiobutton")).getText();
        Assert.assertTrue(response.contains("Yes"), "Expected response to contain 'Yes'");
    }

    @Test
    public void testDeleteCustomer() {
        NavigationUtils.navigateTo(driver, "https://demo.guru99.com/test/delete_customer.php");
        driver.findElement(By.name("cusid")).sendKeys("12345"); // Enter customer ID
        driver.findElement(By.name("submit")).click(); // Submit
        // Handle alert
        String alertText = driver.switchTo().alert().getText();
        Assert.assertTrue(alertText.contains("Do you really want to delete this Customer?"));
        driver.switchTo().alert().accept(); // Accept the alert
    }

    @Test
    public void testYahooLink() {
        NavigationUtils.navigateTo(driver, "https://demo.guru99.com/test/yahoo.html");
        driver.findElement(By.id("messenger-download")).click();
        // Validate navigation or file download behavior
        Assert.assertTrue(driver.getCurrentUrl().contains("yahoo"),
                "Expected to be on Yahoo download page");
    }

    @Test
    public void testTooltip() {
        NavigationUtils.navigateTo(driver, "https://demo.guru99.com/test/tooltip.html");
        String tooltipText = driver.findElement(By.id("download_now")).getAttribute("title");
        Assert.assertEquals(tooltipText, "What's new in 3.2", "Tooltip text did not match");
    }

    @Test
    public void testFileUpload() {
        NavigationUtils.navigateTo(driver, "https://demo.guru99.com/test/upload/");
        driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\path\\to\\your\\file.txt");
        driver.findElement(By.id("terms")).click(); // Agree to terms
        driver.findElement(By.id("submitbutton")).click(); // Submit
        String response = driver.findElement(By.id("res")).getText();
        Assert.assertTrue(response.contains("successfully"), "Expected upload to succeed");
    }

    @Test
    public void testDragAndDrop() {
        NavigationUtils.navigateTo(driver, "https://demo.guru99.com/test/drag_drop.html");
        Actions actions = new Actions(driver);
        actions.dragAndDrop(
                driver.findElement(By.id("credit2")),
                driver.findElement(By.id("bank"))
        ).perform(); // Drag 'BANK' to Debit Side
        String debitText = driver.findElement(By.id("t7")).getText();
        Assert.assertEquals(debitText, "BANK", "Expected BANK in Debit column");
    }

    @Test
    public void testCookieLogin() {
        NavigationUtils.navigateTo(driver, "https://demo.guru99.com/test/cookie/selenium_aut.php");
        driver.findElement(By.name("username")).sendKeys("guru99");
        driver.findElement(By.name("password")).sendKeys("guru99");
        driver.findElement(By.name("submit")).click();
        // Validate login
        Assert.assertTrue(driver.getPageSource().contains("Successfully Logged in"));
    }
}

