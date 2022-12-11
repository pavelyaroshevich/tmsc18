package by.tms.models.spaceport;

public class SpacePort {
    public void start(IStart iStart) {
        if (iStart.checkSystem()) {
            iStart.startEngine();
            countDown();
            iStart.start();
        } else {
            System.out.println("Предстартовая проверка провалена");
        }
    }

    private void countDown() {
        System.out.println("10");
        System.out.println("9");
        System.out.println("8");
        System.out.println("7");
        System.out.println("6");
        System.out.println("5");
        System.out.println("4");
        System.out.println("3");
        System.out.println("2");
        System.out.println("1");
        System.out.println("Start");
    }
}
