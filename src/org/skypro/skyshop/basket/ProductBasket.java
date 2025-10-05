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
            } else {
                System.out.println("Невозможно добавить продукт");
            }
        }
    }

    public int allCost() {
        int cost = 0;
        for (Product product : products) {
            if (products != null) {
                cost += product.getCost();
            } else if (cost == 0) {
                System.out.println("В корзине пусто");
            }
        }
        return cost;
    }

    public void basketContents() {
        for (Product product : products) {
            if (products != null) {
                System.out.println(product);
            }
            System.out.println("Итого: " + allCost());
            break;
        }
    }

    public String nameProduct(String name) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getName() != null) {
                Objects.equals(products[i].getName(), name);
            } else return name;
        }
        return name;
    }

    public void clearingBasket() {
        for (int i = 0; i < products.length; i++) {
            if ((products[i] != null)) {
                products[i] = null;

            }
        }
    }
}
