package com.dagger.daggertut;

import javax.inject.Inject;

public class River {

    //@Inject
    //if this class is for view only so we cannot write @inject on it
    public River() {
    }

    public String getWater(){
        return "water";
    }
}
