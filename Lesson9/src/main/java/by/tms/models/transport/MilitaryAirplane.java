package by.tms.models.transport;

public class MilitaryAirplane extends AirTransport {
    private int countOfRocket;
    private boolean haveEjection;

    public MilitaryAirplane(int power, int maxSpeed, int weight, String name, int wingspan, int minStripLength, int countOfRocket, boolean haveEjection) {
        super(power, maxSpeed, weight, name, wingspan, minStripLength);
        this.countOfRocket = countOfRocket;
        this.haveEjection = haveEjection;
    }

    public String getInfo() {
        return toString() +
                ", Размах крыльев - " + getWingspan() +
                ", Минимальная длина взлётно-посадочной полосы для взлёта - " + getMinStripLength() +
                ", Наличие катапультирования - " + isHaveEjection() +
                ", Количество ракет - " + getCountOfRocket() +
                ", Мощность в киловаттах - " + convertPower();
    }

    public void shot() {
        if (getCountOfRocket() != 0) {
            System.out.println("Ракета пошла");
        } else {
            System.out.println("Боеприпасы отсутствуют");
        }
    }

    public void checkEjection() {
        if (isHaveEjection()) {
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У вас нет такой системы");
        }
    }


    public int getCountOfRocket() {
        return countOfRocket;
    }

    public boolean isHaveEjection() {
        return haveEjection;
    }
}
