package by.tms.models.figure;

import static by.tms.models.figure.FigureAware.*;

public class Figure {
    private FigureType figureType;

    public static Figure createFigure(FigureType figureType) {
        return switch (figureType) {
            case LINE -> new Line();
            case TRIANGLE -> new Triangle(4, 5);
            case RECTANGLE -> new Rectangle(2, 1);
        };
    }

    public FigureType[] getSquare(FigureType[] figureTypes) {
        for (int i = 0; i < figureTypes.length; i++) {
            figureTypes[i].getSquare();
        }
        return figureTypes;
    }
}