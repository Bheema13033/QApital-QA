package com.Qapitol.testcases;

import com.Qapitol.base.baseclass;
import com.Qapitol.pages.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class testcase extends baseclass {
    //WebDriver driver;
    @Test
    public  void testCase(){

        Textbox t = new Textbox(driver);
        t.textbox();
        checkbox c=new checkbox(driver);
        c.Checkbox();
        Radiobutton r1=new Radiobutton(driver);
        r1.radio();
        webtable w1=new webtable(driver);
        w1.Webtable();
        Buttons b1=new Buttons(driver);
        b1.buttons();
        Links l1=new Links(driver);
        l1.Link();
        BrokenLinks B1=new BrokenLinks(driver);
        B1.broken();
        UploadDownload u1=new UploadDownload(driver);
        u1.uploaddownload();
        Dynamic d1=new Dynamic(driver);
        d1.dynamic();




    }

}
