package com.javacourse.se.lesson6;
import com.javacourse.se.lesson6.MyMath;

import java.util.Arrays;

public class Dog {
    int age;
    double weight;
    boolean bark;

    public String toString(){
        return "Dog: age,weight,bark";
    }

    public static void main(String[] args) {

        Dog dog=new Dog();
        ArgsDemo ntt=new ArgsDemo();


        ntt.MakeChange(5,'d');

        MyMath TT= new MyMath();

        double Sam=TT.sin(2.345,1000);

        System.out.println(Sam);
        System.out.println(dog.toString());
    }

}
