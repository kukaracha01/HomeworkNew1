package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SimpleProduct;

import java.util.Objects;

public class ProductBasket {
    private final Product[] products = new Product[5];

    public void addProduct(Product product) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                continue;
            } else {
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
        }
        System.out.println("Итого: " + allCost());
        System.out.println("Специальных товаров: " + countOfSpecialProducts());
    }

    private int countOfSpecialProducts() {
        int count = 0;
        for (int i = 0; i < products.length; i++) {
            if (products[i].isSpecial()) {
                count = count + 1;
            }
        }
        return count;
    }

    public boolean nameProduct(String name) {
        boolean found = false;
        for (int i = 0; i < products.length; i++) {
            if (Objects.equals(products[i].getName(), name)) {
                found = true;
                break;
            }
        }
        return found;
    }

    public void clearingBasket() {
        for (int i = 0; i < products.length; i++) {
            if ((products[i] != null)) {
                products[i] = null;
            }
        }
    }
}
