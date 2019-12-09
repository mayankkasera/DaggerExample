package com.example.daggerexample.di.module;

import com.example.daggerexample.entitys.DieselEngine;
import com.example.daggerexample.entitys.Engine;

import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {

    int hoursPower;

    public DieselEngineModule(int hoursPower) {
        this.hoursPower = hoursPower;
    }

    @Provides
    public Engine getDieselEngin(){
        return new DieselEngine(hoursPower);
    }

}
