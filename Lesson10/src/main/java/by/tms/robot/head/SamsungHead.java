package by.tms.robot.head;

public class SamsungHead implements IHead {
    private int price;

    public SamsungHead(int price) {
        this.price = price;
    }

    @Override
    public void speak() {
        System.out.println("Голова говорит Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
