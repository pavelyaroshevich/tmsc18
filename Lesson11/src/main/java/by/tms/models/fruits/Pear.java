package by.tms.models.fruits;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pear extends Fruits {
    private int price = 7;
    private static double resultWeightPear = 0;

    public Pear(double weight) {
        super(weight);
        resultWeightPear += weight;
    }

    @Override
    public String getCostFruits() {
        return "Стоимость груш - " + getWeight() * price;
    }

    public double resultPricePear() {
        return resultWeightPear * price;
    }

}
