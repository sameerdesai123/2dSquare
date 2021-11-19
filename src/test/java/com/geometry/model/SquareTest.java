package com.geometry.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    Square inTopRightQuad = new Square(new int[]{0,0}, new int[]{2,0});
    Square inTopLeftQuad = new Square(new int[]{-2,0}, new int[]{0,0});
    Square getInTopRightQuadCopy = new Square(new int[]{0,0}, new int[]{2,0});

    @Test
    @DisplayName("return 0 when squares are identical")
    void compareToIdentical() {
        assertEquals(inTopRightQuad.compareTo(getInTopRightQuadCopy), 0);
    }

    @Test
    @DisplayName("return 1 when squares are not identical")
    void compareToDifferent() {
        assertEquals(inTopRightQuad.compareTo(inTopLeftQuad), 1);
    }
}