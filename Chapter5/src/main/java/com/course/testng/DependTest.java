package com.course.testng;

import org.testng.annotations.Test;

public class DependTest {

    @Test
    public void test1(){
        System.out.println("test1 run");
        throw new RuntimeException();   //抛出异常
    }

    /*
    * 依赖测试：当被依赖的用例执行失败时，依赖测试用例不执行
    * */
    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2 run");
    }
}
