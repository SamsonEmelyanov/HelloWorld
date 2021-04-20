package Polymorphizm;

public class King {

    public static void king(Polymorphizm.Animal obj){

        obj.Eat();
        obj.Sleep();
    }

    public static void main(String[] args) {

        Animal Dog = new Dog();
        Animal Cat = new Cat();
        Animal Animal = new Animal();

        /*Dog.Eat();
        Dog.Sleep();
        Cat.Eat();
        Cat.Sleep();
        Animal.Eat();
        Animal.Sleep();*/

        king(Dog);
        king(Cat);
        king(Animal);

    }

}
