package com.example.daggerexample.di.module;

import com.example.daggerexample.di.scope.ApplicationScope;
import com.example.daggerexample.entitys.Driver;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class DriverModule {
    @ApplicationScope
    @Provides
    Driver getDriver(){
        return new Driver();
    }
}
