package com.javacourse.se.lesson6;

import java.util.Arrays;

public class Cat {
    private int a = 4;
    private int b = 5;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    Runnable runnable = () -> System.out.println("Сука Кот!");




    public static void main(String[] args) {

        Cat obj = new Cat();
        obj.runnable.run();
        obj.setA(40);
        obj.setB(60);

        int c = obj.getA();
        int d = obj.getB();

        System.out.println(c + d);
    }
}




