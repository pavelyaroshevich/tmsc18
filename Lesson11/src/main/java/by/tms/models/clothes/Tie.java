package by.tms.models.clothes;

public class Tie extends Clothes implements MenClothes {
    @Override
    public void dressAMan() {
        System.out.println("Галстук размером - " + getSize() + ", ценой - " + getPrice() + " и цветом - " + getColor());
    }

    public Tie(int size, int price, String color) {
        super(size, price, color);
    }
}
