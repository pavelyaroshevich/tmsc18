package by.tms.models.clothes.shoes;

public class AdidasShoes implements Shoes {
    @Override
    public void putOn() {
        System.out.println("Надел штаны Adidas.");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял обувь Adidas.");
    }
}
