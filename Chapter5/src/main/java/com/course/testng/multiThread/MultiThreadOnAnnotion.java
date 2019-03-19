package com.course.testng.multiThread;

import org.testng.annotations.Test;

public class MultiThreadOnAnnotion {

    @Test(invocationCount = 10,threadPoolSize = 3)
    // invocationCount = 10表示开10个线程，threadPoolSize = 3表示开3个线程池
    public void test1(){
        System.out.println(1);
        System.out.printf("Thread Id: %s%n",Thread.currentThread().getId());
    }
}
