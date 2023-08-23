package com.teachmeskills.hw08.exercise03;

public final class Circle extends Figure {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    double getArea() {
        return Math.PI * this.r * this.r;
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * this.r;
    }
}
