package com.slobodanyuk.xo.model;

import com.slobodanyuk.xo.model.exceptions.InvalidPointException;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class FieldTest {

    @Test
    void testGetSize() throws Exception {
        final Field field = new Field();
        assertEquals(3, field.getSize());
    }

    @Test
    void testSetFigure() throws Exception {
        final Field field = new Field();
        final Point point = new Point(0, 0);
        final Figure inputFigure = Figure.O;

        field.setFigure(point, inputFigure);
        final Figure actualFigure = field.getFigure(point);

        assertEquals(inputFigure, actualFigure);
    }

    @Test
    void testGetFigureWhenFigureIsNotSet() throws Exception {
        final Field field = new Field();
        final Point inputPoint = new Point(0, 0);

        final Figure actualFigure = field.getFigure(inputPoint);

        assertNull(actualFigure);
    }

    @Test
    void testGetFigureWhenXIsLessThenZero() throws Exception {
        final Field field = new Field();
        final Point inputPoint = new Point(-1, 0);

        try {
            final Figure actualFigure = field.getFigure(inputPoint);
            fail();
        } catch (final InvalidPointException e) {
        }
    }

    @Test
    void testGetFigureWhenYIsLessThenZero() throws Exception {
        final Field field = new Field();
        final Point inputPoint = new Point(0, -1);

        try {
            final Figure actualFigure = field.getFigure(inputPoint);
            fail();
        } catch (final InvalidPointException e) {
        }
    }

    @Test
    void testGetFigureWhenXIsMoreThenZero() throws Exception {
        final Field field = new Field();
        final Point inputPoint = new Point(field.getSize() + 1, 0);

        try {
            final Figure actualFigure = field.getFigure(inputPoint);
            fail();
        } catch (final InvalidPointException e) {
        }
    }

    @Test
    void testGetFigureWhenYIsMoreThenZero() throws Exception {
        final Field field = new Field();
        final Point inputPoint = new Point(0, field.getSize() + 1);

        try {
            final Figure actualFigure = field.getFigure(inputPoint);
            fail();
        } catch (final InvalidPointException e) {
        }
    }
}