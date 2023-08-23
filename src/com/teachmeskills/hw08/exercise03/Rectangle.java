package com.teachmeskills.hw08.exercise03;

public final class Rectangle extends Figure {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    double getArea() {
        return this.sideA * this.sideB;
    }

    @Override
    double getPerimeter() {
        return 2 * this.sideA + 2 * this.sideB;
    }
}
