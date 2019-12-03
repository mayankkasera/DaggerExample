package com.example.daggerexample.di.module;

import com.example.daggerexample.entitys.Engine;
import com.example.daggerexample.entitys.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    @Binds
    public abstract Engine bindEngine(PetrolEngine engine);

}
