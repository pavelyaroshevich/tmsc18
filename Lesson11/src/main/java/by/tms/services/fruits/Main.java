package by.tms.services.fruits;

import by.tms.models.fruits.Apple;
import by.tms.models.fruits.Apricot;
import by.tms.models.fruits.Pear;

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple(2, 10);
        Apple apple1 = new Apple(1.2, 10);
        Apple apple2 = new Apple(2, 10);
        System.out.println(apple.getCostFruits());
        System.out.println(apple1.getCostFruits());
        System.out.println(apple2.getCostFruits());
        Apple.printManufactureInfo();
        System.out.println("Общая стоимость отдельно проданных яблок " + apple.resultPriceApple());
        Pear pear = new Pear(5, 7);
        Pear pear1 = new Pear(3, 7);
        Pear pear2 = new Pear(2, 7);
        System.out.println(pear.getCostFruits());
        System.out.println(pear1.getCostFruits());
        System.out.println(pear2.getCostFruits());
        Pear.printManufactureInfo();
        System.out.println("Общая стоимость отдельно проданных груш " + pear.resultPricePear());
        Apricot apricot = new Apricot(1.5, 5);
        Apricot apricot1 = new Apricot(4, 5);
        Apricot apricot2 = new Apricot(2.4, 5);
        System.out.println(apricot.getCostFruits());
        System.out.println(apricot1.getCostFruits());
        System.out.println(apricot2.getCostFruits());
        Apricot.printManufactureInfo();
        System.out.println("Общая стоимость отдельно проданных абрикосов " + apricot.resultPriceApricot());
        double resultPriceFruits = apple.resultPriceApple() + apple1.resultPriceApple() + apple2.resultPriceApple() + pear.resultPricePear() + pear1.resultPricePear() + pear2.resultPricePear() + apricot.resultPriceApricot() + apricot1.resultPriceApricot() + apricot2.resultPriceApricot();
        System.out.println("Общая стоимость всех проданных фруктов " + resultPriceFruits);
    }
}
