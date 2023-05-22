package Grupo.TareaAutos.Controller;

import Grupo.TareaAutos.Model.Car;

import Grupo.TareaAutos.Service.CarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Arrays;

@RestController
@CrossOrigin(origins = "http://localhost:8081")
public class CarController {


    @RequestMapping("/generar")

    @ResponseBody
    public List<Car> listCars(@RequestParam("cantidad") int cantidad) {
        return CarService.generarAutoRandom(cantidad);
    }


}