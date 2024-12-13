package com.PageFactory.testcase;

import com.PageFactory.baseclass.BaseTest;
import com.PageFactory.pages.SearchPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class SearchTest extends BaseTest {

    private SearchPage searchPage;

    @BeforeMethod
    public void setUp() {
        super.setup();
        searchPage = new SearchPage();
    }

    @Test
    public void testProductSearch() {
        searchPage.searchForProduct("laptop");



    @AfterMethod
    public void cleanUp() {
        super.tearDown();  // Cleanup after the test
    }
}
