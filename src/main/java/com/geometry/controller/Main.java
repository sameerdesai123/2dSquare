package com.geometry.controller;

import com.geometry.model.Square;

public class Main {
    public static void main(String[] args) {
        Square inTopRightQuad = new Square(new int[]{0,0}, new int[]{2,0});
        Square inTopLeftQuad = new Square(new int[]{-2,0}, new int[]{0,0});
        Square inTopRightQuadCopy = new Square(new int[]{0,0}, new int[]{2,0});
        boolean differentSquares = inTopLeftQuad.compareTo(inTopRightQuad) == 0;
        boolean identicalSquares = inTopRightQuadCopy.compareTo(inTopRightQuad) == 0;

        System.out.println("Comparing different Squares:" + differentSquares);
        System.out.println("Comparing identical Squares:" + identicalSquares);
    }
}
