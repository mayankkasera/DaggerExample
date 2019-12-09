package com.example.daggerexample.entitys;

import android.util.Log;

import com.example.daggerexample.di.scope.ActivityScope;

import javax.inject.Inject;

@ActivityScope
public class Car {

    private static final String TAG = "CarTag";

    private Engine engine;
    private Wheel wheel;
    private Driver driver;

    @Inject
    public Car(Driver driver,Engine engine, Wheel wheel) {
        this.engine = engine;
        this.wheel = wheel;
        this.driver = driver;
    }

    @Inject
    public void enableRemote(Remote remote){
        remote.setListener(this);
    }


    public void drive(){
        engine.start();
        Log.i(TAG, "drive: "+this+" "+this.driver+" "+this.engine +" "+this.wheel );
    }


}
