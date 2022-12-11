package by.tms.models.clothes;

public class Skirt extends Clothes implements WomenClothes {
    @Override
    public void dressAWoman() {
        System.out.println("Юбка размером - " + getSize() + ", ценой - " + getPrice() + " и цветом - " + getColor());
    }

    public Skirt(int size, int price, String color) {
        super(size, price, color);
    }
}
