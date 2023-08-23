package com.teachmeskills.hw08.exercise03;

public sealed abstract class Figure permits Circle, Rectangle, Triangle {
    abstract double getArea();

    abstract double getPerimeter();
}
