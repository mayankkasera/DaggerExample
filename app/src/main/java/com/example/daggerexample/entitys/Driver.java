package com.example.daggerexample.entitys;

import javax.inject.Inject;
import javax.inject.Singleton;


public class Driver {

    public String name;

    public Driver(String name) {
        this.name = name;
    }
}
