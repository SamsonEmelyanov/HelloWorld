package com.javacourse.se.lesson5;

import java.util.Arrays;

public class Factorial {

    public static void main(String[] args) {

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
