package com.example.daggerexample.entitys;

import android.util.Log;

import javax.inject.Inject;

public class DieselEngine implements Engine{

    private static final String TAG = "CarTag";

    private int hoursPower;


    public DieselEngine(int hoursPower) {
        this.hoursPower = hoursPower;
    }

    @Override
    public void start() {
        Log.i(TAG, "DieselEngine start : "+ hoursPower);
    }
}

