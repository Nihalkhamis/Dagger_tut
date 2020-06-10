package com.dagger.daggertut;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = RiverModule.class)
public interface AppComponent {
    //kda law fdlt shaghhala bel tari2a dy el code haykbr kol ama agy azwd 7aga hina fa hast5dm el subcomponent w hashil el farm mn hina
   // River getRiver();
   // Farm getFarm();

    CoffeeComponent.Builder getCoffeeComponent();
}
