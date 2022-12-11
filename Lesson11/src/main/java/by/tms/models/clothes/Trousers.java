package by.tms.models.clothes;

public class Trousers extends Clothes implements MenClothes, WomenClothes {
    @Override
    public void dressAMan() {
        System.out.println("Штаны размером - " + getSize() + ", ценой - " + getPrice() + " и цветом - " + getColor());
    }

    @Override
    public void dressAWoman() {
        System.out.println("Штаны размером - " + getSize() + ", ценой - " + getPrice() + " и цветом - " + getColor());
    }

    public Trousers(int size, int price, String color) {
        super(size, price, color);
    }
}
