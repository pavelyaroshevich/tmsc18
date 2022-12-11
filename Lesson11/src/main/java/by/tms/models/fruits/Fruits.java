package by.tms.models.fruits;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class Fruits {
    private double weight;
    public static double resultWeight = 0;

    public static void printManufactureInfo() {
        System.out.println("Made in Belarus");
    }

    public abstract String getCostFruits();
}
