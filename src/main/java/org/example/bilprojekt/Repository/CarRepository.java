package org.example.bilprojekt.Repository;

import org.example.bilprojekt.Config.InitializeData;
import org.example.bilprojekt.Model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class CarRepository {

    @Autowired
    InitializeData init;

    public ArrayList<Car> getAllCars(){
        return init.carList;
    }
}
