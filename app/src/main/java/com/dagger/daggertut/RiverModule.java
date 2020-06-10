package com.dagger.daggertut;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class RiverModule {

    //int sugar;

//    public CoffeeModule(int sugar) {
//        this.sugar = sugar;
//    }

    //this method provides me an instance from river
    @Singleton
    @Provides
    River provideRiver(){
        return new River();
    }


//    //hina lma dagger t7tag ay int hatygy ta5od 2
//    @Provides
//    int provideSugar(){
//        return sugar;
//    }
}
