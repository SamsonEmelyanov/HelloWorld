package com.javacourse.se.lesson8;

import com.sun.corba.se.impl.orbutil.closure.Future;

import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableAndFuture {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<Integer> myCallable = new MyCallable();
        FutureTask futureTask = new FutureTask(myCallable);
        new Thread(futureTask).start();
        System.out.println(futureTask.get());
    }
}

class MyCallable implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int i;
        for (i = 0; i < 10; i++) {
            i += i;
        }
        return i;
    }
}

