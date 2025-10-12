package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

import java.util.Objects;

public class ProductBasket {
    private Product[] products = new Product[5];

    public void addProduct(Product product) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = product;
                System.out.println(products[i]);
                break;
            }
        }
    }

    public int allCost() {
        int cost = 0;
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                cost += products[i].getCost();
            }
        }
        return cost;
    }

    public void basketContents() {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                System.out.println(products[i]);
            }
            break;
        }
        System.out.println("Итого: " + allCost());
    }

    public boolean nameProduct(String name) {
        for (int i = 0; i < products.length; i++) {
            name = products[i].getName();
            if (products[i].getName() != null) {
                Objects.equals(products[i].getName(), name);
            }
        }
        return true;
    }

    public void clearingBasket() {
        for (int i = 0; i < products.length; i++) {
            if ((products[i] != null)) {
                products[i] = null;
            }
        }
    }
}
