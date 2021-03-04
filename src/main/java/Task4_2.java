/*
Формируется новогодний подарок.
Он может включать в себя разные сладости (Candy, Jellybean, etc.)
У каждой сладости есть название, вес, цена и свой уникальный параметр.
 Необходимо собрать подарок из сладостей.
 Найти общий вес подарка, общую стоимость подарка и вывести на консоль информацию о всех сладостях в подарке.
 */

import java.util.*;

public class Task4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Items Candy = new Items("Candy", 10, 1);
        Items Jellybean = new Items("Jellybean", 15, 5);
        Items Chocolate = new Items("Chocolate", 20, 3);

        List<Items> productList = new ArrayList<>();
        productList.add(Candy);
        productList.add(Jellybean);
        productList.add(Chocolate);


        System.out.println("Выберете сладость для добавления в новогодний подарок, по окончании введите end: ");
        for (int i = 1; i < productList.size() + 1; i++) {
            System.out.println(i + ". " + productList.get(i - 1).getName() + " - " + productList.get(i - 1).getPrice() + ";");
        }
        while (true) {
            System.out.println("Введите номер сладости: ");
            String input = scanner.nextLine();
            if (input.equals("End") || input.equals("end")) {
                break;
            }
            int index = Integer.parseInt(input);

            System.out.println("Введите количество сладостей: ");
            String inputQuantity = scanner.nextLine();
            try {
                int quantity = Integer.parseInt(inputQuantity);
                productList.get(index - 1).getResult(quantity);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Сладости с таким кодом не существует");
            }
        }

        System.out.println("Общее количетво сладостей в подарке: " + Items.totalQuantity);
        System.out.println("Общая цена: " + Items.totalPrice);
        System.out.println("Общий вес: " + Items.totalWeight);
        System.out.println("Подарок состоит из: " + Items.getName);


    }

}

class Items {
    public static String getName;
    private String name;
    private int price;
    private int weight;
    protected static int totalPrice = 0;
    protected static int totalQuantity = 0;
    protected static int totalWeight = 0;

    Items(String name, int price, int weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public void getResult(int quantity) {
        this.totalQuantity += quantity;
        this.totalPrice += (price * quantity);
        this.totalWeight += weight;
        this.getName += name + " ";
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

}

