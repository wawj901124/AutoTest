package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SuiteConfig {  //写测试套件之前运行的方法

    @BeforeSuite
    public void beforeSuit(){
        System.out.println("beforeSuit运行");
    }

    @AfterSuite
    public void afterSuit(){
        System.out.println("afterSuit运行");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTest运行");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("afterTest运行");
    }

}
