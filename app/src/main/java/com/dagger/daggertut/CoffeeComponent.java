package com.dagger.daggertut;


import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Subcomponent;

@ActivityScope
//@Component(dependencies = AppComponent.class)
@Subcomponent
public interface CoffeeComponent {
    Coffee getCoffee();

    void inject(MainActivity mainActivity);

    //3ashan a3rf el DI en el builder da bta3 el component mch bta3ha
    @Subcomponent.Builder
    interface Builder {

        //lma dagger hat7tag ay int hata5od el kima dy
        @BindsInstance
        Builder sugar(@Sugar int sugar);

        @BindsInstance
        Builder milk(@Milk int milk);

        //3mlt da 3ashan yfhm eno haya5od el dependency el fo2 dy mn el appComponent
       // Builder appComponent(AppComponent appComponent);

        CoffeeComponent build();
    }
}
