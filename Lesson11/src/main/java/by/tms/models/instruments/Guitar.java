package by.tms.models.instruments;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Guitar implements InstrumentsAware {
    private int countOfStrings;

    @Override
    public void play() {
        System.out.println("Играет гитара, с количеством струн - " + countOfStrings);
    }
}
