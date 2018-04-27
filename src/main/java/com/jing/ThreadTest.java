package com.jing;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author JING
 * @version 2.0
 * @Package com.jing
 * @Description: (这里用一句话描述这个类的作用)
 * @date 四月 23 2018,9:42
 */
public class ThreadTest {


    public static ExecutorService executorService;

    static {
        executorService = Executors.newFixedThreadPool(2);
    }

    public static void main(String[] args) {

        Runtime.getRuntime().addShutdownHook(new Thread(
                ()->  shutdown()
        ));

        System.out.println("主线程执行开始");
        System.out.println("executorService start:"+executorService);
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("主线程执行完毕");
        System.out.println("主线程 enddd:"+executorService);
    }

    public static void shutdown(){
        if (executorService != null){
            executorService.shutdown();
            System.out.println("线程池在关闭");
        }

        System.out.println("executorService enddd:"+executorService);
    }

}
