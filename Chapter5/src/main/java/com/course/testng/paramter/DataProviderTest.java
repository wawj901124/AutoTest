package com.course.testng.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {

    @Test(dataProvider = "data")  // 两个名字都是一样(data),才能传参
    public void testDataProvider(String name, int age, String address){
        System.out.println("name = " + name +"; age=" + age + "; address=" + address );

    }

    @DataProvider(name = "data")  // 两个名字都是一样(data),才能传参
    public Object[][] providerData(){
        Object[][] o = new Object[][]{
                {"zhangsan",10,"beijing"},
                {"lisi",20,"tianjin"},
                {"wangwu",30,"shanghai"}

        };

        return o;  //返回数据
    }

    @Test(dataProvider = "methodData")
    public void test1(String name, int age,String address){
        System.out.println("test1方法：name = " + name +"; age=" + age + "; address=" + address );
    }

    @Test(dataProvider = "methodData")
    public void test2(String name, int age,String address){
        System.out.println("test2方法：name = " + name +"; age=" + age + "; address=" + address );
    }

    @DataProvider(name="methodData")
    public Object[][] methodDataTest(Method method){
        Object[][] result = null;

        if(method.getName().equals("test1")){  //如果method的名字为test1则运行以下程序
            result = new Object[][]{
                    {"zhangsan",20,"beijing"},
                    {"lisi",25,"tianjin"}

            };

        }else if(method.getName().equals("test2")){ //如果method的名字为test2则运行以下程序
            result = new Object[][]{
                    {"wangwu",50,"beijing"},
                    {"zhaoliu",60,"tianjin"}

            };
        }

        return  result;  // 返回结果

    }
}
