package by.tms.services.flowers;

import by.tms.models.flowers.Bouquet;
import by.tms.models.flowers.Flower;
import by.tms.models.flowers.FlowerMarket;

public class Main {
    public static void main(String[] args) {
        FlowerMarket flowerMarket = new FlowerMarket();
        Bouquet bouquet = flowerMarket.getBouquet("ROSE", "ROSE", "ROSE", "ROSE");
        Bouquet bouquet1 = flowerMarket.getBouquet("ASTRA", "ROSE");
        Bouquet bouquet2 = flowerMarket.getBouquet("ROSE", "LILY", "LILY");
        bouquet.calculatePrice();
        bouquet.infoAboutBouquet();
        System.out.println("_______________________");
        bouquet1.calculatePrice();
        bouquet1.infoAboutBouquet();
        System.out.println("_______________________");
        bouquet2.calculatePrice();
        bouquet2.infoAboutBouquet();
        System.out.println("_______________________");
        System.out.println("Количество проданных цветов - " + Flower.getCount());
    }
}
