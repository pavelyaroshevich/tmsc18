package by.tms.models.clothes;

public class Tie extends Clothes implements MenClothes {
    public Tie(ClothesType clothesType, int price, String color) {
        super(clothesType, price, color);
    }

    @Override
    public void dressAMan() {
        System.out.println("Мужчина надел галстук размером - " + getClothesType() + ", ценой - " + getPrice() + " и цветом - " + getColor());
    }
}
