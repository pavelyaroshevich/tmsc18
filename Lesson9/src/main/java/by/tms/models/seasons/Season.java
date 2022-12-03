package by.tms.models.seasons;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Season {
    private SeasonType seasonType;
    private int favoriteSeason;
    private String info;

    public void getFavoriteSeason(SeasonType seasonType) {
        switch (seasonType) {
            case ЗИМА -> System.out.println("Я люблю зиму");
            case ВЕСНА -> System.out.println("Я люблю весну");
            case ЛЕТО -> System.out.println("Я люблю лето");
            case ОСЕНЬ -> System.out.println("Я люблю осень");
        }
    }

    public void getDescription(SeasonType seasonType) {
        if (seasonType == SeasonType.ЗИМА) {
            System.out.println("Холодное время года");
        } else {
            System.out.println("Теплое время года");
        }
    }

}
