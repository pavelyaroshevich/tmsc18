package by.tms.models.seasons;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Season {
    private SeasonType seasonType;
    private SeasonType favoriteSeason;

    public void myFavoriteSeason() {
        System.out.println("Моя любимая пора года - " + favoriteSeason);
    }

    public void getInfoAboutSeason(SeasonType seasonType) {
        switch (seasonType) {
            case ЗИМА -> System.out.println("Я люблю зиму");
            case ВЕСНА -> System.out.println("Я люблю весну");
            case ЛЕТО -> System.out.println("Я люблю лето");
            case ОСЕНЬ -> System.out.println("Я люблю осень");
        }
    }
}
