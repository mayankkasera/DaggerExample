package com.example.daggerexample;

import android.app.Application;

import com.example.daggerexample.di.component.CarComponent;
import com.example.daggerexample.di.component.DaggerCarComponent;

public class App extends Application {

    private CarComponent carComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        carComponent = DaggerCarComponent.builder()
                .horsePower(100)
                .engineCapacity(200)
                .build();
    }

    public CarComponent getCarComponent() {
        return carComponent;
    }
}
