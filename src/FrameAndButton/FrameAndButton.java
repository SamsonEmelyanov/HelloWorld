package FrameAndButton;

import javax.swing.*;
import java.awt.event.*;
// Класс для реализации окна с меткой.
// Класс реализует интерфейс ActionListener:
class MyFrame implements ActionListener{
    // Конструктор класса.
// Аргументы конструктора - текст для метки
// и координаты окна на экране:
    MyFrame(String text,int x,int y){
// Создание окна:
        JFrame frm=new JFrame(" Окно с меткой и кнопкой");
// Положение окна на экране и размеры:
        frm.setBounds(x,y,360,200);
// Реакция на закрытие окна:
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// Создание пиктограммы:
        ImageIcon icn=new ImageIcon("C:/Users/SAMSON/Desktop/Microsoft Word - Melon.jpg");
// Создание текстовой метки (с пиктограммой):
        JLabel lbl=new JLabel(text,icn,JLabel.CENTER);
// Положение и размер пиктограммы:
        lbl.setBounds(10,10,330,100);
// Создание кнопки:
        JButton btn=new JButton("Принято к сведению");
// Положение и размер кнопки:
        btn.setBounds(90,120,180,30);
// Регистрация обработчика в кнопке:
        btn.addActionListener(this);
// Отключение менеджера компоновки:
        frm.setLayout(null);
// Добавление метки в окно:
        frm.add(lbl);
// Добавление кнопки в окно:
        frm.add(btn);
// Отображение окна:
        frm.setVisible(true);}
    // Обработчик для кнопки.
// Определение метода actionPerformed()
// из интерфейса ActionListener:
    public void actionPerformed(ActionEvent AEobj){
        System.exit(0);}
}
public class FrameAndButton{
    public static void main(String[] args){
// Создание окна (анонимный объект):
         new MyFrame(" Окно с меткой, пиктограммой и кнопкой!",400,250);}
}