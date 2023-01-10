package by.tms.store.services;

import by.tms.store.models.Product;
import by.tms.store.models.Shop;
import by.tms.store.utils.ProductIdComparator;
import by.tms.store.utils.ProductPriceComparator;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Product milk = new Product(1L, "Brest-Litovsk", 2);
        Product cheese = new Product(3L, "Brest-Litovsk", 10);
        Product bear = new Product(2L, "Baltika", 3);
        Product juice = new Product(4L, "Dobri", 5);
        shop.addProduct(milk);
        shop.addProduct(cheese);
        shop.addProduct(bear);
        shop.addProduct(juice);

        System.out.println(shop.getListOfProducts()); // по порядку добавления
        Set<Product> products = new TreeSet<>(new ProductPriceComparator());
        products.addAll(shop.getAllProducts());
        System.out.println(products);

        shop.deleteProduct(3L);
        TreeSet<Product> products1 = new TreeSet<>(new ProductIdComparator());
        products1.addAll(shop.getAllProducts());
        System.out.println(products1);

        shop.editProduct(new Product(4L, "Rich", 7));
        System.out.println(shop.getAllProducts());
    }
}
