package ru.idcore;

import java.util.*;

public class Warehouse {
    private static Warehouse instance = null;
    private Map<Product, Double> products;

    private Warehouse() {
        products = new HashMap<>();
    }

    public static Warehouse getInstance() {
        if (instance == null) {
            instance = new Warehouse();
        }
        return instance;
    }

    public Map<Product, Double> getProducts() {
        return products;
    }

    public void print() {
        String pattern = "%-20s %-10s %-15s %-20s %-25s %-15s%n";
        System.out.println("Товары в ассортименте: ");
        System.out.printf(pattern, "Наименование", "Единица", "Цена/за ед.", "Производитель", "Количество на складе", "Рейтинг");

        for (Map.Entry<Product, Double> product : products.entrySet()
        ) {
            System.out.printf(pattern,
                    product.getKey().getProductName(),
                    product.getKey().getMeasure(),
                    product.getKey().getPrice(),
                    product.getKey().getManufacturer(),
                    product.getValue(),
                    product.getKey().getRating());
        }
    }
}

