package com.javacourse.se.lesson5;
import com.javacourse.se.lesson6.Numbers;
import com.javacourse.se.lesson6.Cat;
import com.javacourse.se.lesson6.Dog;

import javax.swing.*;

public class Main {
        static String a ="789456123321654987" /*JOptionPane.showInputDialog("Введи число")*/;
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
                System.out.println(arr[i]);
            }
            // Check Arrays elements for polindrom:
            for (i=0;i<b.length;i++) {
                if(arr[i]==arr[b.length-i-1]) {check=true;}
                else {return false;}}
            return check;}

        public static void main(String[] args){



               /* System.out.println(isItPolindrom());*/
                JOptionPane.showMessageDialog(null,a+"\nЭто полиндром? \n"+isItPolindrom());
        }
    }
