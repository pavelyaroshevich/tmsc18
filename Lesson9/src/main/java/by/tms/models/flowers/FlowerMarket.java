package by.tms.models.flowers;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FlowerMarket {
    private Bouquet bouquet;

    public Bouquet getBouquet(String... flowers) {
        Flower[] flower = new Flower[flowers.length];
        for (int i = 0; i < flowers.length; i++) {
            FlowerType flowerType = FlowerType.valueOf(flowers[i]);
            flower[i] = new Flower(flowerType.name(), flowerType.getCost());
        }
        return new Bouquet(flower);
    }
}
