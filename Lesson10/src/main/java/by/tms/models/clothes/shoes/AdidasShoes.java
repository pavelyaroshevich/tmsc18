package by.tms.models.clothes.shoes;

public class AdidasShoes implements Shoes {
    @Override
    public void putOn() {
        System.out.println("Надел штаны Adidas.");
    }

    @Override
    public void remove() {
        System.out.println("Снял обувь Adidas.");
    }
}
