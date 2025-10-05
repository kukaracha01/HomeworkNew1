package org.skypro.skyshop;

import org.skypro.skyshop.product.Product;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.SimpleProduct;

public class App {
    public static void main(String[] args) throws IllegalAccessException {

        Product products1 = new SimpleProduct("Дыня", 26);
        Product products2 = new SimpleProduct("Сок", 15);
//        Product products3 = new Product("Печенья", 6);
//        Product products4 = new Product("Свекла", 4);
//        Product products5 = new Product("Лимон", 12);


        ProductBasket productBasket = new ProductBasket();

        productBasket.addProduct(products1);
        productBasket.addProduct(products2);
//        productBasket.addProduct(products3);
//        productBasket.addProduct(products4);
//        productBasket.addProduct(products5);
//        productBasket.basketContents();
//        productBasket.allCost();
//        productBasket.nameProduct("Дыня");
//        productBasket.nameProduct("Ромашка");
//        productBasket.clearingBasket();
//        productBasket.allCost();
//        productBasket.nameProduct("Дыня");
//        productBasket.nameProduct("Ромашка");
    }

}
