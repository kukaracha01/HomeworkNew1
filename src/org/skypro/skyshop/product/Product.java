package org.skypro.skyshop.product;

public abstract class Product {
    private String name;


    public Product(String name, int cost) {
        this.name = name;
    }

    public boolean isSpecial(boolean numberProducts) {
        return numberProducts;
    }

    public String getName() {
        return name;
    }

    public abstract int getCost();

    @Override
    public String toString() {
        return name + ": ";
    }
}
