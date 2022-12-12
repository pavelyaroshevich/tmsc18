package by.tms.models.fruits;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pear extends Fruits {
    private int price;

    public Pear(double weight, int price) {
        super(weight);
        this.price = price;
    }

    @Override
    public String getCostFruits() {
        return "Стоимость груш - " + getWeight() * price;
    }

    public double resultPricePear() {
        return getWeight() * price;
    }

}
