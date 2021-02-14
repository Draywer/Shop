package ru.idcore;

import java.math.BigDecimal;

public class ProductBuilder implements IProductBuilder {
    private String productName;
    private Manufacturer manufacturer;
    private Measure measure;
    private BigDecimal price;
    private Rating rating;

    public ProductBuilder() {
    }

    public ProductBuilder setProductName(String productName) {
        this.productName = productName;
        return this;
    }

    public ProductBuilder setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }

    public ProductBuilder setMeasure(Measure measure) {
        this.measure = measure;
        return this;
    }

    public ProductBuilder setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public ProductBuilder setRating(Rating rating) {
        this.rating = rating;
        return this;
    }

    @Override
    public Product build() {
        if (productName == null) {
            throw new IllegalStateException("Ошибка! Необходимо ввести название продукта");
        }
        if (manufacturer == null) {
            throw new IllegalStateException("Ошибка! Необходимо выбрать производителя");
        }
        if (price == null) {
            throw new IllegalStateException("Ошибка! Необходимо ввести цену за единицу продукта");
        }
        if (measure == null) {
            throw new IllegalStateException("Ошибка! Необходимо ввести единицу измерения продукта");
        }
        if (rating == null) {
            rating = Rating.RATING_1;
        }
        return new Product(productName, manufacturer, measure, price, rating);
    }

}
