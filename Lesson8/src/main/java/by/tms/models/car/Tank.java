package by.tms.models.car;

public class Tank {
    private int maxVolume;
    protected int currentVolume;

    public Tank(int maxVolume, int currentVolume) {
        this.maxVolume = maxVolume;
        this.currentVolume = currentVolume;
    }

    public void refill() {
        currentVolume = maxVolume;
        System.out.println("Авто заправлен");
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }
}
