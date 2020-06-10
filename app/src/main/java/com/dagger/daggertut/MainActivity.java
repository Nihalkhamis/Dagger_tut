package com.dagger.daggertut;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Coffee coffee , coffee2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //manual DI (boilerplate)
//        Farm farm = new Farm();
//        River river = new River();
//
//        Coffee coffee = new Coffee(farm,river);

        //------------------------------------------------

        //DaggerCoffeeComponent is a generated class from dagger from the annotation to let it generate the coffeeCup from Coffee class
        //lma zawdt f el component module bya5od params el hwa el sugar w 7atito f el constructor bta3 el module f  mch hayfham a create() dy!

         //CoffeeComponent component = DaggerCoffeeComponent.create();


        //we'll update this line to get the component instance from MainApplication
         //CoffeeComponent component = DaggerCoffeeComponent.builder().sugar(2).milk(3).build();
         AppComponent component = ((MainApplication)getApplication()).getAppComponent();
      //  Log.d("TTT", "onCreate: "+component.getCoffee().getCoffeeCup());

        //zwdt el appComponent 3ashan arbot el coffeeComponent bel appComponent
      //  CoffeeComponent coffeeComponent = DaggerCoffeeComponent.builder().milk(4).sugar(2).appComponent(component).build();
        CoffeeComponent coffeeComponent = component.getCoffeeComponent().milk(4).sugar(2).build();
        //when i use coffee direct without the component
        coffeeComponent.inject(this);
        //this is boilerplate code so i'll use method injection instead and don't calling it here
        //coffee.connectElectricity();
        Log.d("TTT", "onCreate: "+coffee.getCoffeeCup() +
                "\n coffee1: "+ coffee+
                "\n coffee2: "+ coffee2+
                "\n river for coffee 1: " + coffee.river +
                "\n river for coffee 2: " + coffee2.river);
    }
}
