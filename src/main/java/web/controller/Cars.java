package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class Cars {
    @GetMapping(value = "/cars")
    public String printCars(Model model, @RequestParam(value = "count") int count) {
        model.addAttribute("cars", CarService.showCars(count));
        return "result";
    }
}
