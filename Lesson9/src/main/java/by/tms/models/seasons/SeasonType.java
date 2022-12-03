package by.tms.models.seasons;

public enum SeasonType {
    ЗИМА(-10, "я люблю зиму"), ВЕСНА(10, "я люблю весну"), ЛЕТО(25, "я люблю лето"), ОСЕНЬ(5, "я люблю осень");
    private final int averageTemperature;
    private String info;

    SeasonType(int averageTemperature, String info) {
        this.averageTemperature = averageTemperature;
        this.info = info;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    public String getInfo() {
        return info;
    }
}
