/**
 * Java Thread 线程
 */

package com.ahri.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadPoolExecutor;

public class Threads {
    public static void main(String[] args) {
        // extends Thread
        AhriThread4 t1 = new AhriThread4();
        t1.start();

        // implements Runnable
        AhriThread2 t = new AhriThread2();
        Thread t2 = new Thread(t);
        t2.start();

        // implements Callable
        AhriThread3 t3 = new AhriThread3();
        FutureTask ft = new FutureTask<>(t3);
        new Thread(ft).start();
        try {
            Object s = ft.get();
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // use ThreadPool
        ExecutorService es = Executors.newFixedThreadPool(10);
        System.out.println(es.getClass());
        ThreadPoolExecutor tpe = (ThreadPoolExecutor) es;
        tpe.execute(new AhriThread2());
        tpe.submit(new AhriThread3());
        tpe.shutdown();

        // 使用匿名类
        Thread t5 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("niming");
            }
        });
        t5.start();
    }
}

class AhriThread4 extends Thread {
    @Override
    public void run() {
        System.out.println("AhriThread");
    }
}

/**
 * AhriThread2
 */
class AhriThread2 implements Runnable {
    @Override
    public void run() {
        System.out.println("AhriThread");
    }
}

/**
 * AhriThread2
 */
class AhriThread3 implements Callable {
    @Override
    public Object call() throws Exception {
        System.out.println("AhriThread");
        return 1;
    }
}
