
//Формируется новогодний подарок.
//Он может включать в себя разные сладости (Candy, Jellybean, etc.)
//У каждой сладости есть название, вес, цена и свой уникальный параметр.
// Необходимо собрать подарок из сладостей.
// Найти общий вес подарка, общую стоимость подарка и вывести на консоль информацию о всех сладостях в подарке.
//

import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class Task4_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Corzina corzina = new Corzina();
        System.out.println("Выберете сладость для добавления в новогодний подарок, по окончании введите end: ");
        System.out.println(corzina.printOption());

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
                switch (index) {
                    case 1 -> corzina.addCandy(quantity);
                    case 2 -> corzina.addJellybean(quantity);
                    case 3 -> corzina.addChocolate(quantity);
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Сладости с таким кодом не существует");
            }
        }
        System.out.println("Общее количетво сладостей в подарке: " + corzina.getTotalQuantity());
        System.out.println("Общая цена: " + corzina.getTotalPrice());
        System.out.println("Общий вес: " + corzina.getTotalWeight());
        System.out.println("Подарок состоит из: " + corzina.getDescription());

    }


}

class Item {

    private   String name;
    private   int price;
    private   int weight;


    Item(String name, int price, int weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }
}


class Corzina {
   private ArrayList Candy = new ArrayList();
    private ArrayList Jellybean = new ArrayList();
    private  ArrayList Chocolate = new ArrayList();

    private int totalQuantity ;
    private int totalWeight ;
    private int totalPrice ;


    public void addCandy(int quantity) {
        for (int i = 0; i < quantity; i++) {
            Candy.add(new Item("Candy", 10, 1));
            totalQuantity++;
            totalWeight += 10;
            totalPrice += 1;
        }
    }

    public void addJellybean(int quantity) {
        for (int i = 0; i < quantity; i++) {
            Jellybean.add(new Item("Jellybean", 15, 5));
            totalQuantity++;
            totalWeight += 15;
            totalPrice += 5;
        }
    }

    public void addChocolate(int quantity) {
        for (int i = 0; i < quantity; i++) {
            Chocolate.add(new Item("Chocolate", 20, 3));
            totalQuantity++;
            totalWeight += 20;
            totalPrice += 3;
        }
    }


    public int getTotalQuantity( ) {
        return totalQuantity;

    }

    public int getTotalWeight() {
        return totalWeight;

    }

    public int getTotalPrice() {
        return totalPrice;

    }

    public String getDescription() {
        return "Конфет - " + Candy.size() + ", Мармелад - " + Jellybean.size() + ", Шоколад - " + Chocolate.size();
    }

    public String printOption() {
        return  "1 - Candy, 2 - Jellybean, 3 - Chocolate";
    }
}



