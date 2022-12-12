package by.tms.models.clothes.jacket;

public class AdidasJacket implements Jacket {
    @Override
    public void putOn() {
        System.out.println("Надел куртку Adidas.");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял куртку Adidas.");
    }
}
