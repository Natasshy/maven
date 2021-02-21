/*
 Поиск максимального элемента в массиве.
 Для начала задать массив слов.Размерность массива произвольна, задается в консоли.
 После чего в консоли вводятся слова в количестве равном заданной длине массива.
 В полученном массиве необходимо найти самое длинное слово.
 Результат вывести на консоль

 */

/**
 * @author Natalia Dolmatova
 */

import java.util.*;

public class Task3_11 {

    public static void main(String[] args) {
        /**
         * @param int number - длина массива
         * @param String[] arr - массив слов
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int number = sc.nextInt();
        String[] arr = new String[number];

        System.out.println("Введите " + number + " слов/слова");
        for (int i = 0; i < number; i++) {
            arr[i] = sc.next();
        }

        System.out.println("Введенный массив:" + Arrays.toString(arr));

/**
 * @param String max - максимальное по длине слово массива
 */
        String max = getMax(arr);
        System.out.println("Самое длинное слово: " + max);

    }

    /**
     *
     * @param inputArray входящее значение
     * @return максимальное значение maxValue
     */
    public static String getMax(String[] inputArray) {
        String maxValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i].length() > maxValue.length()) {
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }

}




