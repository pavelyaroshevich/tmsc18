package by.tms.models.figure;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Triangle extends Figure implements FigureAware {
    private int width;
    private int height;

    @Override
    public FigureType getType() {
        return FigureType.TRIANGLE;
    }

    @Override
    public double getSquare() {
        return width * height * 0.5;
    }
}
