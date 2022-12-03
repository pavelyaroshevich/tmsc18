package by.tms.models.seasons;

public enum SeasonType {
    ЗИМА(-10) {
        @Override
        public String getDescription() {
            return "Холодное время года";
        }
    },
    ВЕСНА(10),
    ЛЕТО(25),
    ОСЕНЬ(5);
    private int averageTemperature;

    public String getDescription() {
        return "Теплое время года";
    }

    SeasonType(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }
}
