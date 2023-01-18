package by.tms.store.models;

import lombok.*;

import java.util.ArrayList;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Shop {
    private ArrayList<Product> listOfProducts = new ArrayList<>();
}
