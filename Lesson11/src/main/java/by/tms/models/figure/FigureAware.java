package by.tms.models.figure;

import lombok.Getter;

public interface FigureAware {
    @Getter
    enum FigureType {
        LINE {
            @Override
            String getSquare() {
                return "Нельзя посчитать площадь";
            }
        },
        TRIANGLE {
            @Override
            String getSquare() {
                return null;
            }
        },
        RECTANGLE {
            @Override
            String getSquare() {
                return null;
            }
        };

        abstract String getSquare();
    }
}
