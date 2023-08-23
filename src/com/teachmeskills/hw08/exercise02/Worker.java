package com.teachmeskills.hw08.exercise02;

public class Worker implements Employable {
    private String position = "рабочий";

    @Override
    public void getPosition() {
        System.out.println(this.position);
    }
}
