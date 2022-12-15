package by.tms.services.figure;

import by.tms.models.figure.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Figure> figures = new ArrayList<>();
        figures.add(Rectangle.builder().width(5).length(6).build());
        figures.add(Triangle.builder().width(10).height(6).build());
        figures.add(Line.builder().length(4).build());

        for (Figure figure : figures) {
            if (figure.getType() != FigureType.LINE) {
                printSquare(figure);
            } else {
                System.out.println("Нельзя высчитать площадь");
            }
        }
    }

    private static void printSquare(Figure figure) {
        System.out.println(figure.getType() + " Square = " + ((FigureAware) figure).getSquare());
    }
}