package by.tms.models.flowers;

public class Bouquet {
    private Flower[] flowers;

    public Bouquet(Flower[] flowers) {
        this.flowers = flowers;
    }

    public void calculatePrice() {
        int price = 0;
        for (int i = 0; i < flowers.length; i++) {
            price += flowers[i].getCost();
        }
        System.out.println("Стоимость букета  = " + price);
    }

    public void infoAboutBouquet() {
        System.out.print("Букет состоит из : ");
        for (int i = 0; i < flowers.length; i++) {
            System.out.print(flowers[i].getName() + " стоимостью  - " + flowers[i].getCost() + ", ");
        }
        System.out.println();
    }

    public Flower[] getFlowers() {
        return flowers;
    }
}
