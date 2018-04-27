/************************************************************************************
 * Created at 2018/4/23 0023                                                                                 
 * 有贝科技                                                                      
 *
 * 项目名称：数据中心体系v2.0                                                          
 * 版权说明：本软件属有贝科技所有，在未获得有贝科技正式授权情况下，任何企业和   
 *			 个人，不能获取、阅读、安装、传播本软件涉及的任何受知识产权保护的    
 *			 内容。                            
 ************************************************************************************/
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
                ()-> { shutdown(); }
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
