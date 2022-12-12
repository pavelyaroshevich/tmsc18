package by.tms.models.clothes.shoes;

public class PumaShoes implements Shoes {
    @Override
    public void putOn() {
        System.out.println("Надел обувь Puma.");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял обувь Puma.");
    }
}
