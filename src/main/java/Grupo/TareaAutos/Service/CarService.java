package Grupo.TareaAutos.Service;

import Grupo.TareaAutos.Model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class CarService {


    public static List<Car> generarAutoRandom(int cantidad) {
        List<String> marcas = Arrays.asList("Kia", "Nissan", "Toyota", "Peugeot", "Bmw", "Opel", "Audi", "Chevrolet", "Ford", "GMC");
        List<String> colores = Arrays.asList("Azul", "Blanco", "Negro", "Naranja", "Gris", "Verde","Rojo","Amarillo","Purpura");
        List<String> tipos = Arrays.asList("Sedan", "Camioneta", "SUV");
        List<String> motoresSedan = Arrays.asList("1.4cc", "1.6cc", "2.0cc");
        List<String> motoresCamioneta = Arrays.asList("2.4cc", "3.0cc", "4.0cc");
        List<String> motoresSUV = Arrays.asList("1.8cc", "2.2cc", "2.8cc");
        List<Car> autosGenerados = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < cantidad; i++) {
            Car auto = new Car();
            auto.setID((long) (i + 1));
            auto.setMarca(marcas.get(random.nextInt(marcas.size())));
            auto.setAño(random.nextInt(9) + 2015);
            auto.setColor(colores.get(random.nextInt(colores.size())));
            auto.setPrecio(random.nextInt(22000001) + 8000000);
            auto.setTurbo(random.nextBoolean());
            auto.setTipo(tipos.get(random.nextInt(tipos.size())));
            if (auto.getTipo().equals("Sedan")) {
                auto.setMotor(motoresSedan.get(random.nextInt(motoresSedan.size())));
            } else if (auto.getTipo().equals("Camioneta")) {
                auto.setMotor(motoresCamioneta.get(random.nextInt(motoresCamioneta.size())));
                auto.setCabinas(random.nextInt(2) + 1);
            } else if (auto.getTipo().equals("SUV")) {
                auto.setMotor(motoresSUV.get(random.nextInt(motoresSUV.size())));
                auto.setSunroof(random.nextBoolean());
            }
            auto.setPopularidad(0);

            autosGenerados.add(auto);

        }
        return autosGenerados;
    }


}
