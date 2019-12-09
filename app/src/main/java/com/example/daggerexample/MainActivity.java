package com.example.daggerexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.daggerexample.di.component.CarComponent;
import com.example.daggerexample.di.component.DaggerCarComponent;
import com.example.daggerexample.entitys.Car;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    public Car car1,car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent carComponent1 = ((App)(getApplication())).getCarComponent();
        CarComponent carComponent2 = ((App)(getApplication())).getCarComponent();

        car1 = carComponent1.getCar();
        car2 = carComponent2.getCar();

        car1.drive();
        car2.drive();
    }


}
