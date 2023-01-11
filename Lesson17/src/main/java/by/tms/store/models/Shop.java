package by.tms.store.models;

import lombok.*;

import java.util.ArrayList;

@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Shop {
    private ArrayList<Product> listOfProducts = new ArrayList<>();


}
