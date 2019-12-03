package com.example.daggerexample.entitys;

import android.util.Log;

import javax.inject.Inject;

public class PetrolEngine implements Engine{

    private static final String TAG = "CarTag";

    @Inject
    public PetrolEngine() {
    }

    @Override
    public void start() {
        Log.i(TAG, "PetrolEngine start: ");
    }
}
