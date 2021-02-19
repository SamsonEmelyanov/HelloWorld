package CharArraySorting;

import javax.swing.*;
import java.util.Arrays;
import java.util.Collections;

public class CharArraySorting{
    public static void main(String[] args) {
// Текст для окна сообщения:
        String text="Исходный массив:\n";
// Размер массива и индексные переменные:
        int size,i,j;
// Получение размера массива:
        size=Integer.parseInt(JOptionPane.showInputDialog("Размер массива:"));
// Создание символьного массива:
        char[] symbs=new char[size];
// Начальная буква:
        char s='a';
// Заполнение массива (случайным образом):
        for(i=0;i<size;i++){
            symbs[i]=(char)(s+(byte)(Math.random()*26));
            text+=symbs[i]+" ";}

        // Sorting by sort() method
            Arrays.sort(symbs);
        System.out.println(symbs);

        // Min value by Arrays class
        int[] brr={1,3,2,7,6,4,8,9,7};
        System.out.println(Arrays.stream(brr).min());


        text+="\nПосле сортировки:\n";
// Сортировка массива:
        for (i=0;i<size;i++){
            for(j=0;j<size-i-1;j++){
                if(symbs[j]>symbs[j+1]){
                    s=symbs[j+1];
                    symbs[j+1]=symbs[j];
                    symbs[j]=s;}}
        }
// Запись в текстовую переменную элементов массива после сортировки:
        for(i=0;i<size;i++){
            text+=symbs[i]+" ";}
// Отображение окна сообщения:
        JOptionPane.showMessageDialog(null,text);
        ChoosingMethod obj=new ChoosingMethod();
    }
}