package by.tms.models.flowers;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FlowerMarket {
    private Bouquet bouquet;
    private int countFlowers;

    public Bouquet getBouquet(String... flowers) {
        Flower[] flower = new Flower[flowers.length];
        for (int i = 0; i < flowers.length; i++) {
            FlowerType flowerType = FlowerType.valueOf(flowers[i]);
            flower[i] = new Flower(flowerType.name(), flowerType.getCost());
            countFlowers++;
        }
        return new Bouquet(flower);
    }

    public void sellFlowers() {
        System.out.println("Всего было продано " + countFlowers + " цветов");
    }
}
