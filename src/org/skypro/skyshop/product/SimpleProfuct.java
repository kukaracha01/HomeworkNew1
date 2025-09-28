package org.skypro.skyshop.product;

public class SimpleProfuct extends Product {

    private int cost;

    public SimpleProfuct(String name, int cost, int cost1) {
        super(name, cost);
        this.cost = cost1;
    }


    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "SimpleProfuct{" +
                "cost=" + cost +
                '}';
    }
}
