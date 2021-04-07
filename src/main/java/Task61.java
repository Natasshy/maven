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


public class Task61 {
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
        System.out.println("Отсортированные в алфавитном порядке слова - " + listOfLines);



        int index = 0;
        String word = null;
        for (int i = 0; i < listOfLines.size(); i++) {



            for (String listOfLine : listOfLines) {
                if (listOfLines.get(i).equals(listOfLine)) {
                    word = listOfLines.get(i);
                    index++;
                }
            }

            System.out.println(word + " " + index);
            index = 0;


        }

    }

}


