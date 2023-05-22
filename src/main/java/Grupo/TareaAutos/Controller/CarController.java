package Grupo.TareaAutos.Controller;

import Grupo.TareaAutos.Model.Car;
import Grupo.TareaAutos.Service.CarService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Arrays;

@RestController

public class CarController {

    @RequestMapping("/cars")
    @CrossOrigin(origins = "http://localhost:8081")
    public List<Car> getAllCars() {
        return Arrays.asList(
                new Car(1L, "marca1", 2222, "color1", 10000, false, "s", 1, false, 1),
                new Car(2L, "marca2", 2222, "color2", 10000, false, "s", 2, false, 1),
                new Car(3L, "marca3", 2222, "color3", 10000, false, "s", 2, false, 1),
                new Car(4L, "marca4", 2222, "color4", 10000, false, "s", 1, false, 1),
                new Car(5L, "marca5", 2222, "color5", 10000, false, "s", 1, false, 1),
                new Car(6L, "marca5", 2222, "color5", 10000, false, "s", 1, false, 1)
        );
    }


    @PostMapping("/ejemplo")
    public ResponseEntity<String> manejarSolicitudPost() {
        // Lógica para manejar la solicitud POST
        // Puedes acceder a los datos del objeto y realizar operaciones

        // Devolver una respuesta
        return ResponseEntity.ok("Solicitud POST recibida");
    }

    @RequestMapping("/generar")
    @ResponseBody
    public List<Car> listCars(@RequestParam("cantidad") int cantidad) {
        return CarService.generarAutoRandom(cantidad);
    }



}
