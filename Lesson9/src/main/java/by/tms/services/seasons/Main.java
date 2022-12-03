package by.tms.services.seasons;

import by.tms.models.seasons.Season;
import by.tms.models.seasons.SeasonType;

import static by.tms.models.seasons.SeasonType.*;

public class Main {
    public static void main(String[] args) {
        Season season = new Season();
        season.setFavoriteSeason(ЗИМА);
        season.myFavoriteSeason();
        System.out.println("____________________________");
        season.getInfoAboutSeason(ЗИМА);
        season.getInfoAboutSeason(ВЕСНА);
        System.out.println("____________________________");
        season.setSeasonType(ЗИМА);
        System.out.println(season.getSeasonType().getDescription());
        System.out.println("____________________________");
        season.setSeasonType(ЛЕТО);
        System.out.println(season.getSeasonType().getDescription());
        System.out.println("____________________________");
        for (SeasonType seasonType : SeasonType.values()) {
            System.out.println(seasonType.name());
            System.out.println(seasonType.getAverageTemperature());
            System.out.println(seasonType.getDescription());
        }
    }
}
