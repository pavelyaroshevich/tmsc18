package by.tms.models.fruits;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Apple extends Fruits {
    private int price;

    public Apple(double weight, int price) {
        super(weight);
        this.price = price;
    }

    @Override
    public String getCostFruits() {
        return "Стоимость яблок - " + getWeight() * price;
    }

    public double resultPriceApple() {
        return getWeight() * price;
    }
}
