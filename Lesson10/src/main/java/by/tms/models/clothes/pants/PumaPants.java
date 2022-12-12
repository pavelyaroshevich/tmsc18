package by.tms.models.clothes.pants;

public class PumaPants implements Pants {
    @Override
    public void putOn() {
        System.out.println("Надел штаны Puma.");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял штаны Puma.");
    }
}
