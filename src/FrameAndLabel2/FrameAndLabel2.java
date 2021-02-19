package FrameAndLabel2;

import javax.swing.*;
// Класс для реализации окна с меткой:
class MyFrame{
// Конструктор класса.
// Аргументы конструктора - текст для метки
// и координаты окна на экране:
    MyFrame(String text,int x,int y){
// Создание окна:
        JFrame frm=new JFrame(" Окно с меткой");
// Положение окна на экране и размеры:
        frm.setBounds(x,y,800,440);
// Реакция на закрытие окна:
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// Создание пиктограммы:
        ImageIcon icn=new ImageIcon("C:/Users/SAMSON/Desktop/Angry customer.png");
// Создание текстовой метки (с пиктограммой):
        JLabel lbl=new JLabel(text,icn,JLabel.CENTER);
// Добавление метки в окно:
        frm.add(lbl);
// Отображение окна:
        frm.setVisible(true);}
}
public class FrameAndLabel2{
    public static void main(String[] args){
// Создание окна (анонимный объект):
        new MyFrame(" I'll kill you motherfucker!!!",300,400);}
}
