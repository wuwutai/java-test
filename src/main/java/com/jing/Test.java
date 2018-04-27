package com.jing;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author JING
 * @version 2.0
 * @Package com.jing
 * @Description: (这里用一句话描述这个类的作用)
 * @date 四月 04 2018,10:40
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
//        AtomicLong atomicLong = new AtomicLong(1);
//        System.out.println(atomicLong.getAndIncrement());
//        System.out.println(atomicLong.getAndIncrement());

        Test obj = new Test();
        obj.test();
        Thread.sleep(1000);
        System.out.println(obj.getCounter());
    }


    private final AtomicLong counter = new AtomicLong(0);

    public AtomicLong getCounter() {
        return counter;
    }

    public void test() {
        for (int i = 0; i < 500; i++) {
            new Thread(new Runnable() {
                public void run() {
                    counter.getAndIncrement();
                }
            }).start();
        }
    }
}
