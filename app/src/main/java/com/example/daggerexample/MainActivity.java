package com.example.daggerexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.daggerexample.di.component.CarComponent;
import com.example.daggerexample.di.component.DaggerCarComponent;
import com.example.daggerexample.entitys.Car;

public class MainActivity extends AppCompatActivity {

    public Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent carComponent = DaggerCarComponent.create();
        car = carComponent.getCar();
        car.drive();
    }


}
