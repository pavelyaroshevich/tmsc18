package by.tms.services.clothes;

import by.tms.models.clothes.ClothesType;
import by.tms.models.clothes.Studio;

import static by.tms.models.clothes.ClothesType.*;

public class Main {
    public static void main(String[] args) {
        Studio studio = new Studio();
        ClothesType[] clothesTypes = {XXS, XS, S, M, L};
        studio.dressAMan(clothesTypes);
        studio.dressAWoman(clothesTypes);
    }
}
