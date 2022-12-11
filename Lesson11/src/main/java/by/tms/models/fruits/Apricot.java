package by.tms.models.fruits;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Apricot extends Fruits {
    private int price = 5;
    private static double resultWeightApricot = 0;

    public Apricot(double weight) {
        super(weight);
        resultWeightApricot += weight;
    }

    @Override
    public String getCostFruits() {
        return "Стоимость абрикосов - " + getWeight() * price;
    }

    public double resultPriceApricot() {
        return resultWeightApricot * price;
    }

}
