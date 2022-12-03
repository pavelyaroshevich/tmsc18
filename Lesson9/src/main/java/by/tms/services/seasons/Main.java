package by.tms.services.seasons;

import by.tms.models.seasons.Season;
import by.tms.models.seasons.SeasonType;

import static by.tms.models.seasons.SeasonType.ЗИМА;
import static by.tms.models.seasons.SeasonType.ЛЕТО;

public class Main {
    public static void main(String[] args) {
        Season season = new Season();
        season.getFavoriteSeason(ЗИМА);
        season.getDescription(ЛЕТО);
        for (SeasonType value : SeasonType.values()) {
            System.out.println(value.name());
            System.out.println(value.getInfo());
            System.out.println(value.getAverageTemperature());
        }
    }
}
