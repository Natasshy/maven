/*Напиши программку которая спрашивает в начале имя, затем фамилию, затем отчество.
 Потом спрашивает год рождения.
 И после этого выводит итоговую информацию в консоль в виде ФИО и возраста
Возраст вычисляй просто = 2021 - полученный год
 */

import java.util.Scanner;

public class Beginner {
    public static void main(String[] args) {
        printResult(ascFIO(), ascAge());

    }

    public static String ascFIO() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = sc.nextLine();
        System.out.println("Введите фамилию: ");
        String secondName = sc.nextLine();
        System.out.println("Введите отчество: ");
        String patronomic = sc.nextLine();
        return name + " " + secondName + " " + patronomic;

    }

    public static int ascAge() {
        System.out.println("Введите год рождения: ");
        Scanner sc = new Scanner(System.in);
        return 2021 - sc.nextInt();
    }

    public static void printResult(String FIO, int age) {
        System.out.println("ФИО: " + FIO + ", возраст: " + age + " лет");
    }

}

