package by.tms.robot.legs;

public class SonyLeg implements ILeg {
    private int price;

    public SonyLeg(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Сделал шаг Sony");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
