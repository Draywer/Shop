package ru.idcore;

import java.math.BigDecimal;

public class WarehouseFilterBuilder implements IWarehouseFilterBuilder {
    private String productName;
    private Manufacturer manufacturer;
    private Measure measure;
    private BigDecimal price;
    private Rating rating;
    private Double count;

    public WarehouseFilterBuilder() {
        productName = null;
        manufacturer = null;
        measure = null;
        price = null;
        rating = null;
        count = null;
    }

    public WarehouseFilterBuilder setProductName(String productName) {
        this.productName = productName;
        return this;
    }

    public WarehouseFilterBuilder setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }

    public WarehouseFilterBuilder setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public WarehouseFilterBuilder setMeasure(Measure measure) {
        this.measure = measure;
        return this;
    }

    public WarehouseFilterBuilder setRating(Rating rating) {
        this.rating = rating;
        return this;
    }

    public WarehouseFilterBuilder setCount(Double count) {
        this.count = count;
        return this;
    }

    @Override
    public WarehouseFilter build() {
        return new WarehouseFilter(productName, manufacturer, measure, price, rating, count);
    }
}
