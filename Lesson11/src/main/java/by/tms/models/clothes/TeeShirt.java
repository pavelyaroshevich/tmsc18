package by.tms.models.clothes;

public class TeeShirt extends Clothes implements MenClothes, WomenClothes {
    @Override
    public void dressAMan() {
        System.out.println("Мужчина надел футболку размером - " + getClothesType() + ", ценой - " + getPrice() + " и цветом - " + getColor());
    }

    @Override
    public void dressAWoman() {
        System.out.println("Женщина надела футболку размером - " + getClothesType() + ", ценой - " + getPrice() + " и цветом - " + getColor());
    }

    public TeeShirt(ClothesType clothesType, int price, String color) {
        super(clothesType, price, color);
    }
}
