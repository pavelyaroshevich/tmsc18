package by.tms.services.clothes;

import by.tms.models.clothes.*;

import static by.tms.models.clothes.ClothesType.*;

public class Main {
    public static void main(String[] args) {
        Studio studio = new Studio();
        Clothes[] clothes = {new Tie(XS, 100, "Black"),
                new Skirt(L, 50, "Yellow"),
                new Trousers(S, 75, "White"),
                new TeeShirt(M, 80, "Green")};
        studio.dressAMan(clothes);
        studio.dressAWoman(clothes);
    }
}
