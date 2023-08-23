package com.teachmeskills.hw08.exercise01;

public class Exercise01 {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle(3, 4, 5),
                new Circle(6),
                new Rectangle(4, 8),
                new Triangle(7, 3, 6),
                new Circle(3),
        };

        double sum = 0;
        for (Figure figure : figures) {
            double area = figure.getArea();
            sum += figure.getPerimeter();
            System.out.println("Площадь фигуры равна: " + String.format("%.2f", area));
        }

        System.out.println("Сумма периметров всех фигур равна: " + String.format("%.2f", sum));
    }
}
