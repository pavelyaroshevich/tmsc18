package by.tms.models.clothes;

public class Trousers extends Clothes implements MenClothes, WomenClothes {
    public Trousers(ClothesType clothesType, int price, String color) {
        super(clothesType, price, color);
    }

    @Override
    public void dressAMan() {
        System.out.println("Мужчина надел штаны размером - " + getClothesType() + ", ценой - " + getPrice() + " и цветом - " + getColor());
    }

    @Override
    public void dressAWoman() {
        System.out.println("Женщина надела футболку размером - " + getClothesType() + ", ценой - " + getPrice() + " и цветом - " + getColor());
    }
}
