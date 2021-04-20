package Polymorphizm;

public class Cat extends Animal {
    String Food="Уааааааааааа";

    @Override
    public void Eat() {
        /*this.Food="Вискас";*/
        System.out.println(Food);
    }

    @Override
    public void Sleep() {
    this.Dream="Одним глазом";
        System.out.println(Dream);
    }
}
