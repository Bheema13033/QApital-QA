package testcase;

import Baseclass.Baseclass;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import searchpage.searchPage;

import java.io.IOException;

public class testcase extends Baseclass {
   // WebDriver driver;


  @Test
    public void SearchText() throws InterruptedException, IOException {

    //  Baseclass b1=new Baseclass();
     // b1.base();
      searchPage s=new searchPage(driver);
      s.searchContext();
      Thread.sleep(2000);
      s.validateProduct();
  }
}
