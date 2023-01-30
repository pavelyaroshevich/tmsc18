package by.tms.services;

import by.tms.models.Customer;
import by.tms.models.LeastQueueCashBoxStrategy;
import by.tms.models.RandomCashBoxStrategy;
import by.tms.models.Shop;

import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Shop shop = new Shop(3);
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            Customer b = new Customer(shop, "Customer" + i, new String[]{"Вода", "Колбаса"},
                    random.nextInt(2) == 0 ? new LeastQueueCashBoxStrategy() : new RandomCashBoxStrategy());
            b.start();
            Thread.sleep(100);
        }
    }
}
