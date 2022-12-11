package by.tms.models.clothes;

public class TeeShirt extends Clothes implements MenClothes, WomenClothes {
    @Override
    public void dressAMan() {
        System.out.println("Футболка размером - " + getSize() + ", ценой - " + getPrice() + " и цветом - " + getColor());
    }

    @Override
    public void dressAWoman() {
        System.out.println("Футболка размером - " + getSize() + ", ценой - " + getPrice() + " и цветом - " + getColor());
    }

    public TeeShirt(int size, int price, String color) {
        super(size, price, color);
    }
}
