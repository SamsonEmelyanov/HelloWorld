package Polymorphizm;

public class Dog extends Animal{



    public void Bark(){

        System.out.println("Песики умеют рычать!!!");
    }

    @Override
    public void Eat() {
        System.out.println(Food);
    }
}
