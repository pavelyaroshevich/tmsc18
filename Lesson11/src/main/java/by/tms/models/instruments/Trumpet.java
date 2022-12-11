package by.tms.models.instruments;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Trumpet implements InstrumentsAware {
    private int diameter;

    @Override
    public void play() {
        System.out.println("Играет труба, с диаметром - " + diameter);
    }
}
