package Task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calc calc = new Calc();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        double a = scanner.nextDouble();
        System.out.println("Введите второе число");
        double b = scanner.nextDouble();
        System.out.println("Введите знак необходимой арифметической операции: +, -, /, *: ");
        char znak = scanner.next().charAt(0);



        switch (znak) {
            case '+' -> calc.Plus(a, b);
            case '-' -> calc.Minus(a, b);
            case '*' -> calc.Divide(a, b);
            case '/' -> calc.Multiply(a, b);
        }

    }

}
