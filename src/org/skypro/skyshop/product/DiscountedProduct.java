package org.skypro.skyshop.product;

public class DiscountedProduct extends Product{
    private int baseCost;
    private int saleInPercent;

    public DiscountedProduct(String name, int baseCost, int saleInPercent) {
        super(name);
        this.baseCost = baseCost;
        this.saleInPercent = saleInPercent;
    }

    public int getBaseCost() {
        return baseCost;
    }

    public int getSaleInPercent() {
        return saleInPercent;
    }

    @Override
    public boolean isSpecial() {
        return true;
    }

    @Override
    public int getCost() {
        baseCost = baseCost * saleInPercent / 100;
        return baseCost;
    }

    @Override
    public String toString() {
        return getName() + ": " + baseCost + " (" + saleInPercent + "%)";
    }
}
