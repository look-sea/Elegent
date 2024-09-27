package com.itheima1.thread.security.demo1;

//线程任务类
public class Ticket implements Runnable {
    //成员变量（电影票数）
    private int ticketCount = 100;//有100张电影票

    @Override
    public void run() {
        //模拟卖票
        while (true) {
            if (ticketCount > 0) {
                // 模拟出票的时间
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName() + " 出售票号：" + ticketCount);
                ticketCount--;
            }
            if (ticketCount == 0) {
                break;
            }
        }
    }
}
