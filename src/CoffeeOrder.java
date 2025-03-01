import java.util.Scanner;
import java.util.ArrayList;


public class CoffeeOrder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> orders = new ArrayList<>();
        double totalPrice = 0.0;

        while (true) {
            System.out.println("Выберите кофе:");
            System.out.println("1. Латте - 320 руб.");
            System.out.println("2. Капучино - 300 руб.");
            System.out.println("3. Эспрессо - 220 руб.");
            System.out.println("4. Раф - 340 руб.");
            System.out.println("5. Американо - 280 руб.");
            System.out.println("6. Завершить заказ");

            System.out.print("Введите номер: ");
            int coffeeChoice = scanner.nextInt();
            scanner.nextLine();

            if (coffeeChoice == 6) {
                System.out.println("Спасибо за Ваш заказ!");
                break;
            }

            String coffeeName;
            double coffeePrice;

            switch (coffeeChoice) {
                case 1:
                    coffeeName = "Латте";
                    coffeePrice = 320;
                    break;
                case 2:
                    coffeeName = "Капучино";
                    coffeePrice = 300;
                    break;
                case 3:
                    coffeeName = "Эспрессо";
                    coffeePrice = 220;
                    break;
                case 4:
                    coffeeName = "Раф";
                    coffeePrice = 340;
                    break;
                case 5:
                    coffeeName = "Американо";
                    coffeePrice = 280;
                    break;
                default:
                    System.out.println("Некорректный ввод. Попробуйте снова");
                    continue;
            }

            System.out.println("Выберите уровень сахара:");
            System.out.println("1. Без сахара - 0 руб.");
            System.out.println("2. Мало сахара - 5 руб.");
            System.out.println("3. Среднее количество сахара - 10 руб.");
            System.out.println("4. Много сахара - 15 руб.");

            System.out.print("Введите номер: ");
            int sugarChoice = scanner.nextInt();
            scanner.nextLine();

            String sugarLevel;
            switch (sugarChoice) {
                case 1:
                    sugarLevel = "Без сахара";
                    break;
                case 2:
                    sugarLevel = "Мало сахара";
                    break;
                case 3:
                    sugarLevel = "Среднее количество сахара";
                    break;
                case 4:
                    sugarLevel = "Много сахара";
                    break;
                default:
                    System.out.println("Некорректный ввод. Попробуйте снова");
                    continue;
            }

            Coffee coffee = new Coffee(coffeeName, coffeePrice);
            Sugar sugar = new Sugar(sugarLevel);
            coffee.calculatePriceWithSugar(sugar);

            totalPrice += coffee.getFinalPrice();

            String orderDetails = coffee.getName() + " (" + coffee.getBasePrice() + " руб.)\n" +
                    sugar.getSugarDescription() + " (+" + sugar.getSugarPrice() + " руб.)\n" +
                    "Итоговая стоимость: " + coffee.getFinalPrice() + " руб.\n";

            orders.add(orderDetails);
            System.out.println("Заказ добавлен!\n");
        }
        scanner.close();

        System.out.println("\nВаш итоговый заказ:");
        for (String order : orders) {
            System.out.println(order);
        }
        System.out.println("Общая стоимость заказа: " + totalPrice + " руб.");
    }
}
