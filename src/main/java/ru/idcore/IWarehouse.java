package ru.idcore;

import java.util.Map;

public interface IWarehouse {
    void addProduct(Product product, Double count);
    void getProduct(Product product, Double count);
    Map<Product, Double> getAvailableProduct();
}
