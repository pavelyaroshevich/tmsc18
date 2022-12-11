package by.tms.models.clothes.jacket;

public class PumaJacket implements Jacket {
    @Override
    public void putOn() {
        System.out.println("Надел куртку Puma.");
    }

    @Override
    public void remove() {
        System.out.println("Снял куртку Puma.");
    }
}
