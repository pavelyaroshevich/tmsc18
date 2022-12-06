package by.tms.models.flowers;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Flower {
    private String name;
    private int cost;
    private static int count;

    public Flower(String name, int cost) {
        this.name = name;
        this.cost = cost;
        count++;
    }

    public static int getCount() {
        return count;
    }
}
