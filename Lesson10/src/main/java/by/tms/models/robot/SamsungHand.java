package by.tms.models.robot;

public class SamsungHand implements IHand {
    private int price;

    public SamsungHand(int price) {
        this.price = price;
    }

    public SamsungHand() {
    }

    @Override
    public void upHand() {
        System.out.println("Поднял руку Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
