package com.example.daggerexample.di.component;

import com.example.daggerexample.entitys.Car;

import dagger.Component;

@Component
public interface CarComponent {
       Car getCar();
}
