package com.example.daggerexample.di.component;

import com.example.daggerexample.MainActivity;
import com.example.daggerexample.di.module.WheelModule;
import com.example.daggerexample.entitys.Car;

import dagger.Component;

@Component(modules = WheelModule.class)
public interface CarComponent {

    Car getCar();

    void inject(MainActivity mainActivity);


}
