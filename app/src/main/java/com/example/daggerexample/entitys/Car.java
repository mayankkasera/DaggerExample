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

    @Inject
    public void enableRemote(Remote remote){
        remote.setListener(this);
    }


    public void drive(){
        engine.start();
        Log.i(TAG, "drive: ");
    }


}
