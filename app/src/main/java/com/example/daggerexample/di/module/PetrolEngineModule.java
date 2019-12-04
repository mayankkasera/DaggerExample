package com.example.daggerexample.di.module;

import com.example.daggerexample.entitys.Engine;
import com.example.daggerexample.entitys.PetrolEngine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public class PetrolEngineModule {

    public String hoursPower;

    public PetrolEngineModule(String hoursPower) {
        this.hoursPower = hoursPower;
    }

    @Provides
    public Engine provideEngine(){
        return new PetrolEngine(hoursPower);
    }

}
