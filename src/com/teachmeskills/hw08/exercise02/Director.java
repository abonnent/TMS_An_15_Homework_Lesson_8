package com.teachmeskills.hw08.exercise02;

public class Director implements Employable {
    private String position = "директор";

    @Override
    public void getPosition() {
        System.out.println(this.position);
    }
}
