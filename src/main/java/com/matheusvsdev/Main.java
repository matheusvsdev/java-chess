package com.matheusvsdev;

import com.matheusvsdev.entities.PositionEntity;

public class Main {
    public static void main(String[] args) {
        PositionEntity position = new PositionEntity(3, 5);

        System.out.println(position);
    }
}