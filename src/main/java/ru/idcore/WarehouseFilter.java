package ru.idcore;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class WarehouseFilter {
    private String productName;
    private Manufacturer manufacturer;
    private Measure measure;
    private BigDecimal price;
    private Rating rating;
    private Double count;

    public WarehouseFilter(String productName, Manufacturer manufacturer, Measure measure, BigDecimal price, Rating rating, Double count) {
        this.productName = productName;
        this.manufacturer = manufacturer;
        this.measure = measure;
        this.price = price;
        this.rating = rating;
        this.count = count;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Measure getMeasure() {
        return measure;
    }

    public void setMeasure(Measure measure) {
        this.measure = measure;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public Double getCount() {
        return count;
    }

    public void setCount(Double count) {
        this.count = count;
    }

    public Set<Map.Entry<Product, Double>> filter() {
        Warehouse warehouse = Warehouse.getInstance();
        Set<Map.Entry<Product, Double>> result;

        result = warehouse.getProducts().entrySet().stream()
                .filter(x -> productName == null || x.getKey().getProductName().equals(productName))
                .filter(x -> manufacturer == null || x.getKey().getManufacturer().equals(manufacturer))
                .filter(x -> measure == null || x.getKey().getMeasure().equals(measure))
                .filter(x -> price == null || x.getKey().getPrice().equals(price))
                .filter(x -> rating == null || x.getKey().getRating().equals(rating))
                .filter(x-> count == null || x.getValue() >= count)
                .collect(Collectors.toSet());

        return result;
    }
}
