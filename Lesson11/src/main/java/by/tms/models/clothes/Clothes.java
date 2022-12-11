package by.tms.models.clothes;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public abstract class Clothes {
    private int size;
    private int price;
    private String color;
}

