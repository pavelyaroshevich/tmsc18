package by.tms.models.robot;

public class SamsungHead implements IHead {
    private int price;

    public SamsungHead(int price) {
        this.price = price;
    }

    @Override
    public void speak() {

    }

    @Override
    public int getPrice() {
        return price;
    }
}
