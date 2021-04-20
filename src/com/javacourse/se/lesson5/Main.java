package com.javacourse.se.lesson5;
import com.javacourse.se.lesson6.Numbers;
import com.javacourse.se.lesson6.Cat;
import com.javacourse.se.lesson6.Dog;

import javax.swing.*;
import java.util.Collections;

public class Main {
        static String a ="12345677654321" /*JOptionPane.showInputDialog("Введи число")*/;
        static String b ="Улыбок тебе дед макаР";
        static boolean check=true;
        static int i;
        static boolean isItPolindrom(){
            // Char Array creation for Array's length definition:
            char b[]=a.toCharArray();
            // Int Array creation:
            long[] arr = new long[b.length];
            long number = Long.parseLong(a);
            for (i = b.length - 1; i >= 0; i--) {
                arr[i] = number % 10;
                number /= 10;
            }
            // Check Arrays elements for polindrom:
            for (i=0;i<b.length;i++) {
                if(arr[i]==arr[b.length-i-1]) {check=true;}
                else {return false;}}
            return check;}


        public static void main(String[] args){
                char[] chars = b.toCharArray();
                String b ="";
                for(int i=chars.length-1; i>=0;i--){
                    b+=chars[i];
                }
            System.out.println(b);


               /* System.out.println(isItPolindrom());*/
                JOptionPane.showMessageDialog(null,a+"\nЭто полиндром? \n"+isItPolindrom());
        }
    }
