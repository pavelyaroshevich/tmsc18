package by.tms.store.services;

import by.tms.store.models.Product;
import by.tms.store.models.Shop;
import by.tms.store.models.ShopService;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Comparator<Product> comparatorById = Comparator.comparing(Product::getId);
        Comparator<Product> comparatorByPrice = Comparator.comparing(Product::getPrice);
        Comparator<Product> comparatorReversedById = Comparator.comparing(Product::getId).reversed();
        Shop shop = new Shop();
        ShopService shopService = new ShopService(shop);

        Product milk = new Product(1L, "Brest-Litovsk", 2);
        Product cheese = new Product(3L, "Brest-Litovsk", 10);
        Product bear = new Product(2L, "Baltika", 3);
        Product juice = new Product(4L, "Dobri", 5);

        shopService.addProduct(milk);
        shopService.addProduct(cheese);
        shopService.addProduct(bear);
        shopService.addProduct(juice);

        System.out.println("По порядку добавления " + shop.getListOfProducts());
        shopService.getAllProducts().sort(comparatorByPrice);
        System.out.println("По цене " + shopService.getAllProducts());

        shopService.deleteProduct(3L);
        shopService.getAllProducts().sort(comparatorReversedById);
        System.out.println("По ид от большего к меньшему " + shopService.getAllProducts());

        shopService.editProduct(new Product(4L, "Rich", 7));
        System.out.println("После изменения " + shopService.getAllProducts());
    }
}
