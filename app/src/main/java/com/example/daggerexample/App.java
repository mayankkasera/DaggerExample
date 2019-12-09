package com.example.daggerexample;

import android.app.Application;
import com.example.daggerexample.di.component.AppComponent;
import com.example.daggerexample.di.component.DaggerAppComponent;

public class App extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.create();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
