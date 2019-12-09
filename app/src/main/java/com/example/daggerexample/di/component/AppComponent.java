package com.example.daggerexample.di.component;

import com.example.daggerexample.di.module.DriverModule;
import com.example.daggerexample.di.scope.ActivityScope;
import com.example.daggerexample.di.scope.ApplicationScope;
import com.example.daggerexample.entitys.Driver;

import javax.inject.Singleton;

import dagger.Component;

@ApplicationScope
@Component(modules = DriverModule.class)
public interface AppComponent {

   ActivityComponent.Builder getActivityComponentBuilder();

}
