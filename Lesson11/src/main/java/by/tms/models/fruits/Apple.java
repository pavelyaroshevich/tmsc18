package by.tms.models.fruits;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Apple extends Fruits {
    private int price = 10;
    private static double resultWeightApple = 0;

    public Apple(double weight) {
        super(weight);
        resultWeightApple += weight;
    }

    @Override
    public String getCostFruits() {
        return "Стоимость яблок - " + getWeight() * price;
    }

    public double resultPriceApple() {
        return resultWeightApple * price;
    }
}
