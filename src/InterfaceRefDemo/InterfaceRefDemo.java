package InterfaceRefDemo;

// Интерфейс:
interface Base{
    // Метод объявлен в интерфейсе:
    void show();}
// Класс реализует интерфейс:
class A implements Base{
    // Описание метода интерфейса:
    public void show(){
        System.out.println("Это метод класса A!");}
}
// Этот класс также реализует интерфейс:
class B implements Base{
    // Описание метода интерфейса:
    public void show(){
        System.out.println("Это метод класса B!");}
}
public class InterfaceRefDemo {
    public static void main(String[] args){
// Интерфейсная переменная:
        Base ref;
// Ссылка на объект первого класса:
        ref=new A();
// Вызов метода через интерфейсную переменную:
        ref.show();
// Ссылка на объект второго класса:
        ref=new B();
// Вызов того же метода через интерфейсную переменную:
        ref.show();}
}
