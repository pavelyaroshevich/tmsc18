package by.tms.services.instuments;

import by.tms.models.instruments.Drums;
import by.tms.models.instruments.Guitar;
import by.tms.models.instruments.InstrumentsAware;
import by.tms.models.instruments.Trumpet;

import static by.tms.models.instruments.InstrumentsAware.*;

public class Main {
    public static void main(String[] args) {
        InstrumentsAware[] instrumentsAwares = {createInstrument(TypeOfInstruments.GUITAR, 6), createInstrument(TypeOfInstruments.DRUMS, 10), createInstrument(TypeOfInstruments.GUITAR, 4)};
        for (int i = 0; i < instrumentsAwares.length; i++) {
            instrumentsAwares[i].play();
        }
    }

    private static InstrumentsAware createInstrument(TypeOfInstruments typeOfInstruments, int parameter) {
        return switch (typeOfInstruments) {
            case GUITAR -> new Guitar(parameter);
            case DRUMS -> new Drums(parameter);
            case TRUMPET -> new Trumpet(parameter);
        };
    }
}
