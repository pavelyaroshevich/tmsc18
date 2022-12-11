package by.tms.models.clothes;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public abstract class Clothes {
    private ClothesType clothesType;
    private int price;
    private String color;
}

