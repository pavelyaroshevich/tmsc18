package by.tms.models.figure;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Rectangle extends Figure implements FigureAware {
    private int length;
    private int width;

    @Override
    public FigureType getType() {
        return FigureType.RECTANGLE;
    }

    @Override
    public double getSquare() {
        return length * width;
    }
}
