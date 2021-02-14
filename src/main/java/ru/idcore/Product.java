package ru.idcore;

import java.math.BigDecimal;
import java.util.Objects;

public class Product {
    private String productName;
    private Manufacturer manufacturer;
    private Measure measure;
    private BigDecimal price;
    private Rating rating;

    public Product(String productName, Manufacturer manufacturer, Measure measure, BigDecimal price, Rating rating) {
        this.productName = productName;
        this.manufacturer = manufacturer;
        this.measure = measure;
        this.price = price;
        this.rating = rating;
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

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", manufacturer=" + manufacturer +
                ", measure=" + measure +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return getProductName().equals(product.getProductName()) &&
                getManufacturer().equals(product.getManufacturer()) &&
                getMeasure() == product.getMeasure() &&
                getPrice().equals(product.getPrice()) &&
                getRating() == product.getRating();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProductName(), getManufacturer(), getMeasure(), getPrice(), getRating());
    }

}
