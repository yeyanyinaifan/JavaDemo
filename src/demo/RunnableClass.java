package demo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RunnableClass implements Runnable {
    private int ticket = 100;
    private static int ticketStatic = 100;

    Object obj = new Object();
    Lock lock = new ReentrantLock();
    @Override
    public void run() {
        // 同步锁
//        synchronized (obj) {
//            while (this.ticket > 0) {
//                try {
//                    Thread.sleep(10);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(Thread.currentThread().getName() + "正在卖第" + this.ticket + "张票");
//                this.ticket--;
//            }
//        }

//        // 同步方法
//        while (this.ticket > 0) {
//            this.sellKicket();
//        }

//        // 同步静态方法
//        while (ticketStatic > 0) {
//            sellKicketStatic();
//        }

        //Lock锁
        while (this.ticket > 0) {
            lock.lock();
            if (this.ticket > 0) {
                try {
                    Thread.sleep(10);
                    System.out.println(Thread.currentThread().getName() + "正在卖第" + this.ticket + "张票");
                    this.ticket--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            lock.unlock();
        }
    }

    public synchronized void sellKicket() {
        if (this.ticket > 0) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "正在卖第" + this.ticket + "张票");
            this.ticket--;
        }
    }

    public static synchronized void sellKicketStatic() {
        if (ticketStatic > 0) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "正在卖第" + ticketStatic + "张票");
            ticketStatic--;
        }
    }
}
