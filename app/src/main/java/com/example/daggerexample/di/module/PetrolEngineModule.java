package com.example.daggerexample.di.module;

import com.example.daggerexample.entitys.Engine;
import com.example.daggerexample.entitys.PetrolEngine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine bindEngine(PetrolEngine engine);
}
