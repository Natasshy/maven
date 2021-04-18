
package Task8;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        try {
            Calcul calc = new Calcul();
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
                case '*' -> calc.Multiply(a, b);
                case '/' -> calc.Divide(a, b);
            }

        } catch (Exception e) {
            System.out.println("Wrong input. Try again." );
        }

    }
}
