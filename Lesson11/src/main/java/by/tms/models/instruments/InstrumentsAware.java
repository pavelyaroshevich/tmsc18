package by.tms.models.instruments;

public interface InstrumentsAware {
    String KEY = "До мажор";

    enum TypeOfInstruments {
        GUITAR, DRUMS, TRUMPET;
    }

    void play();
}
