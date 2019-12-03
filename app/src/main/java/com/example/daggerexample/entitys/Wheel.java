package com.example.daggerexample.entitys;

import javax.inject.Inject;

public class Wheel {

    private Rim rim;
    private Tires tires;

    public Wheel(Rim rim, Tires tires) {
        this.rim = rim;
        this.tires = tires;
    }
}
