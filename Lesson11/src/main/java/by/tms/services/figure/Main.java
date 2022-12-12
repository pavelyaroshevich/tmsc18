package by.tms.services.figure;

import by.tms.models.figure.Figure;

import static by.tms.models.figure.FigureAware.FigureType;
import static by.tms.models.figure.FigureAware.FigureType.RECTANGLE;
import static by.tms.models.figure.FigureAware.FigureType.TRIANGLE;

public class Main {
    public static void main(String[] args) {
        FigureType[] figureTypes = {RECTANGLE, TRIANGLE};
        Figure figure = new Figure();
        figure.getSquare(figureTypes);
    }
}
