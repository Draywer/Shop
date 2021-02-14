package ru.idcore;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Manufacturer rus = new Manufacturer("Russia");
        Manufacturer usa = new Manufacturer("USA");
        Manufacturer ger = new Manufacturer("Germany");

        Warehouse warehouse = Warehouse.getInstance();
        warehouse.getProducts().put(new Product("Апельсины", usa, Measure.MEASURE_KG, new BigDecimal("1.2"),Rating.RATING_3 ), 100.0);
        warehouse.getProducts().put(new Product("Помидоры", rus, Measure.MEASURE_KG, new BigDecimal("0.7"), Rating.RATING_2), 50.0);
        warehouse.getProducts().put(new Product("Слива", ger, Measure.MEASURE_KG, new BigDecimal("0.7"), Rating.RATING_2), 49.0);
        warehouse.getProducts().put(new Product("Картофель", usa, Measure.MEASURE_KG, new BigDecimal("0.7"), Rating.RATING_2), 200.0);
        warehouse.getProducts().put(new Product("Бананы", rus, Measure.MEASURE_KG, new BigDecimal("0.7"), Rating.RATING_2), 150.0);
        warehouse.getProducts().put(new Product("Молоко", usa, Measure.MEASURE_KG, new BigDecimal("0.7"), Rating.RATING_2), 50.0);
        warehouse.getProducts().put(new Product("Апельсины", rus, Measure.MEASURE_KG, new BigDecimal("0.7"), Rating.RATING_2), 30.0);

        WarehouseFilter warehouseFilter = new WarehouseFilterBuilder()
                //.setManufacturer(usa)
                //.setRating(Rating.RATING_2)
                .setCount(0.0)
                .build();
        Set<Map.Entry<Product, Double>> filteredCatalog = warehouseFilter.filter();

        for (Map.Entry<Product, Double> product: filteredCatalog
             ) {
            System.out.println(product);
        }

        warehouse.print();
    }
}
