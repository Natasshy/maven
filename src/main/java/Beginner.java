/*Напиши программку которая спрашивает в начале имя, затем фамилию, затем отчество.
 Потом спрашивает год рождения.
 И после этого выводит итоговую информацию в консоль в виде ФИО и возраста
Возраст вычисляй просто = 2021 - полученный год
 */

import java.util.Scanner;

public class Beginner {
    public static void main(String[] args) {
        System.out.println("Введите имя: ");
        String name = scanerSc();
        System.out.println("Введите фамилию: ");
        String secondName = scanerSc();
        System.out.println("Введите отчество: ");
        String patronomic = scanerSc();
        System.out.println("Введите год рождения: ");
        int age = Integer.parseInt(scanerSc());

        System.out.println("ФИО: " + name + " " + secondName + " " + patronomic  + " " + (2021 - age) + " лет");


    }

    public static String scanerSc() {
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }


}

