package by.tms.store.services;

import by.tms.store.models.Product;
import by.tms.store.models.Shop;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Comparator<Product> comparatorById = Comparator.comparing(Product::getId);
        Comparator<Product> comparatorByPrice = Comparator.comparing(Product::getPrice);
        Comparator<Product> comparatorReversedById = Comparator.comparing(Product::getId).reversed();
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
        Set<Product> products = new TreeSet<>(comparatorByPrice);
        products.addAll(shop.getAllProducts());
        System.out.println(products);

        shop.deleteProduct(3L);
        TreeSet<Product> products1 = new TreeSet<>(comparatorReversedById);
        products1.addAll(shop.getAllProducts());
        System.out.println(products1);

        shop.editProduct(new Product(4L, "Rich", 7));
        System.out.println(shop.getAllProducts());
    }
}
