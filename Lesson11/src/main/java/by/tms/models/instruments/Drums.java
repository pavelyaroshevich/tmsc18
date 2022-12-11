package by.tms.models.instruments;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Drums implements InstrumentsAware {
    private int size;

    @Override
    public void play() {
        System.out.println("Играют барабаны, размером - " + size);
    }
}
