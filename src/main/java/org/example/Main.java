package org.example;

import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<Product>();
        products.add(new Product("Молоко", 50, 4.5));
        products.add(new Product("Хлеб", 30, 4.0));
        Category category = new Category("Бакалея", products);
        Basket basket = new Basket();
        Product product = new Product("Молоко", 50, 4.5);
        basket.addProduct(product);
        basket.removeProduct(product);
        System.out.println(product);

        User user1 = new User("low_kek", "qwerty");
        User user2 = new User("artem03414", "sova");
        User user3 = new User("fs-134134", "hsdf");

        ArrayList<Product> products1 = new ArrayList<Product>();
        products1.add(new Product("Молоко", 50, 4.5));
        products1.add(new Product("Хлеб", 30, 4.0));
        Category category1 = new Category("Бакалея", products1);

        ArrayList<Product> products2 = new ArrayList<Product>();
        products2.add(new Product("Яблоки", 80, 4.2));
        products2.add(new Product("Груши", 70, 4.1));
        Category category2 = new Category("Фрукты", products2);

        ArrayList<Category> catalog = new ArrayList<Category>();
        catalog.add(category1);
        catalog.add(category2);
        System.out.println(products1);
        System.out.println(products2);
    }
}
