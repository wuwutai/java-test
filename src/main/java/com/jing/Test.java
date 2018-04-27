/************************************************************************************
 * Created at 2018/4/4 0004                                                                                 
 * 有贝科技                                                                      
 *
 * 项目名称：数据中心体系v2.0                                                          
 * 版权说明：本软件属有贝科技所有，在未获得有贝科技正式授权情况下，任何企业和   
 *			 个人，不能获取、阅读、安装、传播本软件涉及的任何受知识产权保护的    
 *			 内容。                            
 ************************************************************************************/
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
