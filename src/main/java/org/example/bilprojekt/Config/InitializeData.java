package org.example.bilprojekt.Config;

import org.example.bilprojekt.Model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class InitializeData {
    public ArrayList<Car> carList = new ArrayList<>();


    public InitializeData(){
        carList.add(new Car("Volvo", 2012, "Sportsvogn", "Grå", "YK69420", "sportsvogn.webp",1));
        carList.add(new Car("Sedan", 2002, "Stationcar", "Grå", "1234200", "sedangrå.webp",2));
        carList.add(new Car("Thomas", 2002, "TankEngine", "Sort/blå", "6942069", "thomastog.jpg",3));
    }
}
