
/*
1. Начинаем писать калькулятор:

Реализовать сложение дробных чисел, которые пользователь вводит в консоль.
Использовать комментарии и JavaDoc при описании метода.
Использовать форматирование при выводе результата в консоль.
Полученный результат округлять до 4-х знаков после запятой.
 */

/**
 * @author Natalia Dolmatova
 */

import java.util.Scanner;

public class TASK2 {
    public static void main(String[] args) {
        /**
         * @param x - первое дробное число, вводимое пользователем
         * @param x - второе дробное число, вводимое пользователем
         * @param result - результат сложения двух дробных чисел
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое дробное число: ");
        double x = sc.nextDouble();
        System.out.println("Введите первое второе число: ");
        double y = sc.nextDouble();
        double result = x + y;

        System.out.printf("Полученный результат: %.4f", result);

        sc.close();
    }

}
