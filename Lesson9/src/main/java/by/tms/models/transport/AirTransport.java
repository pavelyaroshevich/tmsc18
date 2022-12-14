package by.tms.models.transport;

abstract class AirTransport extends Transport {
    private int wingspan;
    private int minStripLength;

    public AirTransport(int power, int maxSpeed, int weight, String name, int wingspan, int minStripLength) {
        super(power, maxSpeed, weight, name);
        this.wingspan = wingspan;
        this.minStripLength = minStripLength;
    }

    public int getWingspan() {
        return wingspan;
    }

    public int getMinStripLength() {
        return minStripLength;
    }
}
