package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;

@Controller
public class CarsController {

    private final CarServiceImpl carServiceImpl;

    public CarsController(CarServiceImpl carServiceImpl) {
        this.carServiceImpl = carServiceImpl;
    }

    @GetMapping("/cars")
    public String printCars(Model model, @RequestParam(required = false) Integer count) {
        model.addAttribute("carList", carServiceImpl.getCars(count == null ? Integer.MAX_VALUE : count));
        return "cars";
    }
}
