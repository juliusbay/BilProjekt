package org.example.bilprojekt.Controller;

import org.example.bilprojekt.Model.Car;
import org.example.bilprojekt.Repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller //Bruges til at definere for Springboot, at dette er controllerklassen
public class PageController {

    @Autowired
    CarRepository carRepo;

    @GetMapping("/") //Bruges til at oprette nye endpoints. www.url.dk/
    public String homePage (Model model){
        ArrayList<Car> carList = new ArrayList<>();
        carList.addAll(carRepo.getAllCars());

        model.addAttribute("carList", carList);

        return "HomePage";
    }

}
