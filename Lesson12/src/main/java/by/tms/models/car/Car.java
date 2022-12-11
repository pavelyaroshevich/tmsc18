package by.tms.models.car;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Random;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    private String model;
    private int speed;
    private int price;

    public void start() throws CarNotStartException {
        Random random = new Random();
        if (random.nextInt(21) % 2 == 0) {
            throw new CarNotStartException("Машина " + model + " не завелась");
        } else {
            System.out.println("Автомобиль с маркой - " + model + " завелся");
        }
    }
}
