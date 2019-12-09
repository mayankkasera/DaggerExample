package com.example.daggerexample.di.component;

import com.example.daggerexample.MainActivity;
import com.example.daggerexample.di.module.PetrolEngineModule;
import com.example.daggerexample.di.module.WheelModule;
import com.example.daggerexample.entitys.Car;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Binds;
import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component(modules = {WheelModule.class, PetrolEngineModule.class})
public interface CarComponent {

    Car getCar();

    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder{

        @BindsInstance
        Builder horsePower(@Named("horse power") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("engine capacity") int engineCapacity);


        CarComponent build();
    }




}
