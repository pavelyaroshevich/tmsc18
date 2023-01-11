package by.tms.store.utils;

import by.tms.store.models.Product;

import java.util.Comparator;

public class ProductReverseIdComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getId().compareTo(o2.getId());
    }
}
