package com.teachmeskills.hw08.exercise02;

public class Accountant implements Employable {
    private String position = "бухгалтер";

    @Override
    public void getPosition() {
        System.out.println(this.position);
    }
}
