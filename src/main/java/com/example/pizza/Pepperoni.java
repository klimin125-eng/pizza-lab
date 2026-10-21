package com.example.pizza;

/**
 * Пицца «Пепперони».
 */
public class Pepperoni extends Pizza {

    /**
     * Создаёт пиццу «Пепперони».
     *
     * @param price    цена
     * @param weight   вес в граммах
     * @param diameter диаметр в см
     * @param calories калорийность в ккал
     */
    public Pepperoni(double price, double weight, double diameter, int calories) {
        super("Пепперони", price, weight, diameter, calories);
    }
}