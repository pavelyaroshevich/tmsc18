package by.tms.services.robot;

import by.tms.models.robot.*;
import by.tms.robot.hand.SamsungHand;
import by.tms.robot.hand.SonyHand;
import by.tms.robot.hand.ToshibaHand;
import by.tms.robot.head.SamsungHead;
import by.tms.robot.head.SonyHead;
import by.tms.robot.head.ToshibaHead;
import by.tms.robot.legs.SamsungLeg;
import by.tms.robot.legs.SonyLeg;
import by.tms.robot.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например, у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */

        IRobot robot = new Robot(new ToshibaHead(20), new SonyHand(15), new SamsungLeg(5));
        robot.action();
        System.out.println("Стоимость робота - " + robot.getPrice());
        System.out.println("________________");
        IRobot robot1 = new Robot(new SonyHead(25), new ToshibaHand(20), new SonyLeg(10));
        robot1.action();
        System.out.println("Стоимость робота - " + robot1.getPrice());
        System.out.println("________________");
        IRobot robot2 = new Robot(new SamsungHead(30), new SamsungHand(10), new ToshibaLeg(7));
        robot2.action();
        System.out.println("Стоимость робота - " + robot2.getPrice());
    }
}

