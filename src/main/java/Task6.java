/*
Есть входной файл с набором слов, написанных через пробел
Необходимо:
Прочитать слова из файла.
Отсортировать в алфавитном порядке.
Посчитать сколько раз каждое слово встречается в файле. Вывести статистику на консоль
Найти слово с максимальным количеством повторений. Вывести на консоль это слово и сколько раз оно встречается в файле
 */


import java.io.*;
import java.util.*;

import static java.util.Collections.*;


public class Task6 {
    public static void main(String[] args) {
        String s;
        ArrayList<String> listOfLines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/test.txt"))) {
            while ((s = br.readLine()) != null) {
                addAll(listOfLines, s.split(" "));
                System.out.println(listOfLines);
            }


        } catch (IOException exp) {
            System.out.println("Ошибка ввода-вывода: " + exp);
        }


        sort(listOfLines);
        System.out.println("Отсортированые в алфавитном порядке слова - " + listOfLines);


        Map<String, Integer> hashMap = new TreeMap<String, Integer>();
        Integer item;

        for (String words : listOfLines) {
            item = hashMap.get(words);
            if (item == null) hashMap.put(words, 1);
            else hashMap.put(words, item + 1);
        }

        System.out.println("Количество повторений слов в тексте: " + hashMap);

        String key = Collections.max(hashMap.entrySet(), Map.Entry.comparingByValue()).getKey();
        int maxValue = Collections.max(hashMap.values());


        System.out.println("Слово с максимальным количеством повторений: " + key + " - " + maxValue);


    }
}


