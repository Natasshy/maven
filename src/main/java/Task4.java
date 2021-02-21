/*
- Массив размерностью 20, заполняется случайными целыми числами от -10 до 10.
- Найти максимальный отрицательный и минимальный положительный элементы массива.
- Поменять их местами.
 */


import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        int[] myArray = createAndFillRandomArray(20);

        int maxNegative = Integer.MIN_VALUE;
        int minPositive = Integer.MAX_VALUE;
        int positive = 0, negative = 0;
        int temp;

        //здесь находим Максимальный отрицательный элемент массива
        for (int i = 0; i < myArray.length; i++) {
            if ((myArray[i] < 0) && (maxNegative < myArray[i])) {
                maxNegative = myArray[i];
                negative = i;
            }

            // здесь находим Минимальный положительный элемент массива
            if ((myArray[i] > 0) && (minPositive > myArray[i])) {
                minPositive = myArray[i];
                positive = i;
            }
        }

        System.out.println("Минимальный положительный элемент массива: " + minPositive);
        System.out.println("Максимальный отрицательный элемент массива: " + maxNegative);

        //здесь меняем местами элементы массива
        temp = myArray[negative];
        myArray[negative] = myArray[positive];
        myArray[positive] = temp;

        System.out.println("Массив после перестановки: " + Arrays.toString(myArray));

    }

    /**
     * @param n - длина массива
     * @return возвращаем рандомный массив от -  10 до 10
     */
    private static int[] createAndFillRandomArray(int n) {

        int[] mas = new int[n];
        for (int i = 0; i < n; i++) {
            mas[i] = (int) ((Math.random() * 21) - 10);
        }
        System.out.println("Рандомный массив от -10 до 10: " + Arrays.toString(mas));
        return mas;
    }
}

