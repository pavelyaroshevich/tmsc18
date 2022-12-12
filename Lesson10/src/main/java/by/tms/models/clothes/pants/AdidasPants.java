package by.tms.models.clothes.pants;

public class AdidasPants implements Pants {
    @Override
    public void putOn() {
        System.out.println("Надел штаны Adidas.");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял штаны Adidas.");
    }
}
