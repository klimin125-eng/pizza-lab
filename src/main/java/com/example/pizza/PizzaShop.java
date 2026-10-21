package com.example.pizza;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Магазин пицц. Хранит коллекцию пицц (композиция)
 * и предоставляет методы для аналитики.
 */
public class PizzaShop {

    /** Коллекция пицц магазина. */
    private final List<Pizza> pizzas = new ArrayList<>();

    /**
     * Добавляет пиццу в магазин.
     *
     * @param pizza пицца для добавления
     */
    public void addPizza(Pizza pizza) {
        if (pizza == null) throw new IllegalArgumentException("pizza == null");
        pizzas.add(pizza);
    }

    /**
     * Подсчитывает количество пицц, вес которых превышает заданный.
     *
     * @param minWeight пороговый вес в граммах
     * @return количество пицц с весом &gt; minWeight
     */
    public long countHeavierThan(double minWeight) {
        return pizzas.stream()
                .filter(p -> p.getWeight() > minWeight)
                .count();
    }

    /**
     * Возвращает цены пицц, диаметр которых превышает заданный.
     *
     * @param minDiameter пороговый диаметр в см
     * @return список цен подходящих пицц
     */
    public List<Double> pricesWithDiameterOver(double minDiameter) {
        List<Double> result = new ArrayList<>();
        for (Pizza p : pizzas) {
            if (p.getDiameter() > minDiameter) {
                result.add(p.getPrice());
            }
        }
        return result;
    }

    /**
     * @return неизменяемое представление всех пицц магазина
     */
    public List<Pizza> getAll() {
        return Collections.unmodifiableList(pizzas);
    }
}