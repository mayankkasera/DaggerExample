package com.example.daggerexample.entitys;

import android.util.Log;

import javax.inject.Inject;

public class Car {

    private static final String TAG = "CarTag";

    private Engine engine;
    private Wheel wheel;

    @Inject
    public Car(Engine engine, Wheel wheel) {
        this.engine = engine;
        this.wheel = wheel;
    }



    public void drive(){
        Log.i(TAG, "drive: ");
    }


}
