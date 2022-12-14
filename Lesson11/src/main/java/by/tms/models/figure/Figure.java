package by.tms.models.figure;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public abstract class Figure {
    public abstract FigureType getType();
}