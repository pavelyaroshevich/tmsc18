package by.tms.store.models;

import by.tms.store.services.ShopAware;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Shop implements ShopAware {
    private ArrayList<Product> listOfProducts = new ArrayList<>();

    @Override
    public boolean addProduct(Product product) {
        if (isValidProduct(product)) {
            return listOfProducts.add(product);
        }
        return false;
    }

    @Override
    public boolean deleteProduct(Long productId) {
        return listOfProducts.removeIf(product -> product.getId().equals(productId));
    }

    @Override
    public boolean editProduct(Product product) {
        if (!listOfProducts.isEmpty()) {
            for (Product currentProduct : listOfProducts) {
                if (currentProduct.getId().equals(product.getId())) {
                    currentProduct.setName(product.getName());
                    currentProduct.setPrice(product.getPrice());
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public List<Product> getAllProducts() {
        return listOfProducts;
    }

    private static boolean isValidProduct(Product product) {
        return product.getId() != null && !"".equals(product.getName()) && product.getPrice() > 0;
    }
}
