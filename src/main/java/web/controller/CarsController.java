package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarsController {

    @Autowired
    private CarService carService;

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", required = false) String count, Model model) {
        if (count == null) {
            count = "0";
        }
        model.addAttribute("cars", carService.getCars(Integer.parseInt(count.trim())));
        return "cars";
    }
}
