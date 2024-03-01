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
        ExtendsThread et = new ExtendsThread();
        et.start();

        // implements Runnable
        ImplementsRunnable ir = new ImplementsRunnable();
        Thread t = new Thread(ir);
        t.start();

        // implements Callable
        ImplementsCallable ic = new ImplementsCallable();
        FutureTask<Object> ft = new FutureTask<>(ic);
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
        tpe.execute(new ImplementsRunnable());
        tpe.submit(new ImplementsCallable());
        tpe.shutdown();

        // 使用匿名类
        Thread lambdaThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("niming");
            }
        });
        lambdaThread.start();
    }
}

/**
 * Extends Thread
 */
class ExtendsThread extends Thread {
    @Override
    public void run() {
        System.out.println("Extends Thread");
    }
}

/**
 * Implements Runnable
 */
class ImplementsRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Implements Runnable");
    }
}

/**
 * Implements Callable
 */
class ImplementsCallable implements Callable<Object> {
    @Override
    public Object call() throws Exception {
        System.out.println("Implements Runnable");
        return 1;
    }
}
