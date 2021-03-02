
/*
1. Начинаем писать калькулятор:

Реализовать сложение дробных чисел, которые пользователь вводит в консоль.
Использовать комментарии и JavaDoc при описании метода.
Использовать форматирование при выводе результата в консоль.
Полученный результат округлять до 4-х знаков после запятой.
*Добавить возможность выбора другой операции (сложение,
вычитание, деление, умножение)
 */



import java.util.Scanner;

public class Task2_22 {

    /**
     * @author Natalia Dolmatova
     */
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите знак необходимой арифметической операции: +, -, /, *: ");


        char znak = sc.next().charAt(0);


        System.out.println("Введите первое дробное число: ");
        double x = sc.nextDouble();
        System.out.println("Введите второе дробное число: ");
        double y = sc.nextDouble();


        double result = 0;


        switch (znak) {
            case '+':
                result = x + y;
                break;
            case '-':
                result = x - y;
                break;
            case '*':
                result = x * y;
                break;
            case '/':
                result = x / y;
                break;
        }
        System.out.printf("Полученный результат: %.4f", result);

        sc.close();
    }
}


