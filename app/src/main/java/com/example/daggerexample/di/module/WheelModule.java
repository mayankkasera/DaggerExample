package com.example.daggerexample.di.module;

import com.example.daggerexample.entitys.Rim;
import com.example.daggerexample.entitys.Tires;
import com.example.daggerexample.entitys.Wheel;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelModule {

    @Provides
    static Rim provideRim(){
        return new Rim();
    }

    @Provides
    static Tires provideTires(){
        return new Tires();
    }

    @Provides
    static Wheel provideWheel(Rim rim,Tires tires){
        return new Wheel(rim,tires);
    }

}
