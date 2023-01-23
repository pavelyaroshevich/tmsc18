package by.tms.store.services;

import by.tms.store.models.Product;
import by.tms.store.models.Shop;
import by.tms.store.models.ShopService;

import java.util.*;

public class Main {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Comparator<Product> comparatorById = Comparator.comparing(Product::getId);
        Comparator<Product> comparatorByPrice = Comparator.comparing(Product::getPrice);
        Comparator<Product> comparatorReversedById = Comparator.comparing(Product::getId).reversed();
        Comparator<Product> comparatorReversedByPrice = Comparator.comparing(Product::getPrice).reversed();
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
//
//        System.out.println("По порядку добавления " + shop.getListOfProducts());
//        shopService.getAllProducts().sort(comparatorByPrice);
//        System.out.println("По цене " + shopService.getAllProducts());
//
//        shopService.deleteProduct(3L);
//        shopService.getAllProducts().sort(comparatorReversedById);
//        System.out.println("По ид от большего к меньшему " + shopService.getAllProducts());
//
//        shopService.editProduct(new Product(4L, "Rich", 7));
//        System.out.println("После изменения " + shopService.getAllProducts());
        System.out.println("Выберите действие: " +
                "1. Вывод всех товаров. " +
                "2. Добавление товара. " +
                "3. Удаление товара. " +
                "4. Редактирование товара. " +
                "5. Выход. ");
        switch (scanner.nextInt()) {
            case 1: {
                System.out.println("Выберите тип сортировки : " +
                        "1. По цене(возрастание)\n" +
                        "2. По цене(убывание)\n" +
                        "3. По добавлению(сначала новые, потом более старые)");
                switch (scanner.nextInt()) {
                    case 1:
                        shopService.getAllProducts().sort(comparatorByPrice);
                        System.out.println(shopService.getAllProducts());
                        break;
                    case 2:
                        shopService.getAllProducts().sort(comparatorReversedByPrice);
                        System.out.println(shopService.getAllProducts());
                        break;
                    case 3:
                        System.out.println(shopService.getAllProducts());
                        break;
                }
            }
            case 2: {

            }

        }
    }
}
