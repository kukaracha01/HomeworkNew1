package org.skypro.skyshop.product;

public class FixPriceProduct extends Product {
    private static final int FIX_PRICE = 15;

    public FixPriceProduct(String name) {
        super(name);
    }

    @Override
    public int isSpecial() {
        return 0;
    }

    @Override
    public int getCost() {
        return FIX_PRICE;
    }

    @Override
    public String toString() {
        return Product.class.getName() + ": " + FIX_PRICE;
    }
}
