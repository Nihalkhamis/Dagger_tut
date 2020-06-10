package com.dagger.daggertut;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
class Farm {

    @Inject
    public Farm() {
    }

    public String getBeans(){
        return "beans";
    }
}
