package com.geometry.model;

import java.util.Arrays;

public class Square implements Comparable<Square>{
    int[] bottomLeft, bottomRight;
    int side;

    public Square(int[] bottomLeft, int[] bottomRight) {
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }

    @Override
    public int compareTo(Square other) {
        return Arrays.equals(this.bottomLeft, other.bottomLeft) &&
                Arrays.equals(this.bottomRight, other.bottomRight) ? 0 : 1;
    }

    public int getSide() {
        return side == 0? (int) Math.sqrt(Math.pow((bottomRight[0]-bottomLeft[0]), 2) +
                Math.pow((bottomRight[1]-bottomLeft[1]), 2)) : this.side;
    }

    public double getArea() {
        return Math.pow(getSide(), 2);
    }
}
