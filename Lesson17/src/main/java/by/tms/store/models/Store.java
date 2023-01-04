package by.tms.store.models;

import java.util.List;

public class Store {
    List<String> listOfProducts;
    Product product;

    public void addProduct(Product product) {
        listOfProducts.add(String.valueOf(product));
    }

    public List<String> getAllProducts(List<String> listOfProducts) {
        return listOfProducts;
    }

    public void deleteProduct(int id) {
        listOfProducts.remove(product.getId());
    }

    public void editProduct(Product product) {

    }
}
