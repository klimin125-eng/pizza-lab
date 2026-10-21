package com.example.pizza;

/**
 * Пицца «Сырная».
 */
public class Cheese extends Pizza {

    /**
     * Создаёт пиццу «Сырная».
     *
     * @param price    цена
     * @param weight   вес в граммах
     * @param diameter диаметр в см
     * @param calories калорийность в ккал
     */
    public Cheese(double price, double weight, double diameter, int calories) {
        super("Сырная", price, weight, diameter, calories);
    }
}