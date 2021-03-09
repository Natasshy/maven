/*Напиши программку которая спрашивает в начале имя, затем фамилию, затем отчество.
 Потом спрашивает год рождения.
 И после этого выводит итоговую информацию в консоль в виде ФИО и возраста
Возраст вычисляй просто = 2021 - полученный год
 */

import java.util.Scanner;

public class Beginner {
    public static void main(String[] args) {
        System.out.println("ФИО: " + ascName() + " " + ascSecondName() + " " + ascPatronymic() + ", возраст: " + ascAge() + " лет");

    }

    public static String ascName() {
        System.out.println("Введите имя: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static String ascSecondName() {
        System.out.println("Введите фамилию: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static String ascPatronymic() {
        System.out.println("Введите отчество: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static int ascAge() {
        System.out.println("Введите год рождения: ");
        Scanner sc = new Scanner(System.in);
        return 2021 - sc.nextInt();
    }

}

