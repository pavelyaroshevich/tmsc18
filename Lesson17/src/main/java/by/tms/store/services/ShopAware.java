package by.tms.store.services;

import by.tms.store.models.Product;

import java.util.List;

public interface ShopAware {
    boolean addProduct(Product product);

    boolean deleteProduct(Long productId);

    boolean editProduct(Product product);

    List<Product> getAllProducts();
}
