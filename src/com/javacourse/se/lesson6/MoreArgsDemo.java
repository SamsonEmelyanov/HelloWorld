package com.javacourse.se.lesson6;

class MyClass2{
    // Имя объекта (текстовое поле):
    String name;
    // Конструктор класса:
    MyClass2(String name){
        this.name=name;}
    // Метод для отображения имени объекта:
    void show(){
        System.out.println("Объект с именем \""+name+"\".");}
}
public class MoreArgsDemo{
    // Статический метод для изменения ссылки на объект:
    static void ChangeRef(MyClass2 obj){
// Создается локальный объект:
        MyClass2 tmp=new MyClass2("Локальный Объект");
// Ссылка на локальный объект присваивается аргументу метода:
        obj=tmp;
// Проверка имени объекта, на который ссылается аргумент:
        obj.show();}

    public static void main(String[] args){
// Создание объекта:
        MyClass2 obj=new MyClass2("Основной Объект");
// Проверка имени объекта:
        obj.show();
// Попытка изменить ссылку на объект:
        ChangeRef(obj);
// Проверка результата:
        obj.show();}
}