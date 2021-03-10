
//Формируется новогодний подарок.
//Он может включать в себя разные сладости (Candy, Jellybean, etc.)
//У каждой сладости есть название, вес, цена и свой уникальный параметр.
// Необходимо собрать подарок из сладостей.
// Найти общий вес подарка, общую стоимость подарка и вывести на консоль информацию о всех сладостях в подарке.
//

import java.util.*;

public class Task4_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Corzina corzina = new Corzina();
        Items Candy = new Items("Candy", 10, 1);
        Items Jellybean = new Items("Jellybean", 15, 5);
        Items Chocolate = new Items("Chocolate", 20, 3);

        corzina.addToCorzina(Candy);
        corzina.addToCorzina(Jellybean);
        corzina.addToCorzina(Chocolate);


        System.out.println("Выберете сладость для добавления в новогодний подарок, по окончании введите end: ");
        for (int i = 1; i < ArrayList.size() + 1; i++) {
            System.out.println(i + ". " + ArrayList.get(i - 1).getName() + " - " + ArrayList.get(i - 1).getPrice() + ";");
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
                ArrayList.get(index - 1).getResult(quantity);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Сладости с таким кодом не существует");
            }
        }

        System.out.println("Общее количетво сладостей в подарке: " + Corzina.getTotalQuantity());
        System.out.println("Общая цена: " + Corzina.getTotalPrice());
        System.out.println("Общий вес: " + Corzina.getTotalWeight());
        System.out.println("Подарок состоит из: " + Corzina.printName());
    }


    }

     class Items {

        private String name;
        public int price;
        public int weight;


        Items(String name, int price, int weight) {
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
    }


     class Corzina {
        ArrayList<Items> arr = new ArrayList();



        public void addToCorzina(Items items) {
            arr.add(items);

        }

        public int getTotalQuantity(int quantity) {
            int totalQuantity = 0;
            return totalQuantity += quantity;
        }


        public int getTotalPrice(int price) {
            int totalPrice = 0;
            return totalPrice += price;
        }

        public int getTotalWeight(int weight) {
            int totalWeight = 0;
            return totalWeight += weight;
        }

        public void printName() {
            for (Items e : arr
            ) {
                System.out.println(e.getName() + " " + e.price);
            }
        }
    }


