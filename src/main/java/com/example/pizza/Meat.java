package com.example.pizza;

/**
 * Пицца «Мясная».
 */
public class Meat extends Pizza {

    /**
     * Создаёт пиццу «Мясная».
     *
     * @param price    цена
     * @param weight   вес в граммах
     * @param diameter диаметр в см
     * @param calories калорийность в ккал
     */
    public Meat(double price, double weight, double diameter, int calories) {
        super("Мясная", price, weight, diameter, calories);
    }
}