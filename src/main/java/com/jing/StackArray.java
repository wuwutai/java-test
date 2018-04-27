/************************************************************************************
 * Created at 2018/4/2 0002                                                                                 
 * 有贝科技                                                                      
 *
 * 项目名称：数据中心体系v2.0                                                          
 * 版权说明：本软件属有贝科技所有，在未获得有贝科技正式授权情况下，任何企业和   
 *			 个人，不能获取、阅读、安装、传播本软件涉及的任何受知识产权保护的    
 *			 内容。                            
 ************************************************************************************/
package com.jing;

import java.util.EmptyStackException;

/**
 * @author JING
 * @version 2.0
 * @Package com.jing
 * @Description: (这里用一句话描述这个类的作用)
 * @date 四月 02 2018,15:49
 */
public class StackArray {

    private int[] array;
    private int top;
    private static int size = 100;

    public StackArray(){
        array = new int[size];
        top = -1;

    }

    public void push(int element){
        if (top == size-1){
            throw new StackOverflowError();
        }else{
            array[++top] = element;
        }

    }

    public int pop(){
        if (top == -1){
            throw new EmptyStackException();
        }else {
            return array[top--];
        }
    }

    public boolean isEmpty(){
        return top == -1;
    }


}
