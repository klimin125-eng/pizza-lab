package com.example.pizza;

/**
 * Консольное демонстрационное приложение для варианта 11.
 */
public class Main {

    /**
     * Точка входа.
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        PizzaShop shop = new PizzaShop();

        // Пункт 3: не менее 3 экземпляров каждого класса
        shop.addPizza(new Pepperoni(450.0, 520, 30, 1100));
        shop.addPizza(new Pepperoni(390.0, 480, 28, 1050));
        shop.addPizza(new Pepperoni(520.0, 610, 35, 1250));

        shop.addPizza(new Cheese(380.0, 450, 30, 980));
        shop.addPizza(new Cheese(420.0, 500, 32, 1020));
        shop.addPizza(new Cheese(350.0, 400, 26, 900));

        shop.addPizza(new Meat(560.0, 650, 35, 1350));
        shop.addPizza(new Meat(500.0, 590, 32, 1280));
        shop.addPizza(new Meat(610.0, 700, 40, 1450));

        // Выводим весь ассортимент
        System.out.println("=== Все пиццы магазина ===");
        shop.getAll().forEach(System.out::println);

        // Пункт 4: количество пицц с весом больше заданного
        double minWeight = 500.0;
        System.out.printf("%nПицц с весом > %.0f г: %d%n",
                minWeight, shop.countHeavierThan(minWeight));

        // Пункт 5: цены пицц с диаметром больше заданного
        double minDiameter = 30.0;
        System.out.printf("Цены пицц с диаметром > %.0f см: %s%n",
                minDiameter, shop.pricesWithDiameterOver(minDiameter));
    }
}