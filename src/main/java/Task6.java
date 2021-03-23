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


public class Task6 {
    public static void main(String[] args) {
        String s;
        ArrayList<String> listOfLines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/test.txt"))) {
            while ((s = br.readLine()) != null) {
                Collections.addAll(listOfLines, s.split(" "));
                System.out.println(listOfLines);
            }


        } catch (IOException exp) {
            System.out.println("Ошибка ввода-вывода: " + exp);
        }


        Collections.sort(listOfLines);
        System.out.println("Отсортированые в алфавитном порядке слова - " + listOfLines);

        int index = 0;
        String word = null;
        for (int i = 0; i < listOfLines.size(); i++) {
            for (int j = i + 1; j < listOfLines.size(); j++) {
                if (listOfLines.get(i).equals(listOfLines.get(j))) {
                    index++;
                    word = listOfLines.get(i);
                } else {
                    word = listOfLines.get(i);
                    index = 1;
                }
            }
            System.out.println("Слово '" + word + "' встречается в тексте: " + index + " раз/a.");

        }

        System.out.println("Максимально часто встречается слово: '" +    "'" + " раз/a.");


    }
}

