
/*Написать три метода - один метод соедединяет две строки и возвращает результат,
второй метод - выводит в консоль результат соединения двух строк
третий метод- печатает привет
 */


public class Beginner {
    public static void main(String[] args) {
        concatString("q", "a");
        printConcat("we", " are the best");
        printHello();

    }

    static String concatString(String a, String b) {
        return a + b;
    }

    static String printConcat(String a, String b) {
        System.out.println(a + b);
        return a + b;
    }


    static void printHello() {
        System.out.println("Hello");

    }
}

