/*
1. Массив размерностью 20, заполняется случайными целыми числами от -10 до 10.
 Найти максимальный отрицательный и минимальный положительный элементы массива. Поменять их местами.
 */


import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        int[] myArray = new int[20];

        for (int i = 0; i < myArray.length; i++) {
            int a = -10;
            int b = 10;
            myArray[i] = a + (int) (Math.random() * ((b - a) + 1));
        }
        System.out.println("Рандомный массив от -10 до 10:" + Arrays.toString(myArray));


        int maxNegative = getMax(myArray);
        System.out.println("Максимальный отрицательный элемент массива: " + maxNegative);

        int minPositive = getMin(myArray);
        System.out.println("Минимальный положительный элемент массива: " + minPositive);

        System.out.println("Меняем местами указанные элементы: " + swap);

        void swap(int a, int b) {
            int c = myArray[a];  // записываем первонач. значение arr[a] в переменную с
            myArray[a] = myArray[b]; // в arr[a] записываем arr[b]
            myArray[b] = c;      // в arr[b] записываем с (первонач. значение arr[a])
        }
    }

    //здесь находим Максимальный отрицательный элемент массива
    public static int getMax(int[] inputArray) {
        int maxValueNegative = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] < maxValueNegative & inputArray[i] < 0 ) {
                maxValueNegative = inputArray[i];
            }
        }
        return maxValueNegative;
    }

    // здесь находим Минимальный положительный элемент массива
    public static int getMin(int[] inputArray) {
        int minValuePositive = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] < minValuePositive & inputArray[i] > 0 ) {
                minValuePositive = inputArray[i];
            }
        }
        return minValuePositive;


    }
}






