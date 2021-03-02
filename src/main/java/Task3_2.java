/*Программа должна выполнять одно из заданий на выбор.
 Если в консоли ввести 1 - запуститься выполнение калькулятора,
если 2 - поиск максимального слова в массиве.

 */


import java.util.*;

public class Task3_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Выберете операцию: 1 - калькулятор,  2 - поиск максимального слова в массиве ");
        int viborOperacii = sc.nextInt();

        switch (viborOperacii) {
            case 1 -> calculator();
            case 2 -> Massiv();


            default -> throw new IllegalStateException("Недопустимое значение: " + viborOperacii);
        }
    }


    public static double calculator() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите знак необходимой арифметической операции: +, -, /, *: ");
        char znak = scan.next().charAt(0);
        System.out.println("Введите первое дробное число: ");
        double x = scan.nextDouble();
        System.out.println("Введите второе дробное число: ");
        double y = scan.nextDouble();
        double result = 0;

        switch (znak) {

            case '+' -> result = x + y;
            case '-' -> result = x - y;
            case '*' -> result = x * y;
            case '/' -> result = x / y;
            default -> throw new IllegalStateException("Недопустимое значение: " + znak);
        }
        System.out.printf("Полученный результат: %.4f", result);

        return result;
    }


    public static int Massiv() {

        Scanner scaner = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int number = scaner.nextInt();
        String[] arr = new String[number];

        System.out.println("Введите " + number + " слов/слова");
        for (int i = 0; i < number; i++) {
            arr[i] = scaner.next();
        }

        System.out.println("Введенный массив:" + Arrays.toString(arr));

        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Массив после сортировки:" + Arrays.toString(arr));
        System.out.println("Самое длинное слово: " + arr[0]);

        return number;
    }
}








