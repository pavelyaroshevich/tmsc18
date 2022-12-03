package by.tms.models.flowers;

import lombok.Getter;

@Getter
public enum FlowerType {
    ROSE(3), LILY(1), ASTRA(2), TULIP(5);
    private int cost;

    FlowerType(int cost) {
        this.cost = cost;
    }
}
