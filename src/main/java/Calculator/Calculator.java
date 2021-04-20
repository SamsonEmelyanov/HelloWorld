package Calculator;

import javax.swing.*;

public class Calculator {

    double a=Double.parseDouble(JOptionPane.showInputDialog("Введите первое число:"));
    double b=Double.parseDouble(JOptionPane.showInputDialog("Введите второе число:"));
    double c;
    String typeOfOperation=JOptionPane.showInputDialog("Укажите тип арифметической операции");
    public double sum(){

        switch (typeOfOperation){
            case("+"):
                c=a+b;
                break;
            case ("-"):
                c=a-b;
                break;
            case("*"):
                c=a*b;
                break;
            case("/"):
                if(b!=0) {
                    c = a / b;
                }
                else {
                    JOptionPane.showMessageDialog(null, "Невозможно разделить на ноль!");
                }
                break;
        }

        return c;
    }
}
