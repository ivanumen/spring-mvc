package web.controller;

import web.model.Cars;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", required = false) String count, Model model) {
        List<Cars> cars = new ArrayList<>();
        Cars car1 = new Cars(1, "Toyta", "red");
        Cars car2 = new Cars(2, "Lamborgini", "blue");
        Cars car3 = new Cars(3, "Moskvich", "dark");
        Cars car4 = new Cars(4, "Syzyki", "green");
        Cars car5 = new Cars(5, "Maz", "orange");
        if (count == null) {
            count = "0";
        }
        switch (count) {
            case "1":
                cars.add(car1);
                break;
            case "2":
                cars.add(car1);
                cars.add(car2);
                break;
            case "3":
                cars.add(car1);
                cars.add(car2);
                cars.add(car3);
                break;
            case "4":
                cars.add(car1);
                cars.add(car2);
                cars.add(car3);
                cars.add(car4);
                break;
            default:
                cars.add(car1);
                cars.add(car2);
                cars.add(car3);
                cars.add(car4);
                cars.add(car5);
        }
        model.addAttribute("cars", cars);
        return "cars";
    }
}
