package com.teachmeskills.hw08.exercise02;

public class Exercise02 {
    public static void main(String[] args) {
        Employable[] employees = {
                new Director(),
                new Worker(),
                new Accountant(),
        };

        for (Employable employee : employees) {
            employee.getPosition();
        }
    }
}
