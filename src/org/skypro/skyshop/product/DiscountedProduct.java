package org.skypro.skyshop.product;

public class DiscountedProduct extends Product{
    private int baseCost;
    private int saleCost;

    public DiscountedProduct(String name, int cost, int baseCost, int saleCost) {
        super(name, cost);
        this.baseCost = baseCost;
        this.saleCost = saleCost;
    }

    public int getBaseCost() {
        return baseCost;
    }

    public int getSaleCost() {
        return saleCost;
    }

    @Override
    public int getCost() {
        baseCost = baseCost - saleCost;
        return baseCost;
    }

    @Override
    public String toString() {
        return "DiscountedProduct{" +
                "saleCost=" + saleCost +
                ", baseCost=" + baseCost +
                '}';
    }
}
