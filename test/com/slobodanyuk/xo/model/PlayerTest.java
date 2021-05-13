package com.slobodanyuk.xo.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void getName() {
        final String testValue = "Ilya";
        final String expectedValue = "Ilya";

        final Player player = new Player(testValue, null);
        final String actualValue = player.getName();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    void getFigure() {
        final Figure testValue = Figure.X;
        final Figure expectedValue = Figure.X;

        final Player player = new Player(null, testValue);
        final Figure actualValue = player.getFigure();
        assertEquals(expectedValue, actualValue);
    }
}