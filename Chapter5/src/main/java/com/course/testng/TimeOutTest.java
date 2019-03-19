package com.course.testng;

import org.testng.annotations.Test;

public class TimeOutTest {

    @Test(timeOut = 3000)  // 设置超时时长期望为三千毫秒，单为是毫秒值，及3秒
    public void testSuccess() throws InterruptedException {
        Thread.sleep(2000);

    }

    @Test(timeOut = 2000)  // 设置超时时长期望为二千毫秒，单为是毫秒值，及2秒
    public void testFailed() throws InterruptedException {
        Thread.sleep(3000);   // 期望在两千毫秒内完成，而实际上睡了三千毫秒，即超时

    }
}
