package by.tms.models.robot;

public class ToshibaHand implements IHand {
    private int price;

    public ToshibaHand(int price) {
        this.price = price;
    }

    @Override
    public void upHand() {
        System.out.println("Поднял руку Toshiba");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
