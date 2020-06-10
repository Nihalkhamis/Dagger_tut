package com.dagger.daggertut;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

@ActivityScope
public class Coffee {

    @Inject
     Farm farm;

     River river;

     int sugar;

     int milk;


    //i made this annotation to let CoffeeComponent knows what coffeeCup will bring
    //CoffeeComponent will inject this coffeeCup
    //-------------------------------------------------------------------------------------------
    @Inject
    //this method is constructor injection
//    public Coffee(Farm farm, River river) {
//        this.farm = farm;
//        this.river = river;
//    }
    //this method is field injection
   // public  Coffee(River river, @Named("sugar") int sugar,@Named("milk") int milk){
    public  Coffee(River river, @Sugar int sugar,@Milk int milk){
        this.river = river;
        this.sugar = sugar;
        this.milk = milk;
    }

    @Inject
    public void connectElectricity(){
        Log.d("TTT", "connectElectricity: "+"connecting....");
    }

    public String getCoffeeCup(){
        return farm.getBeans() + "+" + river.getWater() +" sugar: "+sugar +" milk: "+milk;
    }
}
