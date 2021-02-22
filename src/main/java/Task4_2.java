/*
Формируется новогодний подарок.
Он может включать в себя разные сладости (Candy, Jellybean, etc.)
У каждой сладости есть название, вес, цена и свой уникальный параметр.
 Необходимо собрать подарок из сладостей.
 Найти общий вес подарка, общую стоимость подарка и вывести на консоль информацию о всех сладостях в подарке.
 */

import java.sql.SQLOutput;
import java.util.*;

public class Task4_2 {
    public static void main(String[] args) {
        String nameCandy = "Candy";
        int weightCandy =  75;
        int priceCandy = 10;
        int idCandy = 1;

        String nameJellybean = "Jellybean";
        int weightJellybean =  55;
        int priceJellybean = 35;
        int idJellybean = 2;

        String nameChocolate = "Chocolate";
        int weightChocolate =  90;
        int priceChocolate =  15;
        int idChocolate = 3;

        String nameCookies = "Cookies";
        int weightCookies =  90;
        int priceCookies =  25;
        int idCookies = 4;


        Scanner sc = new Scanner(System.in);


        System.out.println("Введите id для добавление в подарок - Candy 1, Jellybean 2, Chocolate 3, Cookies 4 ");


        int choice = sc.nextInt();



         switch(choice) {
            case 1:
                System.out.println("Вы выбрали: " + nameCandy);
                System.out.println("Общий вес: " + weightCandy);
                System.out.println("Общая стоимость: " + priceCandy);
                System.out.println("Уникальный параметр: " + idCandy);

                break;

            case 2:
                System.out.println("Вы выбрали: " + nameJellybean);
                System.out.println("Общий вес: " + weightJellybean);
                System.out.println("Общая стоимость: " + priceJellybean);
                System.out.println("Уникальный параметр: " + idJellybean);

                break;

            case 3:
                System.out.println("Вы выбрали: " + nameChocolate);
                System.out.println("Общий вес: " + weightChocolate);
                System.out.println("Общая стоимость: " + priceChocolate);
                System.out.println("Уникальный параметр: " + idChocolate);

                break;


            case 4:
                System.out.println("Вы выбрали: " + nameCookies);
                System.out.println("Общий вес: " + weightCookies);
                System.out.println("Общая стоимость: " + priceCookies);
                System.out.println("Уникальный параметр: " + idCookies);

                break;

        }


    }
}
