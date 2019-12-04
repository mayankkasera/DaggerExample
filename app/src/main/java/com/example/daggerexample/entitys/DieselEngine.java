package com.example.daggerexample.entitys;

import android.util.Log;

import javax.inject.Inject;

public class DieselEngine implements Engine{

    private static final String TAG = "CarTag";


    @Inject
    public DieselEngine() {
    }

    @Override
    public void start() {
        Log.i(TAG, "DieselEngine start : ");
    }
}

