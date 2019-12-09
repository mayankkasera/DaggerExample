package com.example.daggerexample.di.component;

import com.example.daggerexample.MainActivity;
import com.example.daggerexample.di.module.DieselEngineModule;
import com.example.daggerexample.di.module.PetrolEngineModule;
import com.example.daggerexample.di.module.WheelModule;
import com.example.daggerexample.di.scope.ActivityScope;
import com.example.daggerexample.entitys.Car;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Subcomponent;

@ActivityScope
@Subcomponent(modules = {WheelModule.class, DieselEngineModule.class})
public interface ActivityComponent {

    Car getCar();

    void inject(MainActivity mainActivity);



//    @Component.Builder
//    interface Builder{
//
//        @BindsInstance
//        Builder horsePower(@Named("horse power") int horsePower);
//
//        @BindsInstance
//        Builder engineCapacity(@Named("engine capacity") int engineCapacity);
//
//        Builder appComponent(AppComponent appComponent);
//
//        ActivityComponent build();
//
//    }




}
