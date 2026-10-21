package com.example.pizza;

import java.util.Objects;

/**
 * Абстрактный класс, представляющий пиццу.
 * Содержит общие для всех видов пицц характеристики.
 */
public abstract class Pizza {

    /** Название пиццы. */
    private final String name;

    /** Цена пиццы. */
    private final double price;

    /** Вес пиццы в граммах. */
    private final double weight;

    /** Диаметр пиццы в сантиметрах. */
    private final double diameter;

    /** Калорийность пиццы (ккал). */
    private final int calories;

    /**
     * Создаёт новый объект пиццы.
     *
     * @param name     название пиццы
     * @param price    цена (должна быть > 0)
     * @param weight   вес в граммах (должен быть > 0)
     * @param diameter диаметр в см (должен быть > 0)
     * @param calories калорийность в ккал (должна быть >= 0)
     */
    protected Pizza(String name, double price, double weight,
                    double diameter, int calories) {
        if (price <= 0)    throw new IllegalArgumentException("Цена должна быть > 0");
        if (weight <= 0)   throw new IllegalArgumentException("Вес должен быть > 0");
        if (diameter <= 0) throw new IllegalArgumentException("Диаметр должен быть > 0");
        if (calories < 0)  throw new IllegalArgumentException("Калорийность должна быть >= 0");

        this.name = Objects.requireNonNull(name, "name");
        this.price = price;
        this.weight = weight;
        this.diameter = diameter;
        this.calories = calories;
    }

    /** @return название пиццы */
    public String getName() { return name; }

    /** @return цена пиццы */
    public double getPrice() { return price; }

    /** @return вес пиццы в граммах */
    public double getWeight() { return weight; }

    /** @return диаметр пиццы в см */
    public double getDiameter() { return diameter; }

    /** @return калорийность в ккал */
    public int getCalories() { return calories; }

    @Override
    public String toString() {
        return String.format("%-12s | цена: %6.2f | вес: %5.1f г | диаметр: %4.1f см | ккал: %4d",
                name, price, weight, diameter, calories);
    }
}