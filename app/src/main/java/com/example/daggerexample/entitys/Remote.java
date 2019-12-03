package com.example.daggerexample.entitys;

import android.util.Log;

import javax.inject.Inject;

public class Remote {

    private static final String TAG = "CarTag";

    @Inject
    public Remote() {
    }

    public void setListener(Car car){
        Log.i(TAG, "Remote Connected !... ");
    }


}
