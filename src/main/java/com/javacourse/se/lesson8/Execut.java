package com.javacourse.se.lesson8;

import java.util.Arrays;
import java.util.Optional;
import java.util.concurrent.*;
import java.util.stream.Stream;

public class Execut {

    ExecutorService executorService = Executors.newFixedThreadPool(2);

    MyRannable myRannable = new MyRannable();
    MyCallable2 myCallable2 = new MyCallable2();

    public synchronized void myRun() throws InterruptedException {

        executorService.submit(myRannable);
    }

    public synchronized void myCall() throws ExecutionException, InterruptedException {

        System.out.println(executorService.submit(myCallable2).get());

    }

    public static void main(String[] args) throws Exception {

        int i;
        Execut executors = new Execut();
        for (i = 0; i < 5; i++) {

            executors.myRun();
            executors.myCall();

        }
        executors.executorService.shutdown();
    }
}

class MyRannable implements Runnable {

    @Override
    public void run() {

        System.out.println("Uaaaaaaaaa!");

    }
}

class MyCallable2 implements Callable<String> {

    @Override
    public String call() throws Exception {

        return "Bdrrrrrrr";
    }
}