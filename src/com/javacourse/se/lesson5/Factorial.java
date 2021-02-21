package com.javacourse.se.lesson5;

import java.util.Arrays;

public class Factorial {

    public static void main(String[] args) throws InterruptedException {



        Thread tr1=new Thread(()-> System.out.println("tr1"));
        Thread tr2=new Thread(()-> System.out.println("tr2"));
        Thread tr3=new Thread(()-> System.out.println("tr3"));
        Thread tr4=new Thread(()-> System.out.println("tr4"));

        tr1.start();
        tr2.start();
        tr3.start();
        tr4.start();
        System.out.println(factor(8));

    }

    public static int factor(int n){

        // Recursion method
     if(n==1)
         return 1;

     else
         return n*factor(n-1);

        // Cycle method
/*        int i;
        for (i=n;i>=2;i--){
            n*=(i-1);
        }
        return n;*/

    }

}
