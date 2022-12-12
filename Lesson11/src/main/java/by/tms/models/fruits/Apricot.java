package by.tms.models.fruits;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Apricot extends Fruits {
    private int price;

    public Apricot(double weight, int price) {
        super(weight);
        this.price = price;
    }

    @Override
    public String getCostFruits() {
        return "Стоимость абрикосов - " + getWeight() * price;
    }

    public double resultPriceApricot() {
        return getWeight() * price;
    }

}
