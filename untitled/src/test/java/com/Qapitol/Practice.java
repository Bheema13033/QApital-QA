package com.Qapitol;

import org.testng.annotations.*;

public class Practice {
    @Test
    public void some3(){
        System.out.println(" test ");

    }
    @AfterMethod
    public void some4() {
        System.out.println(" after method");

    }
    @AfterClass
    public void some5() {
        System.out.println("after  class");

    }
    @AfterTest
    public void some8() {
        System.out.println("after test ");

    }
    @AfterSuite
    public void some6() {
        System.out.println("after test suite");

    }
    @BeforeSuite
    public void some(){
        System.out.println("before test suite");
    }
    @BeforeTest
    public void some7() {
        System.out.println("before test ");

    }
    @BeforeClass
    public void some1(){
        System.out.println("before test class");
    }
    @BeforeMethod
    public void some2(){
        System.out.println("before test method");
    }



}
