package com.itheima1.thread.demo7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Test1 {
    public static void main(String[] args) {
        //创建线程池对象（指定初始化的线程数量）
        ExecutorService es = Executors.newFixedThreadPool(3);

        //把线程任务，交给线程池执行
        es.submit( new StudentTask() );
        es.submit( new StudentTask() );
        es.submit( new StudentTask() );
        es.submit( new StudentTask() );
        es.submit( new StudentTask() );
    }
}
