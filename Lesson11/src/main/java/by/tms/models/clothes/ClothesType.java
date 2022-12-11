package by.tms.models.clothes;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ClothesType {
    XXS(32) {
        @Override
        public String getDescription() {
            return "child size";
        }
    },
    XS(34),
    S(36),
    M(38),
    L(40);
    private int euroSize;

    public String getDescription() {
        return "adult size";
    }
}
