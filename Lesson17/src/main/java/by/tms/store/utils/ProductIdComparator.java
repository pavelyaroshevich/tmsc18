package by.tms.store.utils;

import by.tms.store.models.Product;

import java.util.Comparator;

public class ProductIdComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o2.getId().compareTo(o1.getId());
    }
}
