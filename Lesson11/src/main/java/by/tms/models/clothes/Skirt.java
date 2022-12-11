package by.tms.models.clothes;

public class Skirt extends Clothes implements WomenClothes {
    @Override
    public void dressAWoman() {
        System.out.println("Женщина надела юбку размером - " + getClothesType() + ", ценой - " + getPrice() + " и цветом - " + getColor());
    }

    public Skirt(ClothesType clothesType, int price, String color) {
        super(clothesType, price, color);
    }
}
