package com.javacourse.se.lesson8;

import java.util.*;

public class IteratorDemo {

    public static void main(String args[]) {
        // Создаём список массивов
        ArrayList al = new ArrayList();

        // Добавляем элементы к списку массивов
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");

        // Используем итератор, для отображения элементов al
        System.out.print("Начальное содержание al: ");
        Iterator itr = al.iterator();

        while (itr.hasNext()) {
            Object element = itr.next();
            System.out.print(element + " ");
        }

        // Изменяем повторяемые объекты
        ListIterator litr = al.listIterator();

        while (litr.hasNext()) {
            Object element = litr.next();
            litr.set(element + "+");
        }
        System.out.print("\nИзменённое содержание al: ");
        itr = al.iterator();

        while (itr.hasNext()) {
            Object element = itr.next();
            System.out.print(element + " ");
        }

        // Теперь, отобразим список задом наперёд
        System.out.print("\nИзменённый список задом наперёд: ");

        while (litr.hasPrevious()) {
            Object element = litr.previous();
            System.out.print(element + " ");
        }
        System.out.println();
    }
}