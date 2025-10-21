package org.skypro.skyshop.product;

public abstract class Product {
    private String name;


    public Product(String name) {
        this.name = name;
    }

    public abstract boolean isSpecial();

    public String getName() {
        return name;
    }

    public abstract int getCost();

    @Override
    public String toString() {
        return name + ": " + getCost();
    }
}
