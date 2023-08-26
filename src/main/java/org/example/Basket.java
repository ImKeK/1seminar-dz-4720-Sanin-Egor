package org.example;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Product> items;

    public Basket() {
        items = new ArrayList<Product>();
    }

    /**
     *
     * @param product - единица товара
     * @apiNote метод, используемый для добавления продукта в корзину.
     */
    public void addProduct(Product product) {
        items.add(product);
    }

    /**
     *
     * @param product - единица товара
     *
     * @apiNote  метод, используемый для удаления продуктов из корзины.
     */
    public void removeProduct(Product product) {
        items.remove(product);
    }

    public ArrayList<Product> getItems() {
        return items;
    }
}