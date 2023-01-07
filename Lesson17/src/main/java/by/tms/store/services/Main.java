package by.tms.store.services;

import by.tms.store.models.Product;
import by.tms.store.models.Store;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        Product product1 = new Product(24, "Cola", 100);
        Product product2 = new Product(20, "Sprite", 100);
        store.addProduct(product1);
        store.addProduct(product2);
    }
}
