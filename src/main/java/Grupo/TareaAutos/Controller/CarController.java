package Grupo.TareaAutos.Controller;

import Grupo.TareaAutos.Model.Car;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Arrays;

@RestController

public class CarController {

    @RequestMapping("/cars")
    public List<Car> getAllCars() {
        return Arrays.asList(
                new Car(1L, "marca1", "2222", "color1", 10000, false, "s", false, false, 0),
                new Car(2L, "marca2", "2222", "color2", 10000, false, "s", false, false, 0),
                new Car(3L, "marca3", "2222", "color3", 10000, false, "s", false, false, 0),
                new Car(4L, "marca4", "2222", "color4", 10000, false, "s", false, false, 0),
                new Car(5L, "marca5", "2222", "color5", 10000, false, "s", false, false, 0)
        );
    }


}
