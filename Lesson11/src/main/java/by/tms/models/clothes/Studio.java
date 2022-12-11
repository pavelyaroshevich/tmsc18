package by.tms.models.clothes;

public class Studio {
    private MenClothes menClothes;
    private WomenClothes womenClothes;

    public void dressAMan(Clothes[] clothes) {
        for (int i = 0; i < clothes.length; i++) {
            if (clothes[i] instanceof MenClothes) {
                ((MenClothes) clothes[i]).dressAMan();
            } else {
                System.out.println("Это не мужской тип одежды");
            }
        }
    }

    public void dressAWoman(Clothes[] clothes) {
        for (int i = 0; i < clothes.length; i++) {
            if (clothes[i] instanceof WomenClothes) {
                ((WomenClothes) clothes[i]).dressAWoman();
            } else {
                System.out.println("Это не мужской тип одежды");
            }
        }
    }
}
