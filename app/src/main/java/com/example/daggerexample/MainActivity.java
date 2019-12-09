package com.example.daggerexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.daggerexample.di.component.ActivityComponent;
import com.example.daggerexample.di.component.AppComponent;
import com.example.daggerexample.di.module.DieselEngineModule;
import com.example.daggerexample.entitys.Car;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    public Car car1,car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ActivityComponent activityComponent = ((App)(getApplication())).getAppComponent()
                .getActivityComponent(new DieselEngineModule(100));



        car1 = activityComponent.getCar();
        car2 = activityComponent.getCar();

        car1.drive();
        car2.drive();
    }


}
