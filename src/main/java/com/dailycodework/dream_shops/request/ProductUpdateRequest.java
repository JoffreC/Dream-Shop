package com.dailycodework.dream_shops.request;


import com.dailycodework.dream_shops.model.Category;

import java.math.BigDecimal;
import java.util.Objects;

public class ProductUpdateRequest {
    private String name;
    private String brand;
    private BigDecimal price;
    private Integer inventory;
    private String description;

    private Category category;

    public ProductUpdateRequest(String name, String brand, BigDecimal price, Integer inventory, String description, Category category) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.inventory = inventory;
        this.description = description;
        this.category = category;
    }

    public ProductUpdateRequest() {}

    @Override
    public String toString() {
        return "ProductUpdateRequest{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", inventory=" + inventory +
                ", description='" + description + '\'' +
                ", category=" + category +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductUpdateRequest that = (ProductUpdateRequest) o;
        return Objects.equals(name, that.name) && Objects.equals(brand, that.brand) && Objects.equals(price, that.price) && Objects.equals(inventory, that.inventory) && Objects.equals(description, that.description) && Objects.equals(category, that.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, brand, price, inventory, description, category);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getInventory() {
        return inventory;
    }

    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
