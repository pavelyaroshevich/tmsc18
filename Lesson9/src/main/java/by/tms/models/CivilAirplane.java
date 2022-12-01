package by.tms.models;

public class CivilAirplane extends AirTransport {
    private int maxCountOfPassenger;
    private boolean haveBusinesses;

    public CivilAirplane(int power, int maxSpeed, int weight, String name, int wingspan, int minStripLength, int maxCountOfPassenger, boolean haveBusinesses) {
        super(power, maxSpeed, weight, name, wingspan, minStripLength);
        this.maxCountOfPassenger = maxCountOfPassenger;
        this.haveBusinesses = haveBusinesses;
    }

    public String getInfo() {
        return "Мощность - " + getPower() +
                ", Максимальная скорость - " + getMaxSpeed() +
                ", Вес - " + getWeight() +
                ", Модель - " + getName() +
                ", Размах крыльев - " + getWingspan() +
                ", Минимальная длина взлётно-посадочной полосы для взлёта - " + getMinStripLength() +
                ", Наличие бизнес-класса - " + isHaveBusinesses() +
                ", Количество пассажиров - " + getMaxCountOfPassenger() +
                ", Мощность в киловаттах - " + convertPower();
    }

    public void checkMaxPassenger(int passenger) {
        if (passenger <= getMaxCountOfPassenger()) {
            System.out.println("Самолёт загружен пассажирами");
        } else {
            System.out.println("Вам нужен самолёт побольше");
        }
    }

    public int getMaxCountOfPassenger() {
        return maxCountOfPassenger;
    }

    public boolean isHaveBusinesses() {
        return haveBusinesses;
    }
}
