package by.tms.store.models;

import by.tms.store.services.ShopAware;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ShopService implements ShopAware {
    private Shop shop;

    @Override
    public boolean addProduct(Product product) {
        if (isValidProduct(product)) {
            return shop.getListOfProducts().add(product);
        }
        return false;
    }

    @Override
    public boolean deleteProduct(Long productId) {
        return shop.getListOfProducts().removeIf(product -> product.getId().equals(productId));
    }

    @Override
    public boolean editProduct(Product product) {
        if (!shop.getListOfProducts().isEmpty()) {
            for (Product currentProduct : shop.getListOfProducts()) {
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
        return shop.getListOfProducts();
    }

    private static boolean isValidProduct(Product product) {
        return product.getId() != null && !"".equals(product.getName()) && product.getPrice() > 0;
    }
}
