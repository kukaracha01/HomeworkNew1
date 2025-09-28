package org.skypro.skyshop.product;

public class FixPriceProduct extends Product {
    private String nameProduct;
    private static final int FIX_PRICE = 15;

    public FixPriceProduct(String name, int cost, String nameProduct) {
        super(name, cost);
        this.nameProduct = nameProduct;
    }

    @Override
    public int getCost() {
        return FIX_PRICE;
    }
}
