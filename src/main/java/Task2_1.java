
/*
1. Начинаем писать калькулятор:

Реализовать сложение дробных чисел, которые пользователь вводит в консоль.
Использовать комментарии и JavaDoc при описании метода.
Использовать форматирование при выводе результата в консоль.
Полученный результат округлять до 4-х знаков после запятой.
 */


import java.util.Scanner;

public class Task2_1 {
    /**
     * @author Natalia Dolmatova
     * х -  первое дробное число, вводимое пользователем
     * у -  второе дробное число, вводимое пользователем
     * result - итоговое значение
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое дробное число: ");
        double x = sc.nextDouble();
        System.out.println("Введите второе дробное число: ");
        double y = sc.nextDouble();


        double result = x + y;

        System.out.printf("Полученный результат: %.4f", result);
        sc.close();
    }

}
