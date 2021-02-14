package ru.idcore;

import java.util.Map;
import java.util.Set;

public class PrintConsoleProductCatalog implements IPrintList {
    private static PrintConsoleProductCatalog instance = null;
    private Warehouse catalog;

    private PrintConsoleProductCatalog() {

    }

    public static PrintConsoleProductCatalog getInstance() {
        if (instance == null) {
            return new PrintConsoleProductCatalog();
        }
        return instance;
    }

    public void setCatalog(Warehouse catalog) {
        this.catalog = catalog;
    }

    @Override
    public void print() {
        for (Map.Entry<Product, Double> product: catalog.getProducts().entrySet()
             ) {
            System.out.println(product);
        }
    }
}
