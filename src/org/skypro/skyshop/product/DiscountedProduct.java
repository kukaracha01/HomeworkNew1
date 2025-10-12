package org.skypro.skyshop.product;

public class DiscountedProduct extends Product{
    private int baseCost;
    private int saleCost;

    public DiscountedProduct(String name, int baseCost, int saleCost) {
        super(name);
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
    public int isSpecial() {
        return 0;
    }

    @Override
    public int getCost() {
        int costAfterSale = 0;
        costAfterSale = baseCost - saleCost;
        return costAfterSale;
    }

    @Override
    public String toString() {
        return "DiscountedProduct{" +
                "saleCost=" + saleCost +
                ", baseCost=" + baseCost +
                '}';
    }
}
